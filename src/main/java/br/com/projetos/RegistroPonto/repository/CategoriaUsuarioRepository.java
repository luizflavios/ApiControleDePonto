package br.com.projetos.RegistroPonto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projetos.RegistroPonto.model.CategoriaUsuario;

@Repository
public interface CategoriaUsuarioRepository extends JpaRepository<CategoriaUsuario, Long>{

}
