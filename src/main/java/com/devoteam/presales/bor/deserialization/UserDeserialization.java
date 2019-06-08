package com.devoteam.presales.bor.deserialization;

import com.devoteam.presales.bor.models.Entity;
import com.devoteam.presales.bor.ListJson.ListEntities;
import com.devoteam.presales.bor.models.User;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

public class UserDeserialization extends StdDeserializer<User> {

    public UserDeserialization() {
        this(null);
    }

    public UserDeserialization(Class<?> vc) {
        super(vc);
    }

    @Override
    public User deserialize(JsonParser jp, DeserializationContext ctxt)
            throws IOException {
        JsonNode node = jp.getCodec().readTree(jp);
        String firstname = node.get("firstname").asText();
        String lastname = node.get("lastname").asText();
        String email = node.get("email").asText();
        String name = node.get("entity").asText();
        Entity entity = new Entity();
        ListEntities l = new ListEntities();
        entity = entity.searchEntity(ListEntities.entities, name);
        return new User(firstname, lastname, email, entity);
    }
}
