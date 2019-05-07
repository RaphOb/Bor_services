package com.devoteam.presales.bor;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import static org.assertj.core.api.Assertions.assertThat;

public class AudienceTest {

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
