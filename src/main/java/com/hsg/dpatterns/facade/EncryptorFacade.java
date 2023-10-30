package com.hsg.dpatterns.facade;

public class EncryptorFacade {

    private AESEncryptor aesEncryptor = new AESEncryptor();
    private MD5Encryptor md5Encryptor = new MD5Encryptor();
    private SHAEncryptor shaEncryptor = new SHAEncryptor();

    public enum EncType {
        AES, MD5, SHA
    }

    public void encrypt(String text, EncType encType) {
        switch (encType) {
            case AES:
                aesEncryptor.encrypt(text);
                break;
            case MD5:
                md5Encryptor.encrypt(text, "key");
                break;
            case SHA:
                shaEncryptor.encrypt(text, "key", true);
                break;
            default:
                throw new IllegalArgumentException(encType.toString());
        }
    }
}
