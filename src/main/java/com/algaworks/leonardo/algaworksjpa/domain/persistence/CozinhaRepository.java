package com.algaworks.leonardo.algaworksjpa.domain.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.algaworks.leonardo.algaworksjpa.domain.model.Cozinha;

@Component
@TipoRepository(Repositories.COZINHA)
public class CozinhaRepository implements Repository{
	
	@PersistenceContext
	EntityManager entity;

	@Override
	public <T> List<T> lista() {
		 Query query = entity.createQuery("SELECT c FROM Cozinha c");
		return query.getResultList();
	}

	@Override
	public <T> T busca(Long id) {
		return (T) entity.find(Cozinha.class, id);
	}

	@Override
	public <T> T busca(T type) {
		Cozinha cozinha = (Cozinha) type;
		return (T) entity.find(Cozinha.class,cozinha.getId());
	}
	@Transactional
	@Override
	public <T> void grava(T type) {
		entity.merge(type);
	}
	@Transactional
	@Override
	public <T> void remove(T type) {
		Cozinha cozinha = (Cozinha) busca(type);
		entity.remove(cozinha);
		
	}

}
