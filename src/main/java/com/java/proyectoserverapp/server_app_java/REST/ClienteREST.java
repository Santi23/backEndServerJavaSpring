package com.java.proyectoserverapp.server_app_java.REST;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.proyectoserverapp.server_app_java.modelo.Cliente;
import com.java.proyectoserverapp.server_app_java.servicio.ClienteServicio;

@RestController
@RequestMapping ("/cliente/")
public class ClienteREST {

	@Autowired
	private ClienteServicio clienteServicio;
	
	@GetMapping
	private ResponseEntity<List<Cliente>> getAllClientes (){
		return ResponseEntity.ok(clienteServicio.findAll());
	}
	
	@PostMapping
	private ResponseEntity<Cliente> guardarCliente (@RequestBody Cliente cliente){
		try {
			Cliente clienteAGuardar = clienteServicio.save(cliente);
			return ResponseEntity.created(new URI("/cliente/"+clienteAGuardar.getIdenficacion())).body(clienteAGuardar);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@DeleteMapping (value = "delete/{identificacion}")
	private ResponseEntity<Boolean> borrarCliente (@PathVariable ("identificacion") Long identificacion){
		clienteServicio.deleteById(identificacion);
		return ResponseEntity.ok(!(clienteServicio.findById(identificacion)!=null));
	}
	
}
