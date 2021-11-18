package br.com.projetos.RegistroPonto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetos.RegistroPonto.model.TipoData;
import br.com.projetos.RegistroPonto.service.TipoDataService;

@RestController
@RequestMapping("/tipoData")
public class TipoDataController {
	
	@Autowired
	TipoDataService tipoDataService;
	
	@PostMapping
	public TipoData saveTipoData(@RequestBody TipoData tipoData) {
		return tipoDataService.createTipoData(tipoData); 
	}
	
	@GetMapping
	public List<TipoData> getTipoData(){
		return tipoDataService.getTipoData();
	}
	
}
