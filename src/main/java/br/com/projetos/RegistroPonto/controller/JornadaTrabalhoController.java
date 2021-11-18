package br.com.projetos.RegistroPonto.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetos.RegistroPonto.model.JornadaTrabalho;
import br.com.projetos.RegistroPonto.service.JornadaTrabalhoService;


@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {
	
	@Autowired
	JornadaTrabalhoService jornadaService; 
	
	@PostMapping
	public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
		
		return jornadaService.save(jornadaTrabalho); 
	}
	
	@GetMapping
	public List<JornadaTrabalho> getJornadaList() {
		return jornadaService.findAll();
	}
	
	@GetMapping("/{idJornada}")
	public ResponseEntity<JornadaTrabalho> getJornadaTrabalho(@PathVariable(value = "idJornada") Long id) throws Exception {		
		return ResponseEntity.ok(jornadaService.getById(id).orElseThrow(() -> new NoSuchElementException("JORNADA NÂO ENCONTRADA!!"))); 
	}
	
	@PutMapping
	public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
		
		return jornadaService.update(jornadaTrabalho); 
	}
	
	
	@DeleteMapping("/{idJornada}")
	public void deleteJornadaTrabalho(@PathVariable(value = "idJornada") Long id) throws Exception {		
		jornadaService.deleteById(id);
		
	}
	
}
