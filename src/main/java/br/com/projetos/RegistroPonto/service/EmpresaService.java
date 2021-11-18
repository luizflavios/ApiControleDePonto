package br.com.projetos.RegistroPonto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetos.RegistroPonto.model.Empresa;
import br.com.projetos.RegistroPonto.repository.EmpresaRepository;

@Service
public class EmpresaService {

	EmpresaRepository empresaRepository; 
	
	@Autowired
	public EmpresaService(EmpresaRepository empresaRepository) {
		this.empresaRepository = empresaRepository; 
	}
	
	public Empresa createEmpresa(Empresa empresa) {
		return empresaRepository.save(empresa); 
	}
	
	public List<Empresa> getEmpresas(){
		return empresaRepository.findAll();
	}
	
}
