package com.devsuperior.dspesquisaapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dspesquisaapi.entities.Record;

@Repository
public interface RecordRepositoriy extends JpaRepository<Record, Long>{

}
