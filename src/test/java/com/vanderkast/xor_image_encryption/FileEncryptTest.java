package com.vanderkast.xor_image_encryption;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.*;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class FileEncryptTest {
    Encrypt encrypt;
    File input;
    File output;
    String key;

    @Before
    public void setUp() throws Exception {
        input = new File("D:\\xor_image_encryption\\src\\test\\resources\\input_origin.jpeg");
        output = new File("D:\\xor_image_encryption\\src\\test\\resources\\output_encrypted.txt");
        key = "key";
        encrypt = new XorProvider();
    }

    @Test
    public void name() throws IOException {
        assertTrue(input.exists());
        recreateFile(output);
        byte[] origin = new FileInputStream(input).readAllBytes();
        byte[] result = encrypt.encrypt(origin, key.getBytes());
        new FileOutputStream(output).write(result);
    }

    @SuppressWarnings("ResultOfMethodCallIgnored")
    static void recreateFile(File file) throws IOException {
        if(file.exists())
            file.delete();
        file.createNewFile();
    }
}
