package com.idat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.idat.model.Mallacurricular;
import com.idat.service.MallacurricularService;

@RestController
@RequestMapping("/mallacurricular/v1")
public class MallacurricularController {

	@Autowired
	private MallacurricularService service;

	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<Mallacurricular>> listar() {
		return new ResponseEntity<List<Mallacurricular>>(service.listar(), HttpStatus.OK);
	}

	@RequestMapping(path = "/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar(@RequestBody Mallacurricular mallacurrilar) {
		service.guardar(mallacurrilar);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@RequestMapping(path = "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<Mallacurricular> obtenerPorId(@PathVariable Integer id) {
		Mallacurricular mallacurricular = service.obtener(id);
		if (mallacurricular != null) {
			return new ResponseEntity<Mallacurricular>(mallacurricular, HttpStatus.OK);
		} else {
			return new ResponseEntity<Mallacurricular>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(path = "/editar", method = RequestMethod.PUT)
	public ResponseEntity<Void> editar(@RequestBody Mallacurricular mallacurricular) {

		Mallacurricular m = service.obtener(mallacurricular.getIdMalla());

		if (m != null) {
			service.actualizar(mallacurricular);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(path = "/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
		Mallacurricular mallacurricular = service.obtener(id);

		if (mallacurricular != null) {
			service.eliminar(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}

}
