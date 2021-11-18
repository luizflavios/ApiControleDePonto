package br.com.projetos.RegistroPonto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetos.RegistroPonto.model.Usuario;
import br.com.projetos.RegistroPonto.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	UsuarioRepository repository;
	
	@Autowired
	public UsuarioService(UsuarioRepository repository) {
		this.repository = repository; 
	}
	
	public Usuario createUsuario(Usuario usuario) {
		return repository.save(usuario);
	}
	
	public List<Usuario> findAll(){
		return repository.findAll(); 
	}
	
}
