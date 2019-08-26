package com.devoteam.presales.bor.models;

import com.devoteam.presales.bor.deserialization.UserDeserialization;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;
import java.util.stream.Collectors;


public class User {
    private String email;
    private String firstname;
    private String lastname;
    Entity entity;
    private Boolean isActive;

    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        lastname = lastname;
    }

    public User() {

    }

    public User(String email, String lastname, String firstname) {
        this.email = email;
        this.lastname = lastname;
        this.firstname = firstname;
    }

    public User(String email, String lastname, String firstname, Entity entity) {
        this.email = email;
        this.lastname = lastname;
        this.firstname = firstname;
        this.entity = entity;
    }

    public List<User> getUserfromEntity(Entity entity, List<User> data) {
        return data.stream()
                .filter(user -> user.getEntity().getName().equals(entity.getName()))
                .collect(Collectors.toList());
    }

    public static User getUserFromEmail(List<User> data, String email) {
        return data.stream()
                .filter(res -> res.getEmail().equals(email))
                .findAny().orElse(null);
    }


}
