package com.univlittoral.projectbackmaster.service;

import com.univlittoral.projectbackmaster.entity.AuteurEntity;
import com.univlittoral.projectbackmaster.repository.AuteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuteurService {

    @Autowired
    private AuteurRepository repo;

    public List<AuteurEntity> findAuteurs(){return repo.findAll();}

    public AuteurEntity findById(Long id){return repo.findById(id).orElse(null);}




}
