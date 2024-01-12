// @generated by protoc-gen-connect-es v1.3.0
// @generated from file rpc.proto (package land.gno.gnonative.v1, syntax proto3)
/* eslint-disable */
// @ts-nocheck

import { AddressFromBech32Request, AddressFromBech32Response, AddressToBech32Request, AddressToBech32Response, CallRequest, CallResponse, CreateAccountRequest, CreateAccountResponse, DeleteAccountRequest, DeleteAccountResponse, GenerateRecoveryPhraseRequest, GenerateRecoveryPhraseResponse, GetActiveAccountRequest, GetActiveAccountResponse, GetChainIDRequest, GetChainIDResponse, GetKeyInfoByAddressRequest, GetKeyInfoByAddressResponse, GetKeyInfoByNameOrAddressRequest, GetKeyInfoByNameOrAddressResponse, GetKeyInfoByNameRequest, GetKeyInfoByNameResponse, GetRemoteRequest, GetRemoteResponse, HasKeyByAddressRequest, HasKeyByAddressResponse, HasKeyByNameOrAddressRequest, HasKeyByNameOrAddressResponse, HasKeyByNameRequest, HasKeyByNameResponse, HelloRequest, HelloResponse, HelloStreamRequest, HelloStreamResponse, ListKeyInfoRequest, ListKeyInfoResponse, QEvalRequest, QEvalResponse, QueryAccountRequest, QueryAccountResponse, QueryRequest, QueryResponse, RenderRequest, RenderResponse, SelectAccountRequest, SelectAccountResponse, SetChainIDRequest, SetChainIDResponse, SetPasswordRequest, SetPasswordResponse, SetRemoteRequest, SetRemoteResponse } from "./gnonativetypes_pb.js";
import { MethodKind } from "@bufbuild/protobuf";

/**
 * GnoNativeService is the service to interact with the Gno blockchain
 *
 * @generated from service land.gno.gnonative.v1.GnoNativeService
 */
