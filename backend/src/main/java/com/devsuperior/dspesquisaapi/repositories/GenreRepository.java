package com.devsuperior.dspesquisaapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dspesquisaapi.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long>{

}
