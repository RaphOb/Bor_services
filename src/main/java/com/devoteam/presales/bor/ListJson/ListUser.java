package com.devoteam.presales.bor.ListJson;

import com.devoteam.presales.bor.deserialization.UserDeserialization;
import com.devoteam.presales.bor.models.User;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 * Global List User
 */
public class ListUser {
    public static List<User> users;

    public ListUser() throws FileNotFoundException {
        com.fasterxml.jackson.databind.ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        SimpleModule module = new SimpleModule();
        module.addDeserializer(User.class, new UserDeserialization());
        mapper.registerModule(module);
        TypeReference<List<User>> typeReferenceUser = new TypeReference<>() {
        };
        FileInputStream inputStreamUser = new FileInputStream("C:\\Users\\oraph\\Desktop\\user.json");
        try {
           users = mapper.readValue(inputStreamUser, typeReferenceUser);
            System.out.println("Users Saved!");
        } catch (IOException e) {
            System.out.println("Unable to save users: " + e.getMessage());
        }
    }
}
