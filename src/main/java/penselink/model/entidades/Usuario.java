package penselink.model.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Id;

import java.io.Serializable;

@Entity
@Table
@NamedQueries({
	@NamedQuery(name = "Usuario.recuperarTodos", query = "SELECT u FROM Usuario u"),
	@NamedQuery(name = "Usuario.validaUsuario", query = "SELECT u FROM Usuario u WHERE u.username=:username and u.password=:password"),
	@NamedQuery(name = "Usuario.existeUsuario", query = "SELECT u FROM Usuario u WHERE u.username=:username")
})
public class Usuario implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	private String username;
	private String password;
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
