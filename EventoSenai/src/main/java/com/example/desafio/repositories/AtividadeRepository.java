package com.example.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.desafio.models.Atividade;

public interface AtividadeRepository extends JpaRepository<Atividade, Integer> {

}
