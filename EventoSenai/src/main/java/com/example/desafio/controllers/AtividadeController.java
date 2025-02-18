package com.example.desafio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.desafio.models.Atividade;
import com.example.desafio.repositories.AtividadeRepository;

@RestController
@RequestMapping("/atividades")
public class AtividadeController {

    @Autowired
    private AtividadeRepository atividadeRepository;


    @GetMapping
    public List<Atividade> listarAtividades() {
        return atividadeRepository.findAll();
    }

    @PostMapping
    public Atividade adicionarAtividade(@RequestBody Atividade atividade) {
        return atividadeRepository.save(atividade);
    }
    
}