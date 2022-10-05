package com.idat.service;

import java.util.List;

import com.idat.model.Mallacurricular;

public interface MallacurricularService {
	void guardar(Mallacurricular mallacurricular);

	void actualizar(Mallacurricular mallacurricular);

	void eliminar(Integer id);

	List<Mallacurricular> listar();

	Mallacurricular obtener(Integer id);
}
