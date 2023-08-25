package land.gno.gobridge;

import android.util.Log;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.io.File;

import gnoland.gno.gnomobile.Gnomobile;

public class GoBridgeModule extends ReactContextBaseJavaModule {
    private final static String TAG = "GoBridge";
    private final ReactApplicationContext reactContext;
    private final File rootDir;

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
            promise.resolve(true);
        } catch (Exception err) {
            promise.reject(err);
        }
    }

    @ReactMethod
    public void closeBridge(Promise promise) {
        try {
            promise.resolve(true);
        } catch (Exception err) {
            promise.reject(err);
        }
    }

    @ReactMethod
    public void hello(String name, Promise promise) {
        promise.resolve(Gnomobile.hello(rootDir.getAbsolutePath()));
    }

    @Override
    public void finalize() {
        try {
        } catch (Exception e) {
        }
    }
}
