package com.br.apiSistemaContas.apiSistemaContas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
	@Entity
	@Table(name="correntista")
public class Correntista {
	
		//definir campos da tabela 
		@Column(name="ag")
		private int ag;
		
		@Column(name="conta")
		private int conta;
		
		@Column(name="nome")
		private String nome;
		
		@Column(name="cpf")
		private String cpf;
		
		@Column(name="email")
		private String email;

		@Column(name="telefone")
		private String telefone;
		
		@Column(name="saldo")
		private float saldo;
}

	
