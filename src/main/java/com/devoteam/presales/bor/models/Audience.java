package com.devoteam.presales.bor.models;

import com.devoteam.presales.bor.deserialization.AudienceDeserialization;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.ArrayList;
import java.util.List;

public class Audience {
    @JsonDeserialize(using = AudienceDeserialization.class)
    public Entity entity;
    private Integer stageBor;
    private List<User> mandatory;
    private List<User> optional;

    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }
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

    public  List<User> getOptional() {
        return optional;
    }

    public void setOptional(List<User> optional) {
        this.optional = optional;
    }

    public List<User> returnMandatory(Entity entity) {
        List<User> user = new ArrayList<>();
        return user;
    }

    public Audience(){}
    public Audience(Entity entity, Integer stageBor)
    {
        this.entity = entity;
        this.stageBor = stageBor;
    }

    public Audience(Entity entity, Integer stageBor, List<User> mandatory, List<User> optional)
    {
        this.entity = entity;
        this.stageBor = stageBor;
        this.mandatory = mandatory;
        this.optional = optional;

    }

    /**
     *
     * @param entity
     * @param bor
     * @param data
     * @return list Mandatory User
     */
    public static  List<User> getMandatoryFromEntity(Entity entity, Integer bor, List<Audience> data) {
        List<User> mandatory = new ArrayList<>();
        for (Audience aud : data) {
            if (aud.entity.getName().equals(entity.getName()) && aud.getStageBor().equals(bor))
                mandatory.addAll(aud.getMandatory());
        }
        return mandatory;
    }

    /**
     *
     *
     * @param entity
     * @param bor
     * @param data
     * @return list User Optional
     */
    public static List<User> getOptionalFromEntity(Entity entity, Integer bor, List<Audience> data) {
        List<User> optionnal = new ArrayList<>();
        for (Audience aud : data) {
            if (aud.entity.getName().equals(entity.getName()) && aud.getStageBor().equals(bor)) {
                optionnal.addAll(aud.getOptional());
            }
        }

        return optionnal;
    }
}
//TODO search mandatory for stagebor/entity
