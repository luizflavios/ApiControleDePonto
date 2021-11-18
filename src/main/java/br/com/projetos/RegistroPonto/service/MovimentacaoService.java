package br.com.projetos.RegistroPonto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetos.RegistroPonto.model.Movimentacao;
import br.com.projetos.RegistroPonto.repository.MovimentacaoRepository;

@Service
public class MovimentacaoService {

	MovimentacaoRepository repository; 

	@Autowired
	public MovimentacaoService(MovimentacaoRepository repository) {
		this.repository = repository; 
	}
	
	public Movimentacao createMovimentacao(Movimentacao movimentacao) {
		return repository.save(movimentacao);
	}
	
	public List<Movimentacao> getMovimentacao(){
		return repository.findAll();
	}
}
