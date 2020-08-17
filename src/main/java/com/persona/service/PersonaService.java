package com.persona.service;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.persona.model.PersonaModel;

@Repository
public interface PersonaService extends MongoRepository<PersonaModel, Integer>{
	
}
