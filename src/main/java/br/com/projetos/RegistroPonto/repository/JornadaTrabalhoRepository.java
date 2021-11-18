package br.com.projetos.RegistroPonto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projetos.RegistroPonto.model.JornadaTrabalho;

@Repository
public interface JornadaTrabalhoRepository extends JpaRepository<JornadaTrabalho, Long>{

	
	
}
