package com.devoteam.presales.bor;

import com.devoteam.presales.bor.ListJson.ListAudience;
import com.devoteam.presales.bor.ListJson.ListEntities;
import com.devoteam.presales.bor.ListJson.ListUser;
import com.devoteam.presales.testspringsecu.TestspringsecuApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.FileNotFoundException;

@SpringBootApplication
public class BorApp {
    public static void main(String[] args) throws FileNotFoundException {
        ListEntities entities = new ListEntities();
        ListUser users = new ListUser();
        ListAudience audiences = new ListAudience();
        SpringApplication.run(TestspringsecuApplication.class, args);

    }
}
