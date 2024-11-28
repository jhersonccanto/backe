package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.PlanCarrera;
import com.example.demo.repository.PlanCarreraRepository;
import com.example.demo.service.PlanCarreraService;

@Service
public class PlanCarreraServiceImpl implements PlanCarreraService {

	@Autowired
	private PlanCarreraRepository plancarreradao;

	@Override
	public PlanCarrera create(PlanCarrera a) {
		// TODO Auto-generated method stub
		return plancarreradao.save(a);
	}

	@Override
	public PlanCarrera update(PlanCarrera a) {
		// TODO Auto-generated method stub
		return plancarreradao.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		plancarreradao.deleteById(id);
	}

	@Override
	public Optional<PlanCarrera> read(Long id) {
		// TODO Auto-generated method stub
		return plancarreradao.findById(id);
	}

	@Override
	public List<PlanCarrera> readAll() {
		// TODO Auto-generated method stub
		return plancarreradao.findAll();
	}

}
