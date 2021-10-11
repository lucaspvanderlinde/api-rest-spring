package br.com.estudo.forum.service;

import java.util.List;

import br.com.estudo.forum.model.Topico;

public interface TopicoService {
	
	/**
	 * Retorna todos topicos.
	 * 
	 * @return List<Topico>
	 */
	List<Topico> buscarTodos();
	
	/**
	 * Cadastrar um topico na base de dados.
	 * 
	 * @param topico
	 * @return Topico
	 */
	Topico cadastrar(Topico topico);
	
	/**
	 * Busca um topico por ID
	 * 
	 * @param id
	 * @return
	 */
	Topico buscarPorId(Long id);
	

}
