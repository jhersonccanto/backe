package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EstadoPPP;
import com.example.demo.repository.EstadoPPPRepository;
import com.example.demo.service.EstadoPPPService;

@Service
public class EstadoPPPServiceImpl implements EstadoPPPService {

	@Autowired
	private EstadoPPPRepository estadoPPPrepository;
	
	@Override
	public EstadoPPP create(EstadoPPP a) {
		// TODO Auto-generated method stub
		return estadoPPPrepository.save(a);
	}

	@Override
	public EstadoPPP update(EstadoPPP a) {
		// TODO Auto-generated method stub
		return estadoPPPrepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		estadoPPPrepository.deleteById(id);
	}

	@Override
	public Optional<EstadoPPP>  read(Long id) {
		// TODO Auto-generated method stub
		return estadoPPPrepository.findById(id);
	}

	@Override
	public List<EstadoPPP> readAll() {
		// TODO Auto-generated method stub
		return estadoPPPrepository.findAll();
	}
	

}