package penselink.model.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
@NamedQueries({
	@NamedQuery(name="Produto.recuperarTodos", query="SELECT p FROM Produto p")
})
public class Produto implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String descricao;
	
	@ManyToOne
	private Marca marca;
	
	private Double preco;
	
	@OneToMany(mappedBy = "produto",cascade = CascadeType.ALL)
	private List<Especificacao> especificacoes;
	private String[] imagens;
	
	@ManyToOne
	private Subtipo subtipo;
	
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
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public List<Especificacao> getEspecificacoes() {
		return especificacoes;
	}
	public void setEspecificacoes(List<Especificacao> especificacoes) {
		this.especificacoes = especificacoes;
	}
	public String[] getImagens() {
		return imagens;
	}
	public void setImagens(String[] imagens) {
		this.imagens = imagens;
	}
	public Subtipo getSubtipo() {
		return subtipo;
	}
	public void setSubtipo(Subtipo subtipo) {
		this.subtipo = subtipo;
	}
	
	
}
