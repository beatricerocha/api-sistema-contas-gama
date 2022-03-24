package com.br.apiSistemaContas.apiSistemaContas.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

	@Entity
	@Table(name = "fluxo_caixa")
public class Fluxo {
	@Column(name = "entrada")
	private double entrada;
	
	@Column(name = "saida")
	private double saida;

	public double getEntrada() {
		return entrada;
	}

	public void setEntrada(double entrada) {
		this.entrada = entrada;
	}

	public double getSaida() {
		return saida;
	}

	public void setSaida(double saida) {
		this.saida = saida;
	}

	/*public void retornarFluxo(double getEntrada, double getSaida) {
		 List<Fluxo> fluxos = getFluxo(getEntrada, getSaida)
	}*/

	
}