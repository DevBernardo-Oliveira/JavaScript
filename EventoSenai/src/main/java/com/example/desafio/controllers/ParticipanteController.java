package com.example.desafio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.desafio.models.Participante;
import com.example.desafio.repositories.ParticipanteRepository;

@RestController
@RequestMapping("/participantes")
public class ParticipanteController {

    @Autowired
    private ParticipanteRepository participanteRepository;

    @GetMapping
    public List<Participante> listarParticipantes() {
        return participanteRepository.findAll();
    }

    @PostMapping
    public Participante adicionarParticipante(@RequestBody Participante participante) {
        return participanteRepository.save(participante);
    }
}