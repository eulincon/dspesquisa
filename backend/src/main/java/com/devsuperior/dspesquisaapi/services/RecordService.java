package com.devsuperior.dspesquisaapi.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dspesquisaapi.dto.RecordDTO;
import com.devsuperior.dspesquisaapi.dto.RecordInsertDTO;
import com.devsuperior.dspesquisaapi.entities.Game;
import com.devsuperior.dspesquisaapi.entities.Record;
import com.devsuperior.dspesquisaapi.repositories.GameRepository;
import com.devsuperior.dspesquisaapi.repositories.RecordRepository;

@Service
public class RecordService {
	
	@Autowired
	private RecordRepository repository;
	
	@Autowired
	private GameRepository gameRepository;

	@Transactional
	public RecordDTO insert(RecordInsertDTO dto) {
		Record entity = new Record();
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());
		
		Game game = gameRepository.getOne(dto.getGameId());
		entity.setGame(game);
		
		entity = repository.save(entity);
		return new RecordDTO(entity);
	}
	
}
