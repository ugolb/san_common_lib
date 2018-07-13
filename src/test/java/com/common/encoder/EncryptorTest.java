package com.common.encoder;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class EncryptorTest {
    private static final String TEST_VALUE = "test_value";
    private static final String TEST_KEY = "1234567891234561";

    @Test
    public void shouldEncryptAndDecrypt() {
        //When
        String encrypt = Encryptor.encrypt(TEST_KEY, TEST_VALUE);
        String actualResult = Encryptor.decrypt(TEST_KEY, encrypt);

        //Then
        Assertions.assertThat(actualResult).isEqualTo(TEST_VALUE);
    }
}