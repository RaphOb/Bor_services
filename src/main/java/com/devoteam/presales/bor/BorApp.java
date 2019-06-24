package com.devoteam.presales.bor;

import com.devoteam.presales.testspringsecu.TestspringsecuApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
public class BorApp {
    public static void main(String[] args) {

        SpringApplication.run(TestspringsecuApplication.class, args);

    }
}
