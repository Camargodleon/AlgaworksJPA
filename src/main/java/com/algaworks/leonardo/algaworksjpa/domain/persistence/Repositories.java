package com.algaworks.leonardo.algaworksjpa.domain.persistence;

public enum Repositories {

	COZINHA(0), RESTAURANTE(1);

	private int i;

	public int getI() {
		return i;
	}

	private Repositories(int i) {
		this.i = i;
	}
}
