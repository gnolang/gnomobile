// @generated by protoc-gen-es v1.4.2
// @generated from file rpc.proto (package land.gno.gnomobile.v1, syntax proto3)
/* eslint-disable */
// @ts-nocheck

import type { BinaryReadOptions, FieldList, JsonReadOptions, JsonValue, PartialMessage, PlainMessage } from "@bufbuild/protobuf";
import { Message, proto3 } from "@bufbuild/protobuf";

/**
 * The ErrCode enum defines errors for gRPC API functions. These are converted
 * from the Go error types returned by gnoclient.
 *
 * ----------------
 * Special errors
 * ----------------
 *
 * @generated from enum land.gno.gnomobile.v1.ErrCode
 */
export declare enum ErrCode {
  /**
   * Undefined is the default value. It should never be set manually
   *
   * @generated from enum value: Undefined = 0;
   */
  Undefined = 0,

  /**
   * TODO indicates that you plan to create an error later
   *
   * @generated from enum value: TODO = 1;
   */
  TODO = 1,

  /**
   * ErrNotImplemented indicates that a method is not implemented yet
   *
   * @generated from enum value: ErrNotImplemented = 2;
   */
  ErrNotImplemented = 2,

  /**
   * ErrInternal indicates an unknown error (without Code), i.e. in gRPC
   *
   * @generated from enum value: ErrInternal = 3;
   */
  ErrInternal = 3,

  /**
   * @generated from enum value: ErrInvalidInput = 100;
   */
  ErrInvalidInput = 100,

  /**
   * @generated from enum value: ErrBridgeInterrupted = 101;
   */
  ErrBridgeInterrupted = 101,

  /**
   * @generated from enum value: ErrMissingInput = 102;
   */
  ErrMissingInput = 102,

  /**
   * @generated from enum value: ErrSerialization = 103;
   */
  ErrSerialization = 103,

  /**
   * @generated from enum value: ErrDeserialization = 104;
   */
  ErrDeserialization = 104,

  /**
   * @generated from enum value: ErrInitService = 105;
   */
  ErrInitService = 105,

  /**
   * @generated from enum value: ErrCryptoKeyTypeUnknown = 150;
   */
  ErrCryptoKeyTypeUnknown = 150,

  /**
   * ErrCryptoKeyNotFound indicates that the doesn't exist in the keybase
   *
   * @generated from enum value: ErrCryptoKeyNotFound = 151;
   */
  ErrCryptoKeyNotFound = 151,

  /**
   * ErrNoActiveAccount indicates that no active account has been set with SelectAccount
   *
   * @generated from enum value: ErrNoActiveAccount = 152;
   */
  ErrNoActiveAccount = 152,

  /**
   * @generated from enum value: ErrRunGRPCServer = 153;
   */
  ErrRunGRPCServer = 153,

  /**
   * ErrDecryptionFailed indicates a decryption failure including a wrong password
   *
   * @generated from enum value: ErrDecryptionFailed = 154;
   */
  ErrDecryptionFailed = 154,

  /**
   * @generated from enum value: ErrTxDecode = 200;
   */
  ErrTxDecode = 200,

  /**
   * @generated from enum value: ErrInvalidSequence = 201;
   */
  ErrInvalidSequence = 201,

  /**
   * @generated from enum value: ErrUnauthorized = 202;
   */
  ErrUnauthorized = 202,

  /**
   * ErrInsufficientFunds indicates that there are insufficient funds to pay for fees
   *
   * @generated from enum value: ErrInsufficientFunds = 203;
   */
  ErrInsufficientFunds = 203,

  /**
   * ErrUnknownRequest indicates that the path of a realm function call is unrecognized
   *
   * @generated from enum value: ErrUnknownRequest = 204;
   */
  ErrUnknownRequest = 204,

  /**
   * ErrInvalidAddress indicates that an account address is blank or the bech32 can't be decoded
   *
   * @generated from enum value: ErrInvalidAddress = 205;
   */
  ErrInvalidAddress = 205,

  /**
   * ErrUnknownAddress indicates that the address is unknown on the blockchain
   *
   * @generated from enum value: ErrUnknownAddress = 206;
   */
  ErrUnknownAddress = 206,

  /**
   * ErrInvalidPubKey indicates that the public key was not found or has an invalid algorithm or format
   *
   * @generated from enum value: ErrInvalidPubKey = 207;
   */
  ErrInvalidPubKey = 207,

  /**
   * ErrInsufficientCoins indicates that the transaction has insufficient account funds to send
   *
   * @generated from enum value: ErrInsufficientCoins = 208;
   */
  ErrInsufficientCoins = 208,

  /**
   * ErrInvalidCoins indicates that the transaction Coins are not sorted, or don't have a
   * positive amount, or the coin Denom contains upper case characters
   *
   * @generated from enum value: ErrInvalidCoins = 209;
   */
  ErrInvalidCoins = 209,

  /**
   * ErrInvalidGasWanted indicates that the transaction gas wanted is too large or otherwise invalid
   *
   * @generated from enum value: ErrInvalidGasWanted = 210;
   */
  ErrInvalidGasWanted = 210,

  /**
   * ErrOutOfGas indicates that the transaction doesn't have enough gas
   *
   * @generated from enum value: ErrOutOfGas = 211;
   */
  ErrOutOfGas = 211,

  /**
   * ErrMemoTooLarge indicates that the transaction memo is too large
   *
   * @generated from enum value: ErrMemoTooLarge = 212;
   */
  ErrMemoTooLarge = 212,

  /**
   * ErrInsufficientFee indicates that the gas fee is insufficient
   *
   * @generated from enum value: ErrInsufficientFee = 213;
   */
  ErrInsufficientFee = 213,

  /**
   * ErrTooManySignatures indicates that the transaction has too many signatures
   *
   * @generated from enum value: ErrTooManySignatures = 214;
   */
  ErrTooManySignatures = 214,

  /**
   * ErrNoSignatures indicates that the transaction has no signatures
   *
   * @generated from enum value: ErrNoSignatures = 215;
   */
  ErrNoSignatures = 215,

  /**
   * ErrGasOverflow that an action results in a gas consumption unsigned integer overflow
   *
   * @generated from enum value: ErrGasOverflow = 216;
   */
  ErrGasOverflow = 216,
}

/**
 * @generated from message land.gno.gnomobile.v1.ErrDetails
 */
export declare class ErrDetails extends Message<ErrDetails> {
  /**
   * @generated from field: repeated land.gno.gnomobile.v1.ErrCode codes = 1;
   */
  codes: ErrCode[];

  constructor(data?: PartialMessage<ErrDetails>);

  static readonly runtime: typeof proto3;
  static readonly typeName = "land.gno.gnomobile.v1.ErrDetails";
  static readonly fields: FieldList;

  static fromBinary(bytes: Uint8Array, options?: Partial<BinaryReadOptions>): ErrDetails;

  static fromJson(jsonValue: JsonValue, options?: Partial<JsonReadOptions>): ErrDetails;

  static fromJsonString(jsonString: string, options?: Partial<JsonReadOptions>): ErrDetails;

  static equals(a: ErrDetails | PlainMessage<ErrDetails> | undefined, b: ErrDetails | PlainMessage<ErrDetails> | undefined): boolean;
}

