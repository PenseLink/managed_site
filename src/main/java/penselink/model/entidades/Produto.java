package penselink.model.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="PRODUTO")
public class Produto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8249357136284543593L;
	
	/**Id da entidade*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	/**Instancia da marca do Produto*/
	@JoinColumn(name="marca_id")
	@ManyToOne(cascade=CascadeType.ALL)
	private Marca marca;
	
	/**Instancia do subtipo do produto*/
	@JoinColumn(name="subtipo_id")
	@OneToOne(cascade=CascadeType.ALL)
	private Subtipo subtipo;
	
	/**Descrição do produto*/
	@Column(name="descricao" , nullable=false, length=255)
	private String descricao;
	
	/**Nome de exibição do produto*/
	@Column(name="nome_exibicao", nullable=false, length=255)
	private String nomeExibicao;

	/**Modelo do produto*/
	@Column(name="modelo",nullable=false, length=255)
	private String modelo;
	
	/**Lista de Especificações do produto*/
	@OneToMany(cascade= CascadeType.ALL, fetch=FetchType.EAGER,mappedBy="produto")
	private List<Especificacao> especificacoes;
	
	/**Lista de preços do Produto*/
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER,mappedBy="produto")
	private List<Preco> precos;
	
	/**Lista de métodos de pagamento desse Produto*/
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER,mappedBy="produto")
	private List<MetodoPagamento> metodosPagamento;
	
}
