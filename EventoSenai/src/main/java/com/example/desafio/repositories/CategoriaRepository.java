package com.example.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.desafio.models.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
