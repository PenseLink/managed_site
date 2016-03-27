package penselink.model.entidades;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="PRECO")
public class Preco implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5837068227638047883L;

	/**Id do Preço*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@JoinColumn(name="produto_id")
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY,targetEntity=Produto.class)
	private Produto produto;
	
	/**Valor*/
	@Column(name="valor",nullable=false)
	private BigDecimal valor;
	
	/**Indicador de preço atual*/
	@Column(name="atual_indic",nullable=false)
	private Boolean indicadorAtual;
	
	/**instancia do tipo de preco*/
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY,targetEntity=TipoPreco.class)
	@JoinColumn(name="tipo_preco_id",nullable=false)
	private TipoPreco tipoPreco;
	
}
