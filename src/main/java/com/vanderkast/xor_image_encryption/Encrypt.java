package com.vanderkast.xor_image_encryption;

public interface Encrypt {
    byte[] encrypt(byte[] origin, byte[] key);
}
