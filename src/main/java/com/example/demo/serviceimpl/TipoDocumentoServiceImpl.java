package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.TipoDocumento;
import com.example.demo.repository.TipoDocumentoRepository;
import com.example.demo.service.TipoDocumentoService;

@Service
public class TipoDocumentoServiceImpl implements TipoDocumentoService {

	@Autowired
	private TipoDocumentoRepository tipodocumentorepo;
	
	@Override
	public TipoDocumento create(TipoDocumento a) {
		// TODO Auto-generated method stub
		return tipodocumentorepo.save(a);
	}

	@Override
	public TipoDocumento update(TipoDocumento a) {
		// TODO Auto-generated method stub
		return tipodocumentorepo.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		tipodocumentorepo.deleteById(id);
	}

	@Override
	public Optional<TipoDocumento> read(Long id) {
		// TODO Auto-generated method stub
		return tipodocumentorepo.findById(id);
	}

	@Override
	public List<TipoDocumento> readAll() {
		// TODO Auto-generated method stub
		return tipodocumentorepo.findAll();
	}
	

}
