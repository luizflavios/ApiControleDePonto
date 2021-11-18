package br.com.projetos.RegistroPonto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetos.RegistroPonto.model.TipoData;
import br.com.projetos.RegistroPonto.repository.TipoDataRepository;

@Service
public class TipoDataService {
	
	TipoDataRepository dataRepository; 
	
	@Autowired
	public TipoDataService(TipoDataRepository dataRepository) {
		this.dataRepository = dataRepository; 
	}
	
	public TipoData createTipoData(TipoData tipoData) {
		return dataRepository.save(tipoData); 
	}
	
	public List<TipoData> getTipoData(){
		return dataRepository.findAll();
	}

}
