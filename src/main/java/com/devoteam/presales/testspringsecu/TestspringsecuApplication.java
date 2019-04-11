package com.devoteam.presales.testspringsecu;

import java.security.Principal;
import java.util.*;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


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

