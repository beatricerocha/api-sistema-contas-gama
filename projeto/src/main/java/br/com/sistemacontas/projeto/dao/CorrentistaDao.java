package br.com.sistemacontas.projeto.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.sistemacontas.projeto.model.Correntista;

public interface CorrentistaDao  extends CrudRepository<Correntista, Integer>{

}
