package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Linea;
import com.example.demo.repository.LineaRepository;
import com.example.demo.service.LineaService;

@Service
public class LineaServiceImpl implements LineaService {

	@Autowired
	private LineaRepository linearepo;
	
	@Override
	public Linea create(Linea a) {
		// TODO Auto-generated method stub
		return linearepo.save(a);
	}

	@Override
	public Linea update(Linea a) {
		// TODO Auto-generated method stub
		return linearepo.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		linearepo.deleteById(id);
	}

	@Override
	public Optional<Linea> read(Long id) {
		// TODO Auto-generated method stub
		return linearepo.findById(id);
	}

	@Override
	public List<Linea> readAll() {
		// TODO Auto-generated method stub
		return linearepo.findAll();
	}
	

}
