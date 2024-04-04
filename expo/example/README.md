# Example app using Expo module

This example app imports the GnoNattive Expo module directly from the parent
folder. Every time you want to import the module in the example app (because of
the first time or because you modified the module itself), you have to build it
again.

Follow the following instructions.

## Building the Expo module

Open a terminal and run:

```
cd .. # cd to the expo folder
make build # or make build.android or make build.ios
npm run build
```

Open a second terminal and run: `npx expo prebuild --clean`

Now the module is compiled, we can build the example app.

### Android

```
cd example
npx expo run:android
```

### iOS

```
cd example
npx expo run:ios
```