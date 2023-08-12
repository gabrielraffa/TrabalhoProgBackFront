package com.example.projetogabriel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projetogabriel.model.Pessoa;

@Repository
public interface IndividuoRepository extends JpaRepository<Individuo, Long>
{

}
