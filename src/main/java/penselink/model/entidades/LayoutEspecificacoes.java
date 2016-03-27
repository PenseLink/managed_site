package penselink.model.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class LayoutEspecificacoes implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3288252388843899289L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String descricao;
	@OneToMany
	private List<Especificacao> conjuntoEspecificacao;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public List<Especificacao> getConjuntoEspecificacao() {
		return conjuntoEspecificacao;
	}
	public void setConjuntoEspecificacao(List<Especificacao> conjuntoEspecificacao) {
		this.conjuntoEspecificacao = conjuntoEspecificacao;
	}	
}
