package com.univlittoral.projectbackmaster.mapper;

import com.univlittoral.projectbackmaster.dto.LivreDTO;
import com.univlittoral.projectbackmaster.entity.LivreEntity;

import java.util.ArrayList;
import java.util.List;

public class LivreMapper {

    public static LivreDTO map(LivreEntity entity){
        LivreDTO livre = new LivreDTO();

        livre.setId(entity.getId());
        livre.setNom(entity.getNom());
        livre.setEditeur(entity.getEditeur());
        livre.setNbPages(entity.getNbPages());
        livre.setDateParution(entity.getDateParution());
        livre.setLieuParution(entity.getLieuParution());
        livre.setGenre(entity.getGenre());
        livre.setAuteur(entity.getAuteur());

        return livre;
    }
    public static LivreEntity map(LivreDTO dto){
        LivreEntity livre = new LivreEntity();

        livre.setId(dto.getId());
        livre.setNom(dto.getNom());
        livre.setEditeur(dto.getEditeur());
        livre.setNbPages(dto.getNbPages());
        livre.setDateParution(dto.getDateParution());
        livre.setLieuParution(dto.getLieuParution());
        livre.setGenre(dto.getGenre());
        livre.setAuteur(dto.getAuteur());

        return livre;
    }

    public static List<LivreDTO> map(List<LivreEntity> entities){
        if(null == entities) {
            return null;
        }
        List<LivreDTO> result = new ArrayList<LivreDTO>();
        for(final LivreEntity user : entities) {
            result.add(LivreMapper.map(user));
        }

        return result;
    }
}
