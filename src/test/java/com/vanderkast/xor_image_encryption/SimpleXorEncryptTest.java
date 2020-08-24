package com.vanderkast.xor_image_encryption;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class SimpleXorEncryptTest {
    byte[] origin;
    byte[] key;

    @Before
    public void setUp() throws Exception {
        origin = new byte[]{1, 2, 3, 4};
        key = new byte[]{0, 1};
    }

    @Test
    public void encrypt() {
        var encrypt = new XorProvider();
        var result = encrypt.encrypt(origin, key);
        assertEquals((byte) 1, result[0]);
        assertEquals((byte) 3, result[1]);
        assertEquals((byte) 3, result[2]);
        assertEquals((byte) 5, result[3]);
    }
}
