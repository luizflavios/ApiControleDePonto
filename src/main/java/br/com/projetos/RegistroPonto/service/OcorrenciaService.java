package br.com.projetos.RegistroPonto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetos.RegistroPonto.model.Ocorrencia;
import br.com.projetos.RegistroPonto.repository.OcorrenciaRepository;

@Service
public class OcorrenciaService {

	OcorrenciaRepository ocorrenciaRepository;
	
	@Autowired
	public OcorrenciaService(OcorrenciaRepository ocorrenciaRepository) {
		this.ocorrenciaRepository = ocorrenciaRepository; 
	}
	
	public Ocorrencia save(Ocorrencia ocorrencia) {
		return ocorrenciaRepository.save(ocorrencia);
	}

	public List<Ocorrencia> findAll() {
		return ocorrenciaRepository.findAll();
	}
	
}
