package com.univlittoral.projectbackmaster.service;

import com.univlittoral.projectbackmaster.entity.LivreEntity;
import com.univlittoral.projectbackmaster.repository.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HomeService {

    @Autowired
    private LivreRepository repo;

    public List<LivreEntity> findLivres(){return repo.findAll();}

    public LivreEntity findById(Long id){return repo.findById(id).orElse(null);}

    public void deleteById(Long id){repo.deleteById(id);}

    public void save(LivreEntity entity){repo.save(entity);}

    public List<LivreEntity> findByParam(String param) {return repo.findAllByGenre(param);}
}
