package com.devoteam.presales.testspringsecu;

import javax.persistence.*;

@Entity
public class Devo {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String Firstname;
    private String Lastname;
    private String Email;

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public DevoEntity getDevoEntity() {
        return devoEntity;
    }

    public void setDevoEntity(DevoEntity devoEntity) {
        this.devoEntity = devoEntity;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Embedded
    private DevoEntity devoEntity;

}
