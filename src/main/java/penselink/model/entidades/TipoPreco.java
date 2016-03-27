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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TIPO_PRECO")
public class TipoPreco implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 743741801565018399L;
	
	/**Id do Tipo de Preço*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	/**Descrição do Tipo de Preço*/
	@Column(name="descricao",nullable=false,length=255)
	private String descricao;
	
	/**Nome de exibição do Tipo de Preço*/
	@Column(name="nome_exibicao",nullable=false,length=255)
	private String nomeExibicao;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER,mappedBy="tipoPreco",targetEntity=Preco.class)
	private List<Preco> precos;
	

}
