package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.Carrera;
import com.example.demo.repository.CarreraRepository;
import com.example.demo.service.CarreraService;

@Service
public class CarreraServiceImpl implements CarreraService {

	@Autowired
	private CarreraRepository carreraRepository;
	
	@Override
	public Carrera create(Carrera a) {
		// TODO Auto-generated method stub
		return carreraRepository.save(a);
	}

	@Override
	public Carrera update(Carrera a) {
		// TODO Auto-generated method stub
		return carreraRepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		carreraRepository.deleteById(id);
	}

	@Override
	public Optional<Carrera>  read(Long id) {
		// TODO Auto-generated method stub
		return carreraRepository.findById(id);
	}

	@Override
	public List<Carrera> readAll() {
		// TODO Auto-generated method stub
		return carreraRepository.findAll();
	}
	

}