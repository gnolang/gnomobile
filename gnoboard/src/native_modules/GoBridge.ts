import { GoBridgeInterface } from "./GoBridgeInterface";

class NoopGoBridge implements GoBridgeInterface {
  initBridge() {
    return Promise.reject();
  }

  closeBridge() {
    return Promise.reject();
  }

  listKeyInfo(): Promise<Array<string>> {
    return Promise.reject();
  }

  createAccount(
    _nameOrBech32: string,
    _mnemonic: string,
    _bip39Passw: string,
    _password: string,
    _account: Number,
    _index: Number,
  ): Promise<string> {
    return Promise.reject();
  }

  selectAccount(_nameOrBech32: string): Promise<string> {
    return Promise.reject();
  }

  call(
    _packagePath: string,
    _fnc: string,
    _args: Array<string>,
    _gasFee: string,
    _gasWanted: Number,
    _password: string,
  ): Promise<string> {
    return Promise.reject();
  }

  exportJsonConfig() {
    return Promise.reject();
  }
}

export const GoBridge: GoBridgeInterface = new NoopGoBridge();
