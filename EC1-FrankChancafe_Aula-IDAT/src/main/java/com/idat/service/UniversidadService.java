package com.idat.service;

import java.util.List;

import com.idat.model.Universidad;

public interface UniversidadService {
	void guardar(Universidad universidad);

	void actualizar(Universidad universidad);

	void eliminar(Integer id);

	List<Universidad> listar();

	Universidad obtener(Integer id);
}
