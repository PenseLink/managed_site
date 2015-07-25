package penselink.model.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Tipo implements Serializable {	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String descricao;
	@OneToMany(mappedBy = "tipo",cascade = CascadeType.ALL)
	private List<Subtipo> listaDeSubtipos;
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
	public List<Subtipo> getListaDeSubtipos() {
		return listaDeSubtipos;
	}
	public void setListaDeSubtipos(List<Subtipo> listaDeSubtipos) {
		this.listaDeSubtipos = listaDeSubtipos;
	}
	
	
	
}
