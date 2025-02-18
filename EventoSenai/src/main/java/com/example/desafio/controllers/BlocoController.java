package com.example.desafio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.desafio.models.Bloco;
import com.example.desafio.repositories.BlocoRepository;

@RestController
@RequestMapping("/blocos")
public class BlocoController {

    @Autowired
    private BlocoRepository blocoRepository;

    @GetMapping
    public List<Bloco> listarBlocos() {
        return blocoRepository.findAll();
    }

}
