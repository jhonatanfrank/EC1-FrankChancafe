package com.idat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.model.Mallacurricular;
import com.idat.repository.MallacurricularRepository;

@Service
public class MallacurricularServiceImp implements MallacurricularService {
	
	@Autowired
	private MallacurricularRepository repositorio;

	@Override
	public void guardar(Mallacurricular mallacurricular) {
		// TODO Auto-generated method stub
		repositorio.save(mallacurricular);

	}

	@Override
	public void actualizar(Mallacurricular mallacurricular) {
		// TODO Auto-generated method stub
		repositorio.saveAndFlush(mallacurricular);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);

	}

	@Override
	public List<Mallacurricular> listar() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Mallacurricular obtener(Integer id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id).orElse(null);
	}

}
