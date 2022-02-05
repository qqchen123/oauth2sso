package com.example.ssoclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

/**
 * @author mac
 */
@SpringBootApplication
@EnableOAuth2Sso
public class SsoclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsoclientApplication.class, args);
    }

}
