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
@Table(name="TIPO")
public class Tipo implements Serializable {	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8647371453592068815L;
	
	/**Id do Tipo*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	/**Descrição do Tipo*/
	@Column(name="descricao",nullable=false,length=255)
	private String descricao;
	
	/**Nome de exibição do Tipo*/
	@Column(name="nome_exibicao",nullable=false,length=255)
	private String nomeExibicao;
	
	/**Lista de subtipos desse tipo*/
	@OneToMany(mappedBy = "tipo", cascade = CascadeType.ALL, targetEntity=Subtipo.class,fetch=FetchType.EAGER)
	private List<Subtipo> listaDeSubtipos;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the nomeExibicao
	 */
	public String getNomeExibicao() {
		return nomeExibicao;
	}

	/**
	 * @param nomeExibicao the nomeExibicao to set
	 */
	public void setNomeExibicao(String nomeExibicao) {
		this.nomeExibicao = nomeExibicao;
	}

	/**
	 * @return the listaDeSubtipos
	 */
	public List<Subtipo> getListaDeSubtipos() {
		return listaDeSubtipos;
	}

	/**
	 * @param listaDeSubtipos the listaDeSubtipos to set
	 */
	public void setListaDeSubtipos(List<Subtipo> listaDeSubtipos) {
		this.listaDeSubtipos = listaDeSubtipos;
	}
	
	
}
