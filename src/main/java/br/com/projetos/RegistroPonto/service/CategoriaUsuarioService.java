package br.com.projetos.RegistroPonto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetos.RegistroPonto.model.CategoriaUsuario;
import br.com.projetos.RegistroPonto.repository.CategoriaUsuarioRepository;

@Service
public class CategoriaUsuarioService {

	CategoriaUsuarioRepository categoriaRepository; 
	
	@Autowired
	public CategoriaUsuarioService(CategoriaUsuarioRepository categoriaRepository) {
		this.categoriaRepository = categoriaRepository; 
	}
	
	public CategoriaUsuario createCategoriaUsuario (CategoriaUsuario categoriaUsuario) {
		return categoriaRepository.save(categoriaUsuario);
	}
	
	public List<CategoriaUsuario> getCategoriasUser(){
		return categoriaRepository.findAll();
	}

	public void deleteById(Long id) {
		categoriaRepository.deleteById(id);		
	}
	
}
