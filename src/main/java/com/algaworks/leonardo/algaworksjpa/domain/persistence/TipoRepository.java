package com.algaworks.leonardo.algaworksjpa.domain.persistence;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.springframework.beans.factory.annotation.Qualifier;

@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface TipoRepository {
	
	Repositories value();

}
