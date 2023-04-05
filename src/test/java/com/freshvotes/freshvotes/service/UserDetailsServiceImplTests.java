package com.freshvotes.freshvotes.service;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.not;


public class UserDetailsServiceImplTests {

    @Test
    public void generate_encrypted_password() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String rawPassword = "welcome@123";
        String encodedPassword = bCryptPasswordEncoder.encode(rawPassword);
        System.out.println(encodedPassword);
        assertThat(rawPassword, not(encodedPassword));
    }
}
