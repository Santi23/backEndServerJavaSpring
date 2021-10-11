package com.java.proyectoserverapp.server_app_java.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "ciudad")
public class Ciudad {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_ciudad;
	private String nombre_ciudad;
	
	public Ciudad() {
	
	}
	
	public Ciudad(String nombre_ciudad) {
		super();
		this.nombre_ciudad = nombre_ciudad;
	}
	
	
	
	public Long getId_ciudad() {
		return id_ciudad;
	}

	public String getNombre_ciudad() {
		return nombre_ciudad;
	}
	public void setNombre_ciudad(String nombre_ciudad) {
		this.nombre_ciudad = nombre_ciudad;
	}
	
	
	
}
