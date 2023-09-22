import Button from "@gno/components/button";
import { ConsoleView } from "@gno/components/consoleview";
import TextInput from "@gno/components/textinput";
import { GoBridge } from "@gno/native_modules";
import { screenStyleSheet as styles } from "@gno/styles";
import { useEffect, useState } from "react";
import { Linking, ScrollView, StyleSheet, Text, View } from "react-native";
import {
  createAccount,
  initBridge,
  listKeyInfo,
  selectAccount,
} from "@gno/utils/bridge";

function HomeScreen() {
  const [postContent, setPostContent] = useState("");
  const [appConsole, setAppConsole] = useState<string>("");
  const [loading, setLoading] = useState<string | undefined>(undefined);

  useEffect(() => {
    const init = async () => {
      await initBridge();
      let listKey = await listKeyInfo();
      if (listKey.length === 0) {
        await createAccount(
          "jefft0",
          "enable until hover project know foam join table educate room better scrub clever powder virus army pitch ranch fix try cupboard scatter dune fee",
          "",
          "password",
          0,
          0,
        );
      }
      await selectAccount("jefft0");
    };
    init();

    return () => {
      const deinit = async () => {
        await GoBridge.closeBridge();
      };
      deinit();
    };
  }, []);

  const onPostPress = async () => {
    setLoading("Replying to a post...");
    setAppConsole("replying to a post...");
    var gasFee = "1000000ugnot";
    var gasWanted = 2000000;
    var args: Array<string> = ["2", "1", "1", postContent];
    GoBridge.call(
      "gno.land/r/demo/boards",
      "CreateReply",
      args,
      gasFee,
      gasWanted,
      "password",
    )
      .then((data) => {
        setAppConsole(data);
        setPostContent("");
      })
      .catch((err) => {
        setAppConsole(err);
      })
      .finally(() => setLoading(undefined));
  };

  const onCreateAccountPress = async () => {
    setLoading("Creating default account...");
    setAppConsole("Creating default account...");

    // try {
    //   const data = await GoBridge.createDefaultAccount("create account");
    //   setAppConsole(data);
    // } catch (err) {
    //   setAppConsole(err as any);
    // } finally {
    //   setLoading(undefined);
    // }
  };

  const loadInBrowser = () => {
    Linking.openURL(
      "http://testnet.gno.berty.io/r/demo/boards:gnomobile/1",
    ).catch((err) => console.error("Couldn't load page", err));
  };

  const customStyle = StyleSheet.create({
    loadingContainer: {
      flex: 1,
      justifyContent: "center",
      alignItems: "center",
    },
  });

  return (
    <ScrollView contentContainerStyle={styles.scrollViewContent}>
      <Button
        title="Create Account"
        loading={loading}
        onPress={onCreateAccountPress}
      />
      <Text>Content:</Text>
      <View style={customStyles.sendGroupLikeWhatsapp}>
        <TextInput
          style={customStyles.inputMsg}
          value={postContent}
          onChangeText={setPostContent}
        />
        <Button title="Send" loading={loading} onPress={onPostPress} />
      </View>
      <ConsoleView text={appConsole} />
      <Button
        title="Open http://testnet.gno.berty.io/r/demo/boards:gnomobile/1"
        loading={loading}
        onPress={loadInBrowser}
      />
    </ScrollView>
  );
}

const customStyles = StyleSheet.create({
  sendGroupLikeWhatsapp: {
    flexDirection: "row",
    alignItems: "center",
    justifyContent: "space-between",
  },
  inputMsg: { width: "80%" },
});

export default HomeScreen;
