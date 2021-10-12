package com.java.proyectoserverapp.server_app_java.REST;


import com.java.proyectoserverapp.server_app_java.modelo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.proyectoserverapp.server_app_java.modelo.Ocupacion;
import com.java.proyectoserverapp.server_app_java.servicio.OcupacionServicio;

import java.util.List;

@RestController
@RequestMapping("/ocupacion/")
public class OcupacionREST {

    @Autowired
    private OcupacionServicio ocupacionServicio;

    @GetMapping
    private ResponseEntity<List<Ocupacion>> getAllOcupaciones (){
        return ResponseEntity.ok(ocupacionServicio.findAll());
    }
}
