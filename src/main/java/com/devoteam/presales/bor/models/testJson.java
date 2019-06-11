package com.devoteam.presales.bor.models;

import com.devoteam.presales.bor.ListJson.ListAudience;
import com.devoteam.presales.bor.ListJson.ListEntities;
import com.devoteam.presales.bor.ListJson.ListUser;

import java.io.FileNotFoundException;
import java.util.List;

public class testJson {
    public static void main(String[] args) throws FileNotFoundException {
        ListEntities entities = new ListEntities();
        ListUser users = new ListUser();
        ListAudience audiences = new ListAudience();

        for (Entity x: ListEntities.entities) {
            System.out.println(x.getName());
        }
        for (User x: ListUser.users) {
            System.out.println(x.getFirstname());
        }
        for (Audience x: ListAudience.audiences) {
            System.out.println(x.getStageBor());
        }

    }
}