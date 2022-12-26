package com.univlittoral.projectbackmaster.mapper;

import com.univlittoral.projectbackmaster.dto.AuteurDTO;
import com.univlittoral.projectbackmaster.entity.AuteurEntity;

import java.util.ArrayList;
import java.util.List;

public class AuteurMapper {
    public static AuteurDTO map(AuteurEntity entity){
        AuteurDTO auteur = new AuteurDTO();

        auteur.setId(entity.getId());
        auteur.setNom(entity.getNom());
        auteur.setPrenom(entity.getPrenom());
        auteur.setDateNaissance(entity.getDateNaissance());

        return auteur;
    }

    public static List<AuteurDTO> map(List<AuteurEntity> entities){
        if(null == entities) {
            return null;
        }
        List<AuteurDTO> result = new ArrayList<AuteurDTO>();
        for(final AuteurEntity user : entities) {
            result.add(AuteurMapper.map(user));
        }

        return result;
    }
}
