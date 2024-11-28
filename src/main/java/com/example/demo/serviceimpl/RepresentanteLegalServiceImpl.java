package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.RepresentanteLegal;
import com.example.demo.repository.RepresentanteLegalRepository;
import com.example.demo.service.RepresentanteLegalService;

@Service
public class RepresentanteLegalServiceImpl implements RepresentanteLegalService {

	@Autowired
	private RepresentanteLegalRepository representantelegaldao;
	
	@Override
	public RepresentanteLegal create(RepresentanteLegal a) {
		// TODO Auto-generated method stub
		return representantelegaldao.save(a);
	}

	@Override
	public RepresentanteLegal update(RepresentanteLegal a) {
		// TODO Auto-generated method stub
		return representantelegaldao.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		representantelegaldao.deleteById(id);
	}

	@Override
	public Optional<RepresentanteLegal> read(Long id) {
		// TODO Auto-generated method stub
		return representantelegaldao.findById(id);
	}

	@Override
	public List<RepresentanteLegal> readAll() {
		// TODO Auto-generated method stub
		return representantelegaldao.findAll();
	}
	

}
