package com.devoteam.presales.bor;

import com.devoteam.presales.bor.models.Entity;
import org.junit.Test;
import org.junit.runners.Parameterized;


import javax.validation.constraints.AssertTrue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class EntityBor {

    @Parameterized.Parameters
    public static List<Entity> data()
    {
        Entity e1 = new Entity();
        e1.setName("BFA");
        e1.setEntityType("secteur");
        Entity e2 =  new Entity();
        e2.setName("finance");
        e2.setEntityType("offre");
        e2.setRootEntity(e1);
        Entity[] data = new Entity[]{e1, e2};

        return Arrays.asList(data);
    }

    @Test
    public void ceateEntityTest() {
        Entity entity = new Entity();
        entity.setEntityType("Offers");
        entity.setName("TOTAL");


        assertThat(entity.getEntityType()).isEqualTo("Offers");
    }

    @Test
    public void retrieveEntity()
    {
        List<Entity> data = data();
       Entity e1 = data.get(0);
        Entity e2 = data.get(1);

        Entity ent = new Entity();
        List<Entity> ent2 = new ArrayList<>();
        ent2 = ent.getEntityFromRoot(e2,data);
        System.out.println(ent2.get(0).getName());
       assertThat(ent2.get(0).getName()).isEqualTo(e2.getRootEntity().getName());

    }
}
//TODO trois entité (BFA, I&T, ) trois users  (un a bfa, un i&t)  une audiance
// demande de bor creation de pure java demande de bor creation agenda
// mettre à jour date time une fois que