package br.com.projetos.RegistroPonto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetos.RegistroPonto.model.Usuario;
import br.com.projetos.RegistroPonto.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@PostMapping
	public Usuario save(@RequestBody Usuario usuario) {
		return usuarioService.createUsuario(usuario); 
	}
	
	@GetMapping
	public List<Usuario> getUsuarios(){
		return usuarioService.findAll();
	}
}
