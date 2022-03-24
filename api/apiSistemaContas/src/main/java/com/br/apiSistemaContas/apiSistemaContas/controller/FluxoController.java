package com.br.apiSistemaContas.apiSistemaContas.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.apiSistemaContas.apiSistemaContas.dao.FluxoDao;
import com.br.apiSistemaContas.apiSistemaContas.model.Fluxo;

@RestController
public class FluxoController extends CorrentistaController{
	@Autowired
	private FluxoDao dao;
	
	@GetMapping("/fluxo")
	public ArrayList<Fluxo> recuperarFluxo() {
		ArrayList<Fluxo> lista = (ArrayList<Fluxo>)dao.findAll();
		return lista;
	}
}
