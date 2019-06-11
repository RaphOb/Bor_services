package com.devoteam.presales.bor;

import com.devoteam.presales.bor.models.Audience;
import com.devoteam.presales.bor.models.Entity;
import com.devoteam.presales.bor.models.User;
import org.junit.Test;
import org.junit.runners.Parameterized;
import com.devoteam.presales.bor.models.User;

import java.util.ArrayList;
import java.util.List;


import static org.assertj.core.api.Assertions.assertThat;

public class AudienceTest {

    @Parameterized.Parameters
    public static List<Audience> data() {
        List<Audience> auds = new ArrayList<>();
        List<User> l1 = new ArrayList<>();
        List<User> l2 = new ArrayList<>();
        User user1 = new User("o.rapou", "eric", "boula");
        User user2 = new User("o.ss", "john", "smith");
        Entity entity = new Entity();
        entity.setEntityType("finance");
        entity.setName("bfa");
        l1.add(user1);
        l2.add(user2);
        Audience a1 = new Audience();
        a1.setEntity(entity);
        a1.setOptional(l1);
        a1.setMandatory(l2);
        a1.setStageBor(1);
        auds.add(a1);
        return auds;
    }

    @Test
    public void lookforAudianceTest()
    {
        List<Audience> audiences = data();
        Entity ent = new Entity();
        ent.setName("bfa");
        ent.setEntityType("finance");
        Integer bor =  1;
        List<User> uL;
        Audience audience = new Audience();
        uL = audience.getMandatoryFromEntity(ent, bor, audiences);
        System.out.print(uL.get(0));
        assertThat(uL.get(0).equals(audiences.get(0).getMandatory().get(0)));
    }
    @Test
    public void lookforAudianceOTest()
    {
        List<Audience> audiences = data();
        Entity ent = new Entity();
        ent.setName("bfa");
        ent.setEntityType("finance");
        Integer bor =  1;
        List<User> uL;
        Audience audience = new Audience();
        uL = audience.getOptionalFromEntity(ent, bor, audiences);
        System.out.print(uL.get(0));
        assertThat(uL.get(0).equals(audiences.get(0).getMandatory().get(0)));
    }

    @Test
    public void createAudienceTest() {

        User user = new User();
        user.setEmail("test@test.com");
        user.setLastname("test");
        Audience audience = new Audience();
        audience.setStageBor(1);
        List<User> mandatory = new ArrayList<>();
        mandatory.add(user);
        audience.setMandatory(mandatory);

        assertThat(mandatory.get(0).getEmail()).isEqualTo("test@test.com");
    }
}
