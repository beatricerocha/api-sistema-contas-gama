package br.com.sistemacontas.projeto.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sistemacontas.projeto.dao.FluxoDao;
import br.com.sistemacontas.projeto.model.Fluxo;

@RestController
public class FluxoController {
	@Autowired
	private FluxoDao dao;
	
	@GetMapping("/fluxo")
	public ArrayList<Fluxo> recuperarFluxo() {
		ArrayList<Fluxo> lista = (ArrayList<Fluxo>)dao.findAll();
		return lista;
	}
}
