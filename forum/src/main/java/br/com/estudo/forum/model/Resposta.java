package br.com.estudo.forum.model;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Resposta {
	
	private Long id;
	private String mensagem;
	private Topico topico;
	private LocalDateTime dataCriacao;
	private Usuario autor;
	private Boolean solucao = false;

}
