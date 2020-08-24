package com.vanderkast.xor_image_encryption;

public class XorProvider implements Encrypt, Decrypt{
    @Override
    public byte[] decrypt(byte[] origin, byte[] key) {
        return handle(origin, key);
    }

    @Override
    public byte[] encrypt(byte[] origin, byte[] key) {
        return handle(origin, key);
    }

    private byte[] handle(byte[] origin, byte[] key) {
        var result = new byte[origin.length];
        var keyLength = key.length;
        for (int i = 0; i < origin.length; i++) {
            result[i] = (byte) (origin[i] ^ (i % keyLength));
        }
        return result;
    }
}
