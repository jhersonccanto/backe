package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Rol;
import com.example.demo.repository.RolRepository;
import com.example.demo.service.RolService;

@Service
public class RolServiceImpl implements RolService {

	@Autowired
	private RolRepository roldao;
	
	@Override
	public Rol create(Rol a) {
		// TODO Auto-generated method stub
		return roldao.save(a);
	}

	@Override
	public Rol update(Rol a) {
		// TODO Auto-generated method stub
		return roldao.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		roldao.deleteById(id);
	}

	@Override
	public Optional<Rol> read(Long id) {
		// TODO Auto-generated method stub
		return roldao.findById(id);
	}

	@Override
	public List<Rol> readAll() {
		// TODO Auto-generated method stub
		return roldao.findAll();
	}
	

}
