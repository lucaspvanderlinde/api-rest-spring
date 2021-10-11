package br.com.estudo.forum.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.estudo.forum.dtos.TopicoDto;
import br.com.estudo.forum.model.Topico;
import br.com.estudo.forum.service.TopicoService;

@RestController
@RequestMapping("/topicos")
public class TopicosController {
	
	@Autowired
	private TopicoService topicoService;
	
	@GetMapping
	public ResponseEntity<List<TopicoDto>>lista() {
		List<TopicoDto> topicos = TopicoDto.converter(topicoService.buscarTodos());
		return ResponseEntity.ok(topicos);
	}
	
	@PostMapping
	public ResponseEntity<Topico>cadastrar(@RequestBody @Valid Topico topico, UriComponentsBuilder uriBuilder) {
		topicoService.cadastrar(topico);
		URI uri = uriBuilder.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();
		return ResponseEntity.created(uri).body(topico);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Topico>>buscarPorId(@PathVariable Long id) {
		Optional<Topico> topico = topicoService.buscarPorId(id);
		
		if (!topico.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(topico);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Topico>atualizar(@PathVariable Long id, @RequestBody @Valid Topico topico) {
		Optional<Topico> optional = topicoService.buscarPorId(id);
		
		if (!optional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		Topico novoTopico = topicoService.atualizar(topico);
		return ResponseEntity.ok(novoTopico);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?>remover(@PathVariable Long id) {
		Optional<Topico> optional = topicoService.buscarPorId(id);
		
		if (!optional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		topicoService.remover(id);
		return ResponseEntity.ok().build();
	}
	
	
	
	
}
