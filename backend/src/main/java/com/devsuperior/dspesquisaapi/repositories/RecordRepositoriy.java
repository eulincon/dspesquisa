package com.devsuperior.dspesquisaapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dspesquisaapi.entities.Record;

public interface RecordRepositoriy extends JpaRepository<Record, Long>{

}
