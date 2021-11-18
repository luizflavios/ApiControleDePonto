package br.com.projetos.RegistroPonto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetos.RegistroPonto.model.Empresa;
import br.com.projetos.RegistroPonto.service.EmpresaService;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

	
	@Autowired
	EmpresaService empresaService; 
	
	@PostMapping
	public Empresa salvar(@RequestBody Empresa empresa) {
		return empresaService.createEmpresa(empresa); 
	}
	
	@GetMapping
	public List<Empresa> getEmpresas(){
		return empresaService.getEmpresas(); 
	}
	
}
