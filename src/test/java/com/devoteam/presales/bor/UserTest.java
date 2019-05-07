package com.devoteam.presales.bor;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class UserTest {

    @Test
    public void ceateUserTest() {
        User user = new User();
        user.setEmail("raphael@gmail.com");
        user.setFirstname("testUser1");
        user.setLastname("testUser2");

        assertThat(user.getFirstname()).isEqualTo("testUser1");
    }

}
