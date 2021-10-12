package com.java.proyectoserverapp.server_app_java.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.java.proyectoserverapp.server_app_java.modelo.Ciudad;
import com.java.proyectoserverapp.server_app_java.repositorio.CiudadRepositorio;

@Service
public class CiudadServicio {

	@Autowired
	private CiudadRepositorio ciudadRepositorio;
	
	public List<Ciudad> findAll() {
		return ciudadRepositorio.findAll();
	}

	public List<Ciudad> findAll(Sort sort) {
		return ciudadRepositorio.findAll(sort);
	}
}
