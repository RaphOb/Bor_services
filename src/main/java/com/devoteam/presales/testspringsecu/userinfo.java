package com.devoteam.presales.testspringsecu;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class userinfo {
    private static List<UsersDevo> users = new ArrayList<>();
   UsersDevo user1 = new UsersDevo("raph", "o.raphou@gmail.com", "avv", "oba", 1);

    public UsersDevo getUser1() {
        user1.setEmail("raphael.obadia@gmail.com");
        return user1;
    }
}
//test comment

