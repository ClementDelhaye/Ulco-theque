package com.univlittoral.projectbackmaster.controller;

import com.univlittoral.projectbackmaster.dto.AuteurDTO;
import com.univlittoral.projectbackmaster.mapper.AuteurMapper;
import com.univlittoral.projectbackmaster.service.AuteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/rest/bd")
public class AuteurController {
    @Autowired
    private AuteurService service;

    @GetMapping(value = "/auteurs/")
    public List<AuteurDTO> findAuteurs(){return AuteurMapper.map(service.findAuteurs());}

    @GetMapping(value = "/auteurs/{id}")
    public AuteurDTO findAuteur(@PathVariable Long id){return AuteurMapper.map(service.findById(id));}
}
