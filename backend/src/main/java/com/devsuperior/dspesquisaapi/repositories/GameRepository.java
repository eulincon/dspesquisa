package com.devsuperior.dspesquisaapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dspesquisaapi.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
