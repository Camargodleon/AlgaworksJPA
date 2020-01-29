package com.algaworks.leonardo.algaworksjpa.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algaworks.leonardo.algaworksjpa.domain.model.Cozinha;
import com.algaworks.leonardo.algaworksjpa.domain.persistence.Repositories;
import com.algaworks.leonardo.algaworksjpa.domain.persistence.Repository;
import com.algaworks.leonardo.algaworksjpa.domain.persistence.TipoRepository;

@Service
public class CozinhaService {

	@Autowired
	@TipoRepository(Repositories.COZINHA)
	private Repository repository;

	public List<Cozinha> lista() {
		return repository.lista();
	}
	public Cozinha busca(Long id) {
		return repository.busca(id);
	}
	
	public void grava(Cozinha cozinha) {
		repository.grava(cozinha);
	}
	
	public void remove(Cozinha cozinha) {
		repository.remove(cozinha);
	}
	
	public List<Cozinha> listaPorNome(String nome) {
		return repository.listaPorNome(nome);
		
	}
}
