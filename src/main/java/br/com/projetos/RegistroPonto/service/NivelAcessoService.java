package br.com.projetos.RegistroPonto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetos.RegistroPonto.model.NivelAcesso;
import br.com.projetos.RegistroPonto.repository.NivelAcessoRepository;

@Service
public class NivelAcessoService {
	
	NivelAcessoRepository nivelAcessoRepository; 
	
	@Autowired
	public NivelAcessoService(NivelAcessoRepository nivelAcessoRepository) {
		this.nivelAcessoRepository = nivelAcessoRepository; 
	}

	public NivelAcesso save(NivelAcesso nivelAcesso) {
		return nivelAcessoRepository.save(nivelAcesso);
	}

	public List<NivelAcesso> findAll() {
		return nivelAcessoRepository.findAll();
	}

}
