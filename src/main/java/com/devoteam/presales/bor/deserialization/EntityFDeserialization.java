package com.devoteam.presales.bor.deserialization;

import com.devoteam.presales.bor.models.Entity;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

/**
 * First Deserialization to build a list Entities
 */
public class EntityFDeserialization extends StdDeserializer<Entity> {

    public EntityFDeserialization() {
        this(null);
    }

    private EntityFDeserialization(Class<?> vc) {
        super(vc);
    }

    public Entity deserialize(JsonParser jp, DeserializationContext ctxt)
            throws IOException {
        JsonNode node = jp.getCodec().readTree(jp);
        String name = node.get("name").asText();
        String entitype = node.get("entityType").asText();
        String rootEntity = node.get("rootEntity").asText();
        Entity entity = new Entity();
        entity.setName(rootEntity);
        return new Entity(name, entitype, entity);
    }
}

