package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Mensaje;
import com.example.demo.repository.MensajeRepository;
import com.example.demo.service.MensajeService;

@Service
public class MensajeServiceImpl implements MensajeService {

	@Autowired
	private MensajeRepository mensajerepository;
	
	@Override
	public Mensaje create(Mensaje a) {
		// TODO Auto-generated method stub
		return mensajerepository.save(a);
	}

	@Override
	public Mensaje update(Mensaje a) {
		// TODO Auto-generated method stub
		return mensajerepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		mensajerepository.deleteById(id);
	}

	@Override
	public Optional<Mensaje>  read(Long id) {
		// TODO Auto-generated method stub
		return mensajerepository.findById(id);
	}

	@Override
	public List<Mensaje> readAll() {
		// TODO Auto-generated method stub
		return mensajerepository.findAll();
	}
	

}
