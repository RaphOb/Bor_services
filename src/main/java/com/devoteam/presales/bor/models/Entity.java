package com.devoteam.presales.bor.models;


import java.util.List;
import java.util.stream.Collectors;

public class Entity {
    private String name;
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

    public Entity() {

    }

    Entity(String name, String entityType) {
        this.name = name;
        this.entityType = entityType;
    }

    public Entity(String name, String entityType, Entity rootEntity) {
        this.name = name;
        this.entityType = entityType;
        this.rootEntity = rootEntity;
    }

    public Entity searchEntity(List<Entity> entity, String name) {

        return entity.stream()
                .filter(res->res.getName().equals(name))
                .findAny().orElse(null);
    }


    public List<Entity> getEntityFromRoot(Entity entity, List<Entity> data) {
        return data.stream()
                .filter(entity1 -> entity1.getName().equals(entity.getRootEntity().getName()))
                .collect(Collectors.toList());
    }
}
//todo : entitytype : agence / offre / practice /secteur
