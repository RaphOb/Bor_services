package com.devoteam.presales.bor.deserialization;

import com.devoteam.presales.bor.ListJson.ListUser;
import com.devoteam.presales.bor.models.Audience;
import com.devoteam.presales.bor.models.Entity;
import com.devoteam.presales.bor.ListJson.ListEntities;
import com.devoteam.presales.bor.models.User;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.node.ArrayNode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AudienceDeserialization extends StdDeserializer<Audience> {

    public AudienceDeserialization() {
        this(null);
    }

    private AudienceDeserialization(Class<?> vc) {
        super(vc);
    }

    public Audience deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {

        JsonNode node = jp.getCodec().readTree(jp);
//        String nameEntity = node.get("entity").asText();
        String nameEntity = node.findValue("entity").asText();
        Entity entity = new Entity();
        entity = entity.searchEntity(ListEntities.entities, nameEntity);
        Integer stageBor = node.get("stageBor").asInt();
        ArrayNode arrayNodeM = (ArrayNode) node.get("mandatory");
        ArrayNode arrayNodeO = (ArrayNode) node.get("optional");
        List<JsonNode> listEmailMandatory = arrayNodeM.findValues("email");
        List<JsonNode> listEmailOptional = arrayNodeO.findValues("email");
        List<User> mandatory = new ArrayList<>();
        List<User> optional = new ArrayList<>();

        for (JsonNode x : listEmailMandatory) {

          User  user = User.getUserFromEmail(ListUser.users,x.asText());
            mandatory.add(user);
        }
        for (JsonNode x : listEmailOptional) {
            User user1 = new User();
            user1.setEmail(x.asText());
            optional.add(user1);
        }

        return new Audience(entity, stageBor, mandatory, optional);
    }
}
