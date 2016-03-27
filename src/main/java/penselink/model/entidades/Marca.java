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
@Table(name="MARCA")
public class Marca implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5202833194898581320L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	

	/**Descrição da Marca*/
	@Column(name="descricao",nullable=false,length=255)
	private String descricao;
	
	/**Nome de exibição da Marca*/
	@Column(name="nome_exibicao",nullable=false,length=255)
	private String nomeExibicao;
	
	/**Lista de produtos da marca*/
	@OneToMany(mappedBy = "marca", cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Produto> listaDeProdutos;
	
}
