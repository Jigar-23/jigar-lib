package com.example.Encryption;

import java.security.*;

public class Generator {


    static KeyPairGenerator keyPairGenerator;
    static KeyPair keyPair;

    static {
        try {
            keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048);
            keyPair = keyPairGenerator.generateKeyPair();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public Generator() throws NoSuchAlgorithmException {
    }


    public static PrivateKey generatePrivateKey(String password) {
        if (password.equals("jigar6180")) {
            return keyPair.getPrivate();
        }
        return null;
    }

    public static PublicKey generatePublicKey(String password) {
        if (password.equals("jigar6180")) {
            return keyPair.getPublic();
        }

        return null;
    }


}
