package com.java.proyectoserverapp.server_app_java.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.proyectoserverapp.server_app_java.modelo.Cliente;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, Long>{

}
