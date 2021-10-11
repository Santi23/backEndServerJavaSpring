package com.java.proyectoserverapp.server_app_java.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.java.proyectoserverapp.server_app_java.modelo.Cliente;
import com.java.proyectoserverapp.server_app_java.repositorio.ClienteRepositorio;

@Service
public class ClienteServicio{

	@Autowired
	private ClienteRepositorio clienteRepositorio;

	public List<Cliente> findAll() {
		return clienteRepositorio.findAll();
	}

	public List<Cliente> findAll(Sort sort) {
		return clienteRepositorio.findAll(sort);
	}

	public <S extends Cliente> S save(S entity) {
		return clienteRepositorio.save(entity);
	}

	public Optional<Cliente> findById(Long id) {
		return clienteRepositorio.findById(id);
	}

	public boolean existsById(Long id) {
		return clienteRepositorio.existsById(id);
	}

	public void deleteById(Long id) {
		clienteRepositorio.deleteById(id);
	}

	public void delete(Cliente entity) {
		clienteRepositorio.delete(entity);
	}

}
