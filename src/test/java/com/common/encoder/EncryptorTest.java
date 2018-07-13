package com.common.encoder;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EncryptorTest {
    private static final String TEST_VALUE = "test_value";
    private static final String TEST_KEY = "1234567891234561";

    @Autowired
    private Encryptor encryptor;

    @Test
    public void shouldEncryptAndDecrypt() {
        //When
        String encrypt = encryptor.encrypt(TEST_VALUE);
        String actualResult = encryptor.decrypt(encrypt);

        //Then
        Assertions.assertThat(actualResult).isEqualTo(TEST_VALUE);
    }
}