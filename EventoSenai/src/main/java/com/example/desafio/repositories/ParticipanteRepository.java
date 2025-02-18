package com.example.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.desafio.models.Participante;

public interface ParticipanteRepository extends JpaRepository<Participante,Integer> {

}
