package com.example.Encryption;

import javax.crypto.Cipher;
import java.security.*;

public class Encrypter {
    public static void main(String[] args) throws Exception {





        //
        PrivateKey privateKey = Generator.generatePrivateKey("password");
        PublicKey publicKey = Generator.generatePublicKey("password");
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        byte[] encrypted = cipher.doFinal("Hello World".getBytes());
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] decrypted = cipher.doFinal(encrypted);
        System.out.println(new String(decrypted));


    }

}
