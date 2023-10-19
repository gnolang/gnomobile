import { NavigationContainer } from '@react-navigation/native';
import { RoutePath } from './path';
import { NativeStackNavigationProp, createNativeStackNavigator } from '@react-navigation/native-stack';
import Home from '@gno/screens/wallet/home';
import YourSeedPhrase from '@gno/screens/certify/your-seed-phrase';
import EnterSeedPharse from '@gno/screens/certify/enter-seed';
import CreatePassword from '@gno/screens/certify/create-password';
import DevMode from '@gno/screens/devmode';
import SwitchAccounts from '@gno/screens/switch-accounts';
import RemoveAccount from '@gno/screens/remove-account';
import RemoveConfirm from '@gno/screens/remove-account/confirm';

export type RouterWelcomeStack = {
  Home: undefined;
  CreatePassword: { phrase: string };
  DevMode: undefined;
  GenerateSeedPhrase: undefined;
  ImportPrivateKey: undefined;
  SwitchAccounts: undefined;
  RemoveAccount: undefined;
  RemoveConfirm: { accountName: string };
};

export const Stack = createNativeStackNavigator<RouterWelcomeStack>();

export type RouterWelcomeStackProp = NativeStackNavigationProp<RouterWelcomeStack>;

const SignedOutStackScreen = () => (
  <Stack.Navigator initialRouteName='Home'>
    <Stack.Group screenOptions={{ headerShown: false }}>
      <Stack.Screen name={RoutePath.Home} component={Home}></Stack.Screen>
      <Stack.Screen name={RoutePath.GenerateSeedPhrase} component={YourSeedPhrase} />
      <Stack.Screen name={RoutePath.ImportPrivateKey} component={EnterSeedPharse} />
      <Stack.Screen name={RoutePath.CreatePassword} component={CreatePassword} />
      <Stack.Screen name={RoutePath.RemoveAccount} component={RemoveAccount}></Stack.Screen>
      <Stack.Screen name={RoutePath.RemoveConfirm} component={RemoveConfirm}></Stack.Screen>
      <Stack.Screen name={RoutePath.SwitchAccounts} component={SwitchAccounts} />
      <Stack.Screen name={RoutePath.DevMode} component={DevMode}></Stack.Screen>
    </Stack.Group>
  </Stack.Navigator>
);

export default function CustomRouter() {
  return (
    <NavigationContainer>
      <SignedOutStackScreen />
    </NavigationContainer>
  );
}
