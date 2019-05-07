package com.devoteam.presales.bor;

import java.util.List;

public class Audience {
    Entity entity;
    private Integer stageBor;
    private List<User> mandatory;
    private List<User> optional;

    public Integer getStageBor() {
        return stageBor;
    }

    public void setStageBor(Integer stageBor) {
        this.stageBor = stageBor;
    }

    public List<User> getMandatory() {
        return mandatory;
    }

    public void setMandatory(List<User> mandatory) {
        this.mandatory = mandatory;
    }

    public List<User> getOptional() {
        return optional;
    }

    public void setOptional(List<User> optional) {
        this.optional = optional;
    }
}
