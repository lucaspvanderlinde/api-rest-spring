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
	public List<Topico> buscarTodos() {
		return topicoRepositoty.findAll();
	}

	@Override
	public Topico cadastrar(Topico topico) {
		return topicoRepositoty.save(topico);
	}

	@Override
	public Topico buscarPorId(Long id) {
		return topicoRepositoty.findById(id).get();
	}

	@Override
	public Topico atualizar(Topico topico) {
		return topicoRepositoty.save(topico);
	}

	@Override
	public void remover(Long id) {
		topicoRepositoty.deleteById(id);
	}

}
