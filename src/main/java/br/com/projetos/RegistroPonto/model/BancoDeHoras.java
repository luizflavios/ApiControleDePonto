package br.com.projetos.RegistroPonto.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

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
public class BancoDeHoras {
	
	@Embeddable
	@Getter
	@Setter	
	@EqualsAndHashCode
	@AllArgsConstructor
	@NoArgsConstructor
	public class BancoHorasId implements Serializable{

		private static final long serialVersionUID = 1L;
		
		private Long idBancoDeHoras;
		private Long idMovimento;
		private Long idUsuario;
		
	}
	
	
	@EmbeddedId
	private BancoHorasId id;
	
	private LocalDateTime dataTrabalhada; 
	
	private BigDecimal quantidadeHoras;
	
	private BigDecimal saldoHoras; 
	
	

}
