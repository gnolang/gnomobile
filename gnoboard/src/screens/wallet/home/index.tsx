import React, { useEffect } from 'react';
import Layout from '@gno/components/pages';
import Button from '@gno/components/buttons';
import { useNavigation } from '@react-navigation/native';
import { RoutePath } from '@gno/router/path';
import { RouterWelcomeStackProp } from '@gno/router/custom-router';
import Text from '@gno/components/texts';
import styled from 'styled-components/native';
import CurrentAccount from '@gno/components/account/CurrentAccoutn';
import { useGno } from '@gno/hooks/use-gno';
import Loading from '@gno/screens/loading';
import { GnoAccount } from '@gno/native_modules/types';
import { QueryAccountResponse } from '@gno/api/gnomobiletypes_pb';
import { AccountBalance } from '@gno/components/account';

export const Home: React.FC = () => {
  const navigation = useNavigation<RouterWelcomeStackProp>();
  const gno = useGno();

  const [loading, setLoading] = React.useState<string | undefined>(undefined);
  const [account, setAccount] = React.useState<GnoAccount | undefined>(undefined);
  const [balance, setBalance] = React.useState<QueryAccountResponse | undefined>(undefined);

  useEffect(() => {
    const unsubscribe = navigation.addListener('focus', async () => {
      try {
        const response = await gno.getActiveAccount();
        setAccount(response);
        if (response) {
          // TOFIX: Network Error
          const balance = await gno.queryAccount(response.address);
          // console.log('coins: ' + JSON.stringify(balance.accountInfo.coins));
          setBalance(balance);
        }
      } catch (error: unknown | Error) {
        console.log(error);
      } finally {
        setLoading(undefined);
      }
    });
    return unsubscribe;
  }, [navigation]);

  if (loading) {
    return <Loading message={loading} />;
  }

  return (
    <Layout.Container>
      <Layout.Body>
        <Text.Title>Gnomobile</Text.Title>
        <CurrentAccount account={account} />
        <AccountBalance accountInfo={balance?.accountInfo} />
        <ButtonGroup>
          <Button title='Create New Account' onPress={() => navigation.navigate(RoutePath.GenerateSeedPhrase)} />
          <Button title='Import Account' onPress={() => navigation.navigate(RoutePath.ImportPrivateKey)} />
          <Button title='Switch Accounts' onPress={() => navigation.navigate(RoutePath.SwitchAccounts)} />
          <Button title='Remove Account' onPress={() => navigation.navigate(RoutePath.RemoveAccount)} />
          <Button title='Developer Mode' onPress={() => navigation.navigate(RoutePath.DevMode)} />
        </ButtonGroup>
      </Layout.Body>
    </Layout.Container>
  );
};

const ButtonGroup = styled.View`
  margin-top: 32px;
`;

export default Home;