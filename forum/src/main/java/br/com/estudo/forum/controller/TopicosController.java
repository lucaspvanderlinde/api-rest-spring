package br.com.estudo.forum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.estudo.forum.dtos.TopicoDto;
import br.com.estudo.forum.model.Topico;
import br.com.estudo.forum.repository.TopicoRepository;

@RestController
public class TopicosController {
	
	@Autowired
	private TopicoRepository topicoRepositoty;
	
	@RequestMapping("/topicos")
	public List<TopicoDto> lista() {
		List<Topico> topicos = topicoRepositoty.findAll();
		return TopicoDto.converter(topicos);
	}

}
