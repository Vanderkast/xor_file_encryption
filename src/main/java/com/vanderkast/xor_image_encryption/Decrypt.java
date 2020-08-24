package com.vanderkast.xor_image_encryption;

public interface Decrypt {
    byte[] decrypt(byte[] origin, byte[] key);
}
