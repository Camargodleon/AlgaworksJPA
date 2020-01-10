package com.algaworks.leonardo.algaworksjpa.api.model;
import java.util.List;
import  com.algaworks.leonardo.algaworksjpa.domain.model.Cozinha;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
@JsonRootName("Cozinhas")
public class CozinhaXMLWrapper {
	@JsonProperty("Cozinha")
	@JacksonXmlElementWrapper(useWrapping = false)
	private List<Cozinha> lista;
	
	public CozinhaXMLWrapper(List<Cozinha> lista) {
		this.lista = lista;
	}

	public List<Cozinha> getLista() {
		return lista;
	}

	public void setLista(List<Cozinha> lista) {
		this.lista = lista;
	}
	
	
	
}
