package br.com.estudo.forum.service;

import java.util.List;

import br.com.estudo.forum.model.Topico;

public interface TopicoService {
	
	/**
	 * Retorna todos topicos.
	 * 
	 * @return List<Topico>
	 */
	List<Topico> findAll();
	
	/**
	 * Salva um topico na base de dados.
	 * 
	 * @param topico
	 * @return Topico
	 */
	Topico save(Topico topico);

}
