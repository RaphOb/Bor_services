package com.devoteam.presales.bor;

import com.devoteam.presales.bor.models.Entity;
import com.devoteam.presales.bor.models.User;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class UserTest {

    @Parameterized.Parameters
    public static List<User> data() {
        User u1 = new User("o.test@gmail.com", "eric", "morgan");
        User u2 = new User("r.test@gmail.com", "jean", "morison");
        Entity entity = new Entity();
        Entity entity2 = new Entity();
        entity.setName("financial");
        entity2.setName("FBA");
        entity2.setEntityType("service");
        entity.setEntityType("offre");
        u1.setEntity(entity2);
        u2.setEntity(entity);

        return new ArrayList<User>() {{
            add(u1);
            add(u2);
        }};
    }

    @Test
    public void ceateUserTest() {
        User user = new User();
        user.setEmail("raphael@gmail.com");
        user.setFirstname("testUser1");
        user.setLastname("testUser2");

        assertThat(user.getFirstname()).isEqualTo("testUser1");
    }

    @Test
    public void searchUserfromEntity()
    {
        List<User> user = new ArrayList<>();
        List<User> usertoSearchList = new ArrayList<>();
        User usertoSearch = new User();
        user = data();
        Entity entity = new Entity();
        entity.setName("financial");
        entity.setEntityType("offre");

        usertoSearchList = usertoSearch.getUserfromEntity(entity, user);

        assertThat(usertoSearchList.get(0).getFirstname().equals(data().get(0).getFirstname()));


    }
}
