package com.algaworks.algalog.api.model.input;

import javax.persistence.Column;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DestinatarioInput {
	private String nome;
	
	private String logradouro;
	
	private String numero;
	
	private String complemento;
	
	private String bairro;
}
