package com.univlittoral.projectbackmaster.dto;

import java.util.List;

public class HomeDTO {
    private IndicateursDTO indicateur;
    private List<LivreDTO> livres;

    public IndicateursDTO getIndicateurs() {return indicateur;}
    public void setIndicateurs(IndicateursDTO indicateur) {this.indicateur = indicateur;}

    public List<LivreDTO> getLivres() {return livres;}
    public void setLivres(List<LivreDTO> livres) {
        this.livres = livres;
    }
}
