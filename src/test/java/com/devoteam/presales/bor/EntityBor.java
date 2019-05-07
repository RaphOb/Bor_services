package com.devoteam.presales.bor;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EntityBor {

    @Test
    public void ceateEntityTest() {
        Entity entity = new Entity();
        entity.setEntityType("Offers");
        entity.setName("TOTAL");

        assertThat(entity.getEntityType()).isEqualTo("Offers");
    }
}
