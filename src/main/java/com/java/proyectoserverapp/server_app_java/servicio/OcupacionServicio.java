package com.java.proyectoserverapp.server_app_java.servicio;

import com.java.proyectoserverapp.server_app_java.modelo.Ocupacion;
import com.java.proyectoserverapp.server_app_java.repositorio.OcupacionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OcupacionServicio {

    @Autowired
    private OcupacionRepositorio ocupacionRepositorio;


    public <S extends Ocupacion> S save(S entity) {
        return ocupacionRepositorio.save(entity);
    }

    public List<Ocupacion> findAll() {
        return ocupacionRepositorio.findAll();
    }

}
