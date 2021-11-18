package br.com.projetos.RegistroPonto.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Builder
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Movimentacao {
	
	@Embeddable
	@Getter
	@Setter	
	@EqualsAndHashCode
	@AllArgsConstructor
	@NoArgsConstructor
	public class MovimentacaoId implements Serializable{

		private static final long serialVersionUID = 1L;		
		private Long idMovimento; 		
		private Long idUsuario; 
		
	}

	
	@EmbeddedId
	private MovimentacaoId id; 
	
	private LocalDateTime dataEntrada; 
	
	private LocalDateTime dataSaida; 
	
	private BigDecimal periodo; 
	
	@ManyToOne
	private Ocorrencia ocorrencia; 
	
	@ManyToOne
	private Calendario calendario; 
	
}
