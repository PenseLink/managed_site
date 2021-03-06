package penselink.model.entidades;

import java.io.Serializable;

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
@Table(name="ESPECIFICACAO")
public class Especificacao implements Serializable{
	
	/**
	 * Identificação da classe
	 */
	private static final long serialVersionUID = 7445472425051709665L;
	
	/**Id da especificacao*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	/**Titulo da especificacao*/
	@Column(name="titulo",length=255,nullable=false)
	private String titulo;
	
	/**Valor da especificacao*/
	@Column(name="valor", length=255, nullable=false)
	private String valor;
	
	/**Instancia do produto*/
	@JoinColumn(name="produto_id")
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY,targetEntity=Produto.class)
	private Produto produto;
}
