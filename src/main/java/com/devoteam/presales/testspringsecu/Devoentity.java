package com.devoteam.presales.testspringsecu;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Embeddable;

@Data
@AllArgsConstructor
@Embeddable
public class Devoentity {
    private String devoentity;

    public String getEntity() {
        return devoentity;
    }

    public void setEntity(String entity) {
        this.devoentity = devoentity;
    }
    public Devoentity(){}
}
