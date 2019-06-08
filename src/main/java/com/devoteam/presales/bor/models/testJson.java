package com.devoteam.presales.bor.models;

import com.devoteam.presales.bor.ListJson.ListAudience;
import com.devoteam.presales.bor.ListJson.ListEntities;
import com.devoteam.presales.bor.ListJson.ListUser;

import java.io.FileNotFoundException;

public class testJson {
    public static void main(String[] args) throws FileNotFoundException {
        ListEntities entities = new ListEntities();
        ListUser users = new ListUser();
        ListAudience audiences = new ListAudience();
        System.out.println(ListEntities.entities);
        System.out.println(ListUser.users);
        System.out.println(ListAudience.audiences);
    }
}