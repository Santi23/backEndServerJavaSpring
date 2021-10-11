package com.java.proyectoserverapp.server_app_java.REST;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.proyectoserverapp.server_app_java.modelo.Ciudad;
import com.java.proyectoserverapp.server_app_java.servicio.CiudadServicio;

@RestController
@RequestMapping ("/ciudad/")
public class CiudadREST {

	@Autowired
	private CiudadServicio ciudadServicio;
	
	@GetMapping
	private ResponseEntity<List<Ciudad>> getAllCiudades (){
		return ResponseEntity.ok(ciudadServicio.findAll());
	}
}
