package com.java.proyectoserverapp.server_app_java.modelo;

import lombok.Data;

import java.sql.Date;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Data
@Table (name = "cliente")
public class Cliente implements Serializable {

	@Id
	private Long idenficacion;
	private String nombres;
	private String apellidos;
	private String correo_electronico;
	private String telefono;
	private Date fecha_nacimiento;
    private Boolean viable;


	@ManyToOne
	@JoinColumn (name = "id_ciudad")
	private Ciudad ciudad;

	@ManyToOne
	@JoinColumn (name = "id_ocupacion")
	private Ocupacion ocupacion;
	

}
