package land.gno.gobridge;

import android.util.Log;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import gnolang.gno.gnomobile.Gnomobile;
import gnolang.gno.gnomobile.Bridge;
import gnolang.gno.gnomobile.BridgeConfig;

import io.grpc.Channel;
import android.net.LocalSocketAddress.Namespace;

import io.grpc.StatusRuntimeException;
import land.gno.gnomobile.v1.GnomobileServiceGrpc;
import land.gno.gnomobile.v1.Rpc;
import land.gno.gnomobile.v1.Gnomobiletypes;
import land.gno.udschannel.UdsChannelBuilder;

public class GoBridgeModule extends ReactContextBaseJavaModule {
    private final static String TAG = "GoBridge";
    private final ReactApplicationContext reactContext;
    private final File rootDir;
    private String socketPath;
    private GnomobileServiceGrpc.GnomobileServiceBlockingStub blockingStub;
    private static Bridge bridgeGnomobile = null;

    public GoBridgeModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;

        rootDir = new File(new land.gno.rootdir.RootDirModule(reactContext).getRootDir());
    }

    @Override
    public String getName() {
        return "GoBridge";
    }

    //////////////
    // Protocol //
    //////////////

    @ReactMethod
    public void initBridge(Promise promise) {
        try {
            final BridgeConfig config = Gnomobile.newBridgeConfig();
            if (config == null) {
                throw new Exception("");
            }

            config.setRootDir(rootDir.getAbsolutePath());

            bridgeGnomobile = Gnomobile.newBridge(config);

            socketPath = bridgeGnomobile.getSocketPath();

            Channel channel = UdsChannelBuilder.forPath(socketPath, Namespace.FILESYSTEM).build();
            blockingStub = GnomobileServiceGrpc.newBlockingStub(channel);

            promise.resolve(true);
        } catch (Exception err) {
            promise.reject(err);
        }
    }

    @ReactMethod
    public void closeBridge(Promise promise) {
        try {
            if (bridgeGnomobile != null) {
                bridgeGnomobile.close();
                bridgeGnomobile = null;
            }
            promise.resolve(true);
        } catch (Exception err) {
            promise.reject(err);
        }
    }

    @ReactMethod
    public void listKeyInfo(Promise promise) {
        Rpc.ListKeyInfo.Request request = Rpc.ListKeyInfo.Request.newBuilder()
            .build();
        Rpc.ListKeyInfo.Reply reply;
        try {
            reply = blockingStub.listKeyInfo(request);
        } catch (StatusRuntimeException e) {
            Log.d(TAG, String.format("RPC listKeyInfo failed: {%s}", e.getStatus()));
            promise.reject(e);
            return;
        }

        List<Rpc.KeyInfo> listKey = reply.getKeysList();
        WritableArray promiseArray= Arguments.createArray();
        for(int i=0;i<listKey.size();i++){
            promiseArray.pushString(listKey.get(i).getName());
        }

        promise.resolve(promiseArray);
    }

    @ReactMethod
    public void createAccount(String nameOrBech32, String mnemonic, String bip39Passwd, String password, int account, int index, Promise promise) {
        Rpc.CreateAccount.Request request = Rpc.CreateAccount.Request.newBuilder()
            .setNameOrBech32(nameOrBech32)
            .setMnemonic(mnemonic)
            .setBip39Passwd(bip39Passwd)
            .setPassword(password)
            .setAccount(account)
            .setIndex(index)
            .build();

        Rpc.CreateAccount.Reply reply;
        try {
            reply = blockingStub.createAccount(request);
        } catch (StatusRuntimeException e) {
            Log.d(TAG, String.format("RPC createAccount failed: {%s}", e.getStatus()));
            promise.reject(e);
            return;
        }

        // TODO: send the whole Key struct
        promise.resolve(reply.getKey().getAddress().toString());
    }

    @ReactMethod
    public void selectAccount(String nameOrBech32, Promise promise) {
        Rpc.SelectAccount.Request request = Rpc.SelectAccount.Request.newBuilder()
            .setNameOrBech32(nameOrBech32)
            .build();

        Rpc.SelectAccount.Reply reply;
        try {
            reply = blockingStub.selectAccount(request);
        } catch (StatusRuntimeException e) {
            Log.d(TAG, String.format("RPC selectAccount failed: {%s}", e.getStatus()));
            promise.reject(e);
            return;
        }
        promise.resolve(reply.getKey().getAddress().toString());
    }

    @ReactMethod
    public void call(String packagePath, String fnc, ReadableArray args, String gasFee, int gasWanted, String password, Promise promise) {
        List<String> argList = new ArrayList<>();
        for (int i = 0; i < args.size(); i++) {
            argList.add(args.getString(i));
        }

        Gnomobiletypes.Call_Request request = Gnomobiletypes.Call_Request.newBuilder()
            .setPackagePath(packagePath)
            .setFnc(fnc)
            .addAllArgs(argList)
            .setGasFee(gasFee)
            .setGasWanted(gasWanted)
            .setPassword(password)
            .build();

        Gnomobiletypes.Call_Reply reply;
        try {
            reply = blockingStub.call(request);
        } catch (StatusRuntimeException e) {
            Log.d(TAG, String.format("RPC call failed: {%s}", e.getStatus()));
            promise.reject(e);
            return;
        }
        promise.resolve(reply.getResult().toString());
    }

    @ReactMethod
    public void exportJsonConfig(Promise promise) {
        try {
//            promise.resolve(Gnomobile.exportJsonConfig(rootDir.getAbsolutePath()));
            promise.resolve("{}");
        } catch (Exception err) {
            promise.reject(err);
        }
    }

    @Override
    public void finalize() {
        try {
        } catch (Exception e) {
        }
    }
}
