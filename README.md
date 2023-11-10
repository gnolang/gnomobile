# gnomobile

Current Gno apps run on desktop/laptop computers which have Go installed. To run on mobile, the app would need to bundle the Go runtime which is complicated for most developers. However our devs have years of experience with using Go on mobile and overcoming other difficulties of the Android and iOS operating systems. 

Therefore, we demonstrate that it is possible to run a Gno app on mobile. This project's objective is to create a proof-of-concept mobile application which stores a Gno wallet on the mobile and calls a realm function on a remote Gno.land node and to create this software framework called GnoMobile. The ultimate objective of GnoMobile is to allow other Gno developers to easily offer their apps to run on mobile devices.

## Build instructions

### Install asdf for macOS 11, macOS 12 and macOS 13

(If you are on Ubuntu, see the next section to install asdf.)

To install the Command Line Developer Tools, in a terminal enter:

    xcode-select --install

After the Developer Tools are installed, we need to make sure it is updated. In
System Preferences, click Software Update and update it if needed.

To install asdf using brew, follow instructions at https://asdf-vm.com . In short,
first install brew following the instructions at https://brew.sh . Then, in
a terminal enter:

    brew install asdf

If your terminal is zsh, enter:

    echo -e "\n. $(brew --prefix asdf)/libexec/asdf.sh" >> ${ZDOTDIR:-~}/.zshrc

If your terminal is bash, enter:

    echo -e "\n. \"$(brew --prefix asdf)/libexec/asdf.sh\"" >> ~/.bash_profile

Start a new terminal to get the changes to the environment .

### Install asdf for Ubuntu 18.04, 20.04 and 22.04

To install asdf, follow instructions at https://asdf-vm.com . In short, in
a terminal enter:

    sudo apt install curl git
    git clone https://github.com/asdf-vm/asdf.git ~/.asdf
    echo '. "$HOME/.asdf/asdf.sh"' >> ~/.bashrc

Start a new terminal to get the changes to the environment .

### Get a copy of the repo

```console
git clone https://github.com/gnolang/gnomobile
cd gnomobile
```

### Android

#### Install the tools with asdf (only need to do once)

```console
make asdf.install_tools
```

#### Build the Go code as a library

```console
make build.android
```

#### Start metro

```console
cd gnoboard
yarn start
```

#### Connect your Android phone/emulator and bind its port to metro

You can either connect an Android phone via USB cable, or launch an emulator device from Android Studio.

##### Real device

Connect your device and bind the port to metro:

```console
cd gnoboard
make android.reverse_tcp
```

##### Emulator device

You can either run Android Studio and open the Android project in `gnoboard/android`.
If you prefer the CLI option:

```console
android-studio ./android
```
Once done, bind the port to metro:

```console
make android.reverse_tcp
```

#### Build with Android Studio

Open Android Studio and open the current Android project if it's not already done.
Select the right device in the device list. Open the `Run` menu, and select `Run app`.
See more: https://developer.android.com/studio/run#basic-build-run

### iOS

#### Install the tools with asdf (only need to do once)

```console
make asdf.install_tools
```

If you get an error like "https://github.com/CocoaPods/CLAide.git (at master@97b765e) is not yet checked out" then reinstall cocoapods like this: 

```console
asdf uninstall cocoapods
make asdf.install_tools
```

#### Build the Go code as a library

```console
make build.ios
```

#### Start metro

```console
cd gnoboard
yarn start
```

#### Open Xcode and connect your iOS device

Open Xcode and open the GnoBoard Xcode workspace: `gnoboard/ios/gnoboard.xcworkspace`
You can either connect an iOS phone via USB cable, or launch an emulator device from Xcode.
See more: https://developer.apple.com/documentation/xcode/running-your-app-in-simulator-or-on-a-device

#### Select a developer certificate

In Xcode, double click on gnoboard project on the left pane, go to the `Signing & Capabilities` pane.
In the `Signing` section, select your `team` certificate.

#### Build with Xcode

Select the right device in the device list. Open the `Product` menu, and select `Run`.
See more: https://developer.apple.com/documentation/xcode/building-and-running-an-app
