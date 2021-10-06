package br.com.estudo.forum.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.estudo.forum.model.Topico;
import br.com.estudo.forum.repository.TopicoRepository;
import br.com.estudo.forum.service.TopicoService;

@Service
public class TopicoServiceImpl implements TopicoService {
	
	@Autowired
	private TopicoRepository topicoRepositoty;

	@Override
	public List<Topico> findAll() {
		return topicoRepositoty.findAll();
	}

}
