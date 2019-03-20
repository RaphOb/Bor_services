package com.devoteam.presales.testspringsecu;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class UsersDevo {


    private Long ID;
    private String email;
    private String nom;
    private String prenom;
    private String service;



    public Long getId() {
        return ID;
    }

    public void setId(Long id) {
        this.ID = ID;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public UsersDevo(String raph, String email, String avv, String oba, int i) {

    }

}
