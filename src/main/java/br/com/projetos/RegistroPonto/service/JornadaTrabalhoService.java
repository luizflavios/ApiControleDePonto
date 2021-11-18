package br.com.projetos.RegistroPonto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetos.RegistroPonto.model.JornadaTrabalho;
import br.com.projetos.RegistroPonto.repository.JornadaTrabalhoRepository;

@Service
public class JornadaTrabalhoService {
	
	
	JornadaTrabalhoRepository jornadaTrabalhoRepository;
	
	@Autowired
	public JornadaTrabalhoService(JornadaTrabalhoRepository jornadaTrabalhoRepository) {
		this.jornadaTrabalhoRepository = jornadaTrabalhoRepository; 
	}
	
	public JornadaTrabalho save(JornadaTrabalho jornada) {
		return jornadaTrabalhoRepository.save(jornada); 
	}

	public List<JornadaTrabalho> findAll() {
		return jornadaTrabalhoRepository.findAll(); 
	}

	public Optional<JornadaTrabalho> getById(Long id) {		
		return jornadaTrabalhoRepository.findById(id);
	}
	
	public JornadaTrabalho update(JornadaTrabalho jornada) {
		return jornadaTrabalhoRepository.save(jornada); 
	}
	
	public void deleteById(Long id) {		
		jornadaTrabalhoRepository.deleteById(id);
	}
	

}