export declare const GnoNativeService: {
  readonly typeName: "land.gno.gnonative.v1.GnoNativeService",
  readonly methods: {
    /**
     * Set the connection address for the remote node. If you don't call this,
     * the default is "127.0.0.1:26657"
     *
     * @generated from rpc land.gno.gnonative.v1.GnoNativeService.SetRemote
     */
    readonly setRemote: {
      readonly name: "SetRemote",
      readonly I: typeof SetRemoteRequest,
      readonly O: typeof SetRemoteResponse,
      readonly kind: MethodKind.Unary,
    },
    /**
     * Get the connection address for the remote node. The response is either
     * the initial default, or the value which was set with SetRemote
     *
     * @generated from rpc land.gno.gnonative.v1.GnoNativeService.GetRemote
     */
    readonly getRemote: {
      readonly name: "GetRemote",
      readonly I: typeof GetRemoteRequest,
      readonly O: typeof GetRemoteResponse,
      readonly kind: MethodKind.Unary,
    },
    /**
     * Set the chain ID for the remote node. If you don't call this, the default
     * is "dev"
     *
     * @generated from rpc land.gno.gnonative.v1.GnoNativeService.SetChainID
     */
    readonly setChainID: {
      readonly name: "SetChainID",
      readonly I: typeof SetChainIDRequest,
      readonly O: typeof SetChainIDResponse,
      readonly kind: MethodKind.Unary,
    },
    /**
     * Get the chain ID for the remote node. The response is either
     * the initial default, or the value which was set with SetChainID
     *
     * @generated from rpc land.gno.gnonative.v1.GnoNativeService.GetChainID
     */
    readonly getChainID: {
      readonly name: "GetChainID",
      readonly I: typeof GetChainIDRequest,
      readonly O: typeof GetChainIDResponse,
      readonly kind: MethodKind.Unary,
    },
    /**
     * Generate a recovery phrase of BIP39 mnemonic words using entropy from the
     * crypto library random number generator. This can be used as the mnemonic in
     * CreateAccount.
     *
     * @generated from rpc land.gno.gnonative.v1.GnoNativeService.GenerateRecoveryPhrase
     */
    readonly generateRecoveryPhrase: {
      readonly name: "GenerateRecoveryPhrase",
      readonly I: typeof GenerateRecoveryPhraseRequest,
      readonly O: typeof GenerateRecoveryPhraseResponse,
      readonly kind: MethodKind.Unary,
    },
    /**
     * Get the information for all keys in the keybase
     *
     * @generated from rpc land.gno.gnonative.v1.GnoNativeService.ListKeyInfo
     */
    readonly listKeyInfo: {
      readonly name: "ListKeyInfo",
      readonly I: typeof ListKeyInfoRequest,
      readonly O: typeof ListKeyInfoResponse,
      readonly kind: MethodKind.Unary,
    },
    /**
     * Check for the key in the keybase with the given name.
     * In the response, set has true if the keybase has the key.
     *
     * @generated from rpc land.gno.gnonative.v1.GnoNativeService.HasKeyByName
     */
    readonly hasKeyByName: {
      readonly name: "HasKeyByName",
      readonly I: typeof HasKeyByNameRequest,
      readonly O: typeof HasKeyByNameResponse,
      readonly kind: MethodKind.Unary,
    },
    /**
     * Check for the key in the keybase with the given address.
     * In the response, set has true if the keybase has the key.
     *
     * @generated from rpc land.gno.gnonative.v1.GnoNativeService.HasKeyByAddress
     */
    readonly hasKeyByAddress: {
      readonly name: "HasKeyByAddress",
      readonly I: typeof HasKeyByAddressRequest,
      readonly O: typeof HasKeyByAddressResponse,
      readonly kind: MethodKind.Unary,
    },
    /**
     * Check for the key in the keybase with the given name or bech32 string address.
     * In the response, set has true if the keybase has the key.
     *
     * @generated from rpc land.gno.gnonative.v1.GnoNativeService.HasKeyByNameOrAddress
     */
    readonly hasKeyByNameOrAddress: {
      readonly name: "HasKeyByNameOrAddress",
      readonly I: typeof HasKeyByNameOrAddressRequest,
      readonly O: typeof HasKeyByNameOrAddressResponse,
      readonly kind: MethodKind.Unary,
    },
    /**
     * Get the information for the key in the keybase with the given name.
     * If the key doesn't exist, return [ErrCode](#land.gno.gnonative.v1.ErrCode).ErrCryptoKeyNotFound.
     *
     * @generated from rpc land.gno.gnonative.v1.GnoNativeService.GetKeyInfoByName
     */
    readonly getKeyInfoByName: {
      readonly name: "GetKeyInfoByName",
      readonly I: typeof GetKeyInfoByNameRequest,
      readonly O: typeof GetKeyInfoByNameResponse,
      readonly kind: MethodKind.Unary,
    },
    /**
     * Get the information for the key in the keybase with the given address.
     * If the key doesn't exist, return [ErrCode](#land.gno.gnonative.v1.ErrCode).ErrCryptoKeyNotFound.
     *
     * @generated from rpc land.gno.gnonative.v1.GnoNativeService.GetKeyInfoByAddress
     */
    readonly getKeyInfoByAddress: {
      readonly name: "GetKeyInfoByAddress",
      readonly I: typeof GetKeyInfoByAddressRequest,
      readonly O: typeof GetKeyInfoByAddressResponse,
      readonly kind: MethodKind.Unary,
    },
    /**
     * Get the information for the key in the keybase with the given name or bech32 string address.
     * If the key doesn't exist, return [ErrCode](#land.gno.gnonative.v1.ErrCode).ErrCryptoKeyNotFound.
     *
     * @generated from rpc land.gno.gnonative.v1.GnoNativeService.GetKeyInfoByNameOrAddress
     */
    readonly getKeyInfoByNameOrAddress: {
      readonly name: "GetKeyInfoByNameOrAddress",
      readonly I: typeof GetKeyInfoByNameOrAddressRequest,
      readonly O: typeof GetKeyInfoByNameOrAddressResponse,
      readonly kind: MethodKind.Unary,
    },
    /**
     * Create a new account the keybase using the name an password specified by SetAccount.
     * If an account with the same name already exists in the keybase,
     * this replaces it. (If you don't want to replace it, then it's your responsibility
     * to use GetKeyInfoByName to check if it exists before calling this.)
     *
     * @generated from rpc land.gno.gnonative.v1.GnoNativeService.CreateAccount
     */
    readonly createAccount: {
      readonly name: "CreateAccount",
      readonly I: typeof CreateAccountRequest,
      readonly O: typeof CreateAccountResponse,
      readonly kind: MethodKind.Unary,
    },
    /**
     * SelectAccount selects the active account to use for later operations
     *
     * @generated from rpc land.gno.gnonative.v1.GnoNativeService.SelectAccount
     */
    readonly selectAccount: {
      readonly name: "SelectAccount",
      readonly I: typeof SelectAccountRequest,
      readonly O: typeof SelectAccountResponse,
      readonly kind: MethodKind.Unary,
    },
    /**
     * Set the password for the active account in the keybase, used for later operations.
     * If no active account has been set with SelectAccount, return [ErrCode](#land.gno.gnonative.v1.ErrCode).ErrNoActiveAccount.
     * If the password is wrong, return [ErrCode](#land.gno.gnonative.v1.ErrCode).ErrDecryptionFailed.
     *
     * @generated from rpc land.gno.gnonative.v1.GnoNativeService.SetPassword
     */
    readonly setPassword: {
      readonly name: "SetPassword",
      readonly I: typeof SetPasswordRequest,
      readonly O: typeof SetPasswordResponse,
      readonly kind: MethodKind.Unary,
    },
    /**
     * GetActiveAccount gets the active account which was set by SelectAccount.
     * If no active account has been set with SelectAccount, return [ErrCode](#land.gno.gnonative.v1.ErrCode).ErrNoActiveAccount.
     * (To check if there is an active account, use ListKeyInfo and check the
     * length of the result.)
     *
     * @generated from rpc land.gno.gnonative.v1.GnoNativeService.GetActiveAccount
     */
    readonly getActiveAccount: {
      readonly name: "GetActiveAccount",
      readonly I: typeof GetActiveAccountRequest,
      readonly O: typeof GetActiveAccountResponse,
      readonly kind: MethodKind.Unary,
    },
    /**
     * QueryAccount retrieves account information from the blockchain for a given
     * address.
     *
     * @generated from rpc land.gno.gnonative.v1.GnoNativeService.QueryAccount
     */
    readonly queryAccount: {
      readonly name: "QueryAccount",
      readonly I: typeof QueryAccountRequest,
      readonly O: typeof QueryAccountResponse,
      readonly kind: MethodKind.Unary,
    },
    /**
     * DeleteAccount deletes the account with the given name, using the password
     * to ensure access. However, if skip_password is true, then ignore the
     * password.
     * If the account doesn't exist, return [ErrCode](#land.gno.gnonative.v1.ErrCode).ErrCryptoKeyNotFound.
     * If the password is wrong, return [ErrCode](#land.gno.gnonative.v1.ErrCode).ErrDecryptionFailed.
     *
     * @generated from rpc land.gno.gnonative.v1.GnoNativeService.DeleteAccount
     */
    readonly deleteAccount: {
      readonly name: "DeleteAccount",
      readonly I: typeof DeleteAccountRequest,
      readonly O: typeof DeleteAccountResponse,
      readonly kind: MethodKind.Unary,
    },
    /**
     * Make an ABCI query to the remote node.
     *
     * @generated from rpc land.gno.gnonative.v1.GnoNativeService.Query
     */
    readonly query: {
      readonly name: "Query",
      readonly I: typeof QueryRequest,
      readonly O: typeof QueryResponse,
      readonly kind: MethodKind.Unary,
    },
    /**
     * Render calls the Render function for package_path with optional args. The
     * package path should include the prefix like "gno.land/". This is similar to
     * using a browser URL <testnet>/<pkgPath>:<args> where <pkgPath> doesn't have
     * the prefix like "gno.land/".
     *
     * @generated from rpc land.gno.gnonative.v1.GnoNativeService.Render
     */
    readonly render: {
      readonly name: "Render",
      readonly I: typeof RenderRequest,
      readonly O: typeof RenderResponse,
      readonly kind: MethodKind.Unary,
    },
    /**
     * QEval evaluates the given expression with the realm code at package_path.
     * The package path should include the prefix like "gno.land/". The expression
     * is usually a function call like "GetBoardIDFromName(\"testboard\")". The
     * return value is a typed expression like
     * "(1 gno.land/r/demo/boards.BoardID)\n(true bool)".
     * If the path of a realm function call is unrecognized, return [ErrCode](#land.gno.gnonative.v1.ErrCode).ErrUnknownRequest.
     *
     * @generated from rpc land.gno.gnonative.v1.GnoNativeService.QEval
     */
    readonly qEval: {
      readonly name: "QEval",
      readonly I: typeof QEvalRequest,
      readonly O: typeof QEvalResponse,
      readonly kind: MethodKind.Unary,
    },
    /**
     * Call a specific realm function.
     * If no active account has been set with SelectAccount, return [ErrCode](#land.gno.gnonative.v1.ErrCode).ErrNoActiveAccount.
     * If the password is wrong, return [ErrCode](#land.gno.gnonative.v1.ErrCode).ErrDecryptionFailed.
     * If the path of a realm function call is unrecognized, return [ErrCode](#land.gno.gnonative.v1.ErrCode).ErrUnknownRequest.
     *
     * @generated from rpc land.gno.gnonative.v1.GnoNativeService.Call
     */
    readonly call: {
      readonly name: "Call",
      readonly I: typeof CallRequest,
      readonly O: typeof CallResponse,
      readonly kind: MethodKind.ServerStreaming,
    },
    /**
     * Convert a byte array address to a bech32 string address.
     *
     * @generated from rpc land.gno.gnonative.v1.GnoNativeService.AddressToBech32
     */
    readonly addressToBech32: {
      readonly name: "AddressToBech32",
      readonly I: typeof AddressToBech32Request,
      readonly O: typeof AddressToBech32Response,
      readonly kind: MethodKind.Unary,
    },
    /**
     * Convert a bech32 string address to a byte array address.
     *
     * @generated from rpc land.gno.gnonative.v1.GnoNativeService.AddressFromBech32
     */
    readonly addressFromBech32: {
      readonly name: "AddressFromBech32",
      readonly I: typeof AddressFromBech32Request,
      readonly O: typeof AddressFromBech32Response,
      readonly kind: MethodKind.Unary,
    },
    /**
     * Hello is for debug purposes
     *
     * @generated from rpc land.gno.gnonative.v1.GnoNativeService.Hello
     */
    readonly hello: {
      readonly name: "Hello",
      readonly I: typeof HelloRequest,
      readonly O: typeof HelloResponse,
      readonly kind: MethodKind.Unary,
    },
    /**
     * HelloStream is for debug purposes
     *
     * @generated from rpc land.gno.gnonative.v1.GnoNativeService.HelloStream
     */
    readonly helloStream: {
      readonly name: "HelloStream",
      readonly I: typeof HelloStreamRequest,
      readonly O: typeof HelloStreamResponse,
      readonly kind: MethodKind.ServerStreaming,
    },
  }
};

