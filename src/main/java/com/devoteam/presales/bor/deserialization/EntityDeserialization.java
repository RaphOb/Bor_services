package com.devoteam.presales.bor.models;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

public class EntityDeserialization extends StdDeserializer<Entity> {

    public EntityDeserialization() {
        this(null);
    }
    private EntityDeserialization(Class<?> vc)
    {
        super(vc);
    }

    public Entity deserialize(JsonParser jp, DeserializationContext ctxt)
            throws IOException {
        com.fasterxml.jackson.databind.ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        SimpleModule module = new SimpleModule();
        module.addDeserializer(Entity.class, new EntityFDeserialization());
        mapper.registerModule(module);
        TypeReference<List<Entity>> typeReferenceEntity = new TypeReference<>() {};
        FileInputStream inputStreamEntity = new FileInputStream("C:\\Users\\oraph\\Desktop\\entity.json");
        List<Entity> entities = mapper.readValue(inputStreamEntity,typeReferenceEntity);
        JsonNode node = jp.getCodec().readTree(jp);
        String name =  node.get("name").asText();
        String entitype = node.get("entityType").asText();
        String rootEntity = node.get("rootEntity").asText();
        Entity entity = new Entity();
        entity = entity.searchEntity(entities, rootEntity);
        return new Entity(name, entitype,entity);
    }
}
