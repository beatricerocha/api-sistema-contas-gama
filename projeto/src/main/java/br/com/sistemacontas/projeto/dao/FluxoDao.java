package br.com.sistemacontas.projeto.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.sistemacontas.projeto.model.Fluxo;

public interface FluxoDao extends CrudRepository<Fluxo, Integer> {

}
