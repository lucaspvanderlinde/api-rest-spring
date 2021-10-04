package br.com.estudo.forum.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@Builder
@NoArgsConstructor @AllArgsConstructor
public class Resposta {
	
	private Long id;
	private String mensagem;
	private Topico topico;
	private LocalDateTime dataCriacao;
	private Usuario autor;
	
	@Builder.Default
	private Boolean solucao = false;

}
