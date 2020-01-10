package com.algaworks.leonardo.algaworksjpa.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.leonardo.algaworksjpa.domain.model.Restaurante;
import com.algaworks.leonardo.algaworksjpa.domain.persistence.RestauranteRepository;

@RestController
@RequestMapping("/restaurantes")
public class RestauranteController {

	@Autowired
	RestauranteRepository repository;
	
	@GetMapping(produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	//produces com MediaType para especificar o formato de representação do recurso, dá pra fazer isso no RequestMapping
	public List<Restaurante> listar(){
		return repository.lista();
	}
	//@ResponseStatus(HttpStatus.OK)
	@GetMapping("/{restauranteId}")
	public Restaurante busca(@PathVariable("restauranteId") Long id) {
		return repository.busca(id);
	}
}
