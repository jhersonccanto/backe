package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Persona;
import com.example.demo.repository.PersonaRepository;
import com.example.demo.service.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	private PersonaRepository personadao;
	
	private PersonaRepository repository;
	
	@Override
	public Persona create(Persona a) {
		// TODO Auto-generated method stub
		return personadao.save(a);
	}

	@Override
	public Persona update(Persona a) {
		// TODO Auto-generated method stub
		return personadao.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		personadao.deleteById(id);
	}

	@Override
	public Optional<Persona>  read(Long id) {
		// TODO Auto-generated method stub
		return personadao.findById(id);
	}

	@Override
	public List<Persona> readAll() {
		// TODO Auto-generated method stub
		return personadao.findAll();
	}
	@Override
	public void deletePersonasBatch(List<Long> ids) {
	    repository.deleteAllById(ids); 
	}

}
