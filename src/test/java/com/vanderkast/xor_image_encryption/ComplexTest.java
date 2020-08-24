package com.vanderkast.xor_image_encryption;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class ComplexTest {
    String origin = "hello world!";
    String key = "key";

    @Test
    public void enc_dec() {
        var encrypted = new XorProvider().encrypt(origin.getBytes(), key.getBytes());
        var decrypted = new XorProvider().decrypt(encrypted, key.getBytes());
        assertEquals(origin, new String(decrypted));
    }
}
