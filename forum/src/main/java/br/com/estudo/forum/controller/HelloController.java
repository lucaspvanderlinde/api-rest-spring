package br.com.estudo.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping("/")
	@ResponseBody
	public String hello() {
		return "Hello World";
	}
	
	
	// Exemplo 
//	@RequestMapping("/topicos")
//	public List<TopicoDto> lista() {
//		
//		Topico topico = Topico.builder()
//				.titulo("Duvida")
//				.mensagem("Duvida com Spring")
//				.curso(Curso.builder()
//						.nome("Spring")
//						.categoria("Programação")
//						.build())
//				.build();
//		
//		// Uitilizando Arrays.asList para retornar uma lista com varios topicos
//		return TopicoDto.converter(Arrays.asList(topico, topico, topico));

}
