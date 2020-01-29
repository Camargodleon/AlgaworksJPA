package com.algaworks.leonardo.algaworksjpa.domain.persistence;

import java.util.List;

public interface Repository {
	
	public <T> List<T> lista();
	public <T> List<T> listaPorNome(String nome);
	public <T> T busca(Long id);
	public <T> T busca(T type);
	public <T> void grava(T type);
	public <T> void remove(T type);
	
}
