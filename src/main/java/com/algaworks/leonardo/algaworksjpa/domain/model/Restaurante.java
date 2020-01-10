package com.algaworks.leonardo.algaworksjpa.domain.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "restaurante")
public class Restaurante<T> implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;
	@Column(name = "taxa_frete")
	private Float taxaFrete;
	@ManyToOne
	Cozinha cozinha;
	
	public Cozinha getCozinha() {
		return cozinha;
	}
	public void setCozinha(Cozinha cozinha) {
		this.cozinha = cozinha;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((taxaFrete == null) ? 0 : taxaFrete.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurante other = (Restaurante) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (taxaFrete == null) {
			if (other.taxaFrete != null)
				return false;
		} else if (!taxaFrete.equals(other.taxaFrete))
			return false;
		return true;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Float getTaxaFrete() {
		return taxaFrete;
	}
	public void setTaxaFrete(Float taxaFrete) {
		this.taxaFrete = taxaFrete;
	}
}
