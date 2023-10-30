package com.hsg.dpatterns.facade;

public class CustomEncryptor {
    public static void main(String[] args) {
        String text = "Content";

        AESEncryptor aesEncryptor = new AESEncryptor();
        aesEncryptor.encrypt(text);

        MD5Encryptor md5Encryptor = new MD5Encryptor();
        md5Encryptor.encrypt(text, "key");

        SHAEncryptor shaEncryptor = new SHAEncryptor();
        shaEncryptor.encrypt(text, "key", true);

        EncryptorFacade encryptorFacade = new EncryptorFacade();
        encryptorFacade.encrypt(text, EncryptorFacade.EncType.AES);
    }
}
