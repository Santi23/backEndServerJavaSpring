package com.java.proyectoserverapp.server_app_java.modelo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "cliente")
public class Cliente {

	@Id
	private Long idenficacion;
	private String nombres;
	private String apellidos;
	private String correo_electronico;
	private String telefono;
	private String ocupacion;
	private Date fecha_nacimiento;
	
	
	@ManyToOne
	@JoinColumn (name = "id_ciudad")
	private Ciudad ciudad;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	
	public Cliente(Long idenficacion, String nombres, String apellidos, String correo_electronico, String telefono,
			Date fecha_nacimiento, String ocupacion, Ciudad ciudad) {
		super();
		this.idenficacion = idenficacion;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.correo_electronico = correo_electronico;
		this.telefono = telefono;
		this.fecha_nacimiento = fecha_nacimiento;
		this.ocupacion = ocupacion;
		this.ciudad = ciudad;
	}
	
		
	public Long getIdenficacion() {
		return idenficacion;
	}
	public void setIdenficacion(Long idenficacion) {
		this.idenficacion = idenficacion;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCorreo_electronico() {
		return correo_electronico;
	}
	public void setCorreo_electronico(String correo_electronico) {
		this.correo_electronico = correo_electronico;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	
}
