package com.univlittoral.projectbackmaster.dto;

import com.univlittoral.projectbackmaster.enums.Genre;

import java.util.Date;

public class LivreDTO {
    private Long id;
    private String nom;
    private String editeur;
    private Integer nb_pages;
    private Date date_parution;
    private String lieu_parution;
    private Genre genre;
    private String auteur;



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

    public String getEditeur() {
        return editeur;
    }
    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public Integer getNbPages() {
        return nb_pages;
    }
    public void setNbPages(Integer nb_pages) {
        this.nb_pages = nb_pages;
    }

    public Date getDateParution() {return date_parution;}
    public void setDateParution(Date date_parution) {
        this.date_parution = date_parution;
    }

    public String getLieuParution() {return lieu_parution;}
    public void setLieuParution(String lieu_parution) {
        this.lieu_parution = lieu_parution;
    }

    public Genre getGenre() {return genre;}
    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getAuteur() {return auteur;}
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
}
