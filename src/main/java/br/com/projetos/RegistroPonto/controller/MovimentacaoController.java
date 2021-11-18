package br.com.projetos.RegistroPonto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetos.RegistroPonto.model.Movimentacao;
import br.com.projetos.RegistroPonto.service.MovimentacaoService;

@RestController
@RequestMapping("/movimentacao")
public class MovimentacaoController {
	
	@Autowired
	MovimentacaoService service;
	
	@PostMapping
	public Movimentacao save(@RequestBody Movimentacao movimentacao) {
		return service.createMovimentacao(movimentacao); 
	}
	
	@GetMapping
	public List<Movimentacao> findAll(){
		return service.getMovimentacao(); 
	}
}
