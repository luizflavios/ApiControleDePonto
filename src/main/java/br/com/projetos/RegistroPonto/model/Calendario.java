package br.com.projetos.RegistroPonto.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Calendario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id; 
	
	@ManyToOne
	private TipoData tipoData; 
	
	private String descricao; 
	
	private LocalDateTime dataEspecial; 
	
}
