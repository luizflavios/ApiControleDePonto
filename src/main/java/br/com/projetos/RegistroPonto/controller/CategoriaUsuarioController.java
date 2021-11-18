package br.com.projetos.RegistroPonto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetos.RegistroPonto.model.CategoriaUsuario;
import br.com.projetos.RegistroPonto.service.CategoriaUsuarioService;

@RestController
@RequestMapping("/categoriaUsuario")
public class CategoriaUsuarioController {
	
	@Autowired
	CategoriaUsuarioService categoriaService;
	
	@PostMapping
	public CategoriaUsuario save(@RequestBody CategoriaUsuario categoria) {
		return categoriaService.createCategoriaUsuario(categoria); 
	}
	
	@GetMapping
	public List<CategoriaUsuario> findCategorias(){
		return categoriaService.getCategoriasUser();
	}
	
	@DeleteMapping("/{idCategoria}")
	public void deleteJornadaTrabalho(@PathVariable(value = "idCategoria") Long id) throws Exception {		
		categoriaService.deleteById(id);
		
	}

}
