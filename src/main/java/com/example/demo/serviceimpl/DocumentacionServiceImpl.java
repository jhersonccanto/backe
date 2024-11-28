package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.Documentacion;
import com.example.demo.repository.DocumentacionRepository;
import com.example.demo.service.DocumentacionService;

@Service
public class DocumentacionServiceImpl implements DocumentacionService {

	@Autowired
	private DocumentacionRepository documentacionRepository;
	
	@Override
	public Documentacion create(Documentacion a) {
		// TODO Auto-generated method stub
		return documentacionRepository.save(a);
	}

	@Override
	public Documentacion update(Documentacion a) {
		// TODO Auto-generated method stub
		return documentacionRepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		documentacionRepository.deleteById(id);
	}

	@Override
	public Optional<Documentacion>  read(Long id) {
		// TODO Auto-generated method stub
		return documentacionRepository.findById(id);
	}

	@Override
	public List<Documentacion> readAll() {
		// TODO Auto-generated method stub
		return documentacionRepository.findAll();
	}
	

}

