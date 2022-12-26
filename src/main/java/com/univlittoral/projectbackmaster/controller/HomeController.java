package com.univlittoral.projectbackmaster.controller;

import com.univlittoral.projectbackmaster.dto.HomeDTO;
import com.univlittoral.projectbackmaster.dto.LivreDTO;
import com.univlittoral.projectbackmaster.entity.LivreEntity;
import com.univlittoral.projectbackmaster.mapper.LivreMapper;
import com.univlittoral.projectbackmaster.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/rest/bd")
public class HomeController {

    @Autowired
    private HomeService service;

    @GetMapping(value = "/home")
    public HomeDTO getHome(){
        HomeDTO home = new HomeDTO();
        List<LivreDTO> livres = LivreMapper.map(service.findLivres());
        home.setLivres(livres);
        return home;
    }

    @GetMapping(value = "/livres/{id}")
    public LivreDTO findLivre(@PathVariable Long id){
        return LivreMapper.map(service.findById(id));
    }

    @DeleteMapping(value="/livres/{id}")
    public void deleteLivre(@PathVariable Long id) {service.deleteById(id);}

    @PostMapping(value = "/livres/")
    void postLivre(@RequestBody LivreDTO livreRequestDTO) {
        service.save(LivreMapper.map(livreRequestDTO));
    }

    @PutMapping(value="/livres/{id}/")
    final void UpdateLivre(@RequestBody LivreDTO update, @PathVariable Long id) {
        final LivreEntity livre = service.findById(id);
        livre.setId(update.getId());
        livre.setNbPages(update.getNbPages());
        livre.setNom(update.getNom());
        livre.setEditeur(update.getEditeur());
        livre.setLieuParution(update.getLieuParution());
        livre.setDateParution(update.getDateParution());
        livre.setGenre(update.getGenre());
        livre.setAuteur(update.getAuteur());

        service.save(livre);
    }

    @GetMapping(value="/livres")
    public List<LivreDTO> findAllByGenre(@RequestParam("genre") String param){
        List<LivreEntity> livre = service.findByParam(param);
        return LivreMapper.map(livre);
    }
}
