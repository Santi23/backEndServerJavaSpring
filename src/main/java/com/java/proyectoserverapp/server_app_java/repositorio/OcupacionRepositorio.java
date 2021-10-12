package com.java.proyectoserverapp.server_app_java.repositorio;

import com.java.proyectoserverapp.server_app_java.modelo.Ocupacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OcupacionRepositorio extends JpaRepository<Ocupacion, Long> {
}
