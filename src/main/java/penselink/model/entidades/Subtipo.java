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
@Table(name="SUBTIPO")
public class Subtipo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8937462221178159646L;
	
	/**Id do subtipo*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	/**Descrição do subtipo*/
	@Column(name="descricao",nullable=false,length=255)
	private String descricao;
	
	/**Nome de exibição do subtipo*/
	@Column(name="nome_exibicao",nullable=false,length=255)
	private String nomeExibicao;
	
	/**Instancia do tipo pai*/
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY,targetEntity=Tipo.class)
	@JoinColumn(name="tipo_id",nullable=false)
	private Tipo tipo;
	
}
