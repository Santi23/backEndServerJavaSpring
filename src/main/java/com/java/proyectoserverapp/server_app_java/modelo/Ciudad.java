package com.java.proyectoserverapp.server_app_java.modelo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@Table (name = "ciudad")
public class Ciudad implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_ciudad;
	private String nombre_ciudad;

	
}
