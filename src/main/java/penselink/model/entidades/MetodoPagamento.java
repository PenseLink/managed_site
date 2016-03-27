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
@Table(name="METODO_PAGAMENTO")
public class MetodoPagamento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6466817430276900513L;
	
	/**Id do Metodo de Pagamento*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	/**Descrição do método de pagamento*/
	@Column(name="descricao",length=255,nullable=false)
	private String descricao;
	
	/**Taxa de juros aplicada a esse método de pagamento*/
	@Column(name="taxa_juros",nullable=true)
	private BigDecimal taxaJuros;
	
	/**Máximo de parcelas permitidas nesse Método de pagamento*/
	@Column(name="max_parcelas",nullable=true)
	private Integer maxParcelas;
	
	/**indicador de ativo do método de pagamento*/
	@Column(name="ativo_indic",nullable=false)
	private Boolean indicadorAtivo;
	
	@JoinColumn(name="id_produto")
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY,targetEntity=Produto.class)
	private Produto produto;
	
}
