package br.com.projetos.RegistroPonto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projetos.RegistroPonto.model.TipoData;

@Repository
public interface TipoDataRepository extends JpaRepository<TipoData, Long>{

}
