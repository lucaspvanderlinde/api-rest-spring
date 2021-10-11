package br.com.estudo.forum.service;

import java.util.List;
import java.util.Optional;

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
	Optional<Topico> buscarPorId(Long id);
	
	/**
	 * Atualiza um topico
	 * 
	 * @param topico
	 * @return
	 */
	Topico atualizar(Topico topico);
	
	/**
	 * Remove um topico
	 * 
	 * @param id
	 */
	void remover(Long id);

}
