package com.devoteam.presales.testspringsecu;

import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class userinfo {
    private static List<UsersDevo> users = new ArrayList<>();
   UsersDevo user1 = new UsersDevo();

    public UsersDevo getUser1() {
        user1.setEmail("raphael.obadia@gmail.com");
        return user1;
    }
}
//test comment

