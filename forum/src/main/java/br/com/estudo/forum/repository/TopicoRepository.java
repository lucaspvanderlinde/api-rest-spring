package br.com.estudo.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.estudo.forum.model.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

}
