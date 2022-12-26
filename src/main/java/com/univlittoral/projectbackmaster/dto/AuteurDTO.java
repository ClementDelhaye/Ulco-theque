package com.univlittoral.projectbackmaster.dto;

import java.util.Date;

public class AuteurDTO {
    private Long id;
    private String nom;
    private String prenom;
    private Date date_naissance;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
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

    public Date getDateNaissance() {
        return date_naissance;
    }
    public void setDateNaissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }
}
