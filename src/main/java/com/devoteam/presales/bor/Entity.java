package com.devoteam.presales.bor;
import java.util.List;

public class Entity {
    private String  name;
    private String entityType;
    private Entity rootEntity;

    public Entity getRootEntity() {
        return rootEntity;
    }

    public void setRootEntity(Entity rootEntity) {
        this.rootEntity = rootEntity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }


}
//todo : entitytype : agence / offre / practice /secteur
