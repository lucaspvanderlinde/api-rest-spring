package br.com.estudo.forum.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@Builder
@NoArgsConstructor @AllArgsConstructor
public class Curso {
	
	private Long id;
	private String nome;
	private String categoria;

}
