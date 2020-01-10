package com.algaworks.leonardo.algaworksjpa.domain.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.algaworks.leonardo.algaworksjpa.domain.model.Restaurante;
@Component
@TipoRepository(Repositories.RESTAURANTE)
public class RestauranteRepository implements Repository{

	@PersistenceContext
	EntityManager entity;
	
	@Override
	public <T> List<T> lista() {
		Query query = entity.createQuery("SELECT r FROM  Restaurante r");
		return query.getResultList();
	}

	@Override
	public <T> T busca(Long id) {
		return (T) entity.find(Restaurante.class, id);
	}

	@Override
	public <T> T busca(T type) {
		Restaurante rest = (Restaurante) type;
		return (T) entity.find(Restaurante.class, rest.getId());
		
	}
	@Transactional
	@Override
	public <T> void grava(T type) {
		entity.merge(type);
		
	}
	@Transactional
	@Override
	public <T> void remove(T type) {
		Restaurante rest = (Restaurante) busca(type);
		entity.remove(rest);
		
	}

}
