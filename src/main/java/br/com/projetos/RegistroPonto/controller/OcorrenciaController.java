package br.com.projetos.RegistroPonto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetos.RegistroPonto.model.Ocorrencia;
import br.com.projetos.RegistroPonto.service.OcorrenciaService;

@RestController
@RequestMapping("/ocorrencia")
public class OcorrenciaController {

	@Autowired
	OcorrenciaService ocorrenciaService;
	
	@PostMapping
	public Ocorrencia saveOcorrencia(@RequestBody Ocorrencia ocorrencia) {
		return ocorrenciaService.save(ocorrencia); 
	}
	
	@GetMapping
	public List<Ocorrencia> getOcorrencias(){
		return ocorrenciaService.findAll(); 
	}
	
	
}
