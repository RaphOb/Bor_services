package com.devoteam.presales.testspringsecu;

import java.security.Principal;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.*;



@SpringBootApplication
@RestController
public class TestspringsecuApplication {

    @Autowired
    UsersRepo usersRepo;

    @RequestMapping("/user")
    public Principal user(Principal principal) throws JSONException,  Exception {
        OAuth2Authentication authentication = (OAuth2Authentication) principal;

        return principal;
    }



    public static void main(String[] args) {

        SpringApplication.run(TestspringsecuApplication.class, args);

    }

}

