package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.Practicante;
import com.example.demo.repository.PracticanteRepository;
import com.example.demo.service.PracticanteService;

@Service
public class PracticanteServiceImpl implements PracticanteService {

	@Autowired
	private PracticanteRepository practicantedao;
	
	@Override
	public Practicante create(Practicante a) {
		// TODO Auto-generated method stub
		return practicantedao.save(a);
	}

	@Override
	public Practicante update(Practicante a) {
		// TODO Auto-generated method stub
		return practicantedao.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		practicantedao.deleteById(id);
	}

	@Override
	public Optional<Practicante> read(Long id) {
		// TODO Auto-generated method stub
		return practicantedao.findById(id);
	}

	@Override
	public List<Practicante> readAll() {
		// TODO Auto-generated method stub
		return practicantedao.findAll();
	}
	

}
