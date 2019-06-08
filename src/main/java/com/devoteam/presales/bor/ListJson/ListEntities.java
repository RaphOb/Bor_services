package com.devoteam.presales.bor.ListJson;

import com.devoteam.presales.bor.deserialization.EntityDeserialization;
import com.devoteam.presales.bor.models.Entity;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class ListEntities {
    public static List<Entity> entities;
    public ListEntities() throws FileNotFoundException {
        com.fasterxml.jackson.databind.ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        SimpleModule module = new SimpleModule();
        module.addDeserializer(Entity.class, new EntityDeserialization());
        mapper.registerModule(module);

        TypeReference<List<Entity>> typeReferenceEntity = new TypeReference<>() {
        };
        FileInputStream inputStreamEntity = new FileInputStream("C:\\Users\\oraph\\Desktop\\entity.json");

        try {
           entities = mapper.readValue(inputStreamEntity, typeReferenceEntity);
            System.out.println("Entities saved!");
        } catch (IOException e) {
            System.out.println("Unable to save Entities: " + e.getMessage());
        }
    }



}
