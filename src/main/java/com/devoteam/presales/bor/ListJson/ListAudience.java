package com.devoteam.presales.bor.ListJson;

import com.devoteam.presales.bor.deserialization.AudienceDeserialization;
import com.devoteam.presales.bor.models.Audience;
import com.devoteam.presales.bor.models.User;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

public class ListAudience {
    public static List<Audience> audiences;
    public ListAudience() throws FileNotFoundException {
        com.fasterxml.jackson.databind.ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        SimpleModule module = new SimpleModule();
        module.addDeserializer(Audience.class, new AudienceDeserialization());
        mapper.registerModule(module);
        TypeReference<List<Audience>> typeReferenceAudience = new TypeReference<>() {};
        FileInputStream inputStreamAudience = new FileInputStream("C:\\Users\\oraph\\Desktop\\audience.json");
        try {
            audiences = mapper.readValue(inputStreamAudience, typeReferenceAudience);
            System.out.println("Audiences Saved!");
        } catch (Exception e) {
            System.out.println("Unable to save Audiences: " + e.getMessage());
        }
    }
}
