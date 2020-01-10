package com.qy.emt.utils.MnemonicUtil;

import java.util.List;


public class MnemonicUtil {
    static String message = "import success";
    public static void validateMnemonics(List<String> mnemonicCodes) {
        try {
            MnemonicCode.INSTANCE.check(mnemonicCodes);
        } catch (org.bitcoinj.crypto.MnemonicException.MnemonicLengthException e) {
            throw new TokenException(Messages.MNEMONIC_INVALID_LENGTH);
        } catch (org.bitcoinj.crypto.MnemonicException.MnemonicWordException e) {
            throw new TokenException(Messages.MNEMONIC_BAD_WORD);
        } catch (Exception e) {
            throw new TokenException(Messages.MNEMONIC_CHECKSUM);
        }
    }

    public static List<String> randomMnemonicCodes() {
        return toMnemonicCodes(NumericUtil.generateRandomBytes(16));
    }


    private static List<String> toMnemonicCodes(byte[] entropy) {
        try {
            return MnemonicCode.INSTANCE.toMnemonic(entropy);
        } catch (org.bitcoinj.crypto.MnemonicException.MnemonicLengthException e) {
            throw new TokenException(Messages.MNEMONIC_INVALID_LENGTH);
        } catch (Exception e) {
            throw new TokenException(Messages.MNEMONIC_CHECKSUM);
        }
    }
}
