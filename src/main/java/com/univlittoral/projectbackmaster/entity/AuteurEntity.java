package com.univlittoral.projectbackmaster.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="auteur")
public class AuteurEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String prenom;
    private Date date_naissance;

    @OneToMany(targetEntity=LivreEntity.class, mappedBy="auteur",cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private List<LivreEntity> livres;

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

    public List<LivreEntity> getLivres() {
        return livres;
    }
    public void setLivres(List<LivreEntity> livres) {this.livres = livres;}
}
