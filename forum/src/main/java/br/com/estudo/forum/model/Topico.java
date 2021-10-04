package br.com.estudo.forum.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.com.estudo.forum.enums.StatusTopico;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@Builder
@NoArgsConstructor @AllArgsConstructor
public class Topico {
	
	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dataCriacao;
	private Usuario autor;
	private Curso curso;
	
	@Builder.Default
	private StatusTopico status = StatusTopico.NAO_RESPONDIDO;
	
	@Builder.Default
	private List<Resposta> respostas = new ArrayList<>();

}
