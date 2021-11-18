package br.com.projetos.RegistroPonto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetos.RegistroPonto.model.NivelAcesso;
import br.com.projetos.RegistroPonto.service.NivelAcessoService;

@RestController
@RequestMapping("/nivelAcesso")
public class NivelAcessoController {
	
	@Autowired
	NivelAcessoService nivelAcessoService; 
	
	public NivelAcessoController(NivelAcessoService nivelAcessoService) {
		this.nivelAcessoService = nivelAcessoService;
	}
	
	@PostMapping
	public NivelAcesso createNivelAcesso(@RequestBody NivelAcesso nivelAcesso) {
		return nivelAcessoService.save(nivelAcesso); 
	}
	
	@GetMapping
	public List<NivelAcesso> getNivelAcesso(){
		return nivelAcessoService.findAll();
	}
	
	
	
}
