package com.br.apiSistemaContas.apiSistemaContas.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.apiSistemaContas.apiSistemaContas.dao.CorrentistaDao;
import com.br.apiSistemaContas.apiSistemaContas.model.Correntista;

@RestController
public class CorrentistaController {
	@Autowired
	private CorrentistaDao dao;
	
	@GetMapping("/correntista")
	public ArrayList<Correntista> recuperarCorrentista() {
		ArrayList<Correntista> lista = (ArrayList<Correntista>)dao.findAll();
		return lista;
	}	
	
	
}
