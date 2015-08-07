package penselink.test;

import penselink.model.eaoImpl.UsuarioEaoImpl;
import penselink.model.entidades.Usuario;

public class TestaUsuario {

	public static void main (String[] args){
		valida();
	}
	
	public static void valida(){
		UsuarioEaoImpl eao = new UsuarioEaoImpl();
		Usuario usuario = new Usuario();
		usuario.setUsername("Geovan");
		usuario.setPassword("ordem123");
		
		
		System.out.println(eao.validarUsuario(usuario));
	}
	
	public static void cadastra (){
		UsuarioEaoImpl eao = new UsuarioEaoImpl();
		Usuario usuario = new Usuario();
		usuario.setUsername("Geovan");
		usuario.setPassword("ordem123");
		
		eao.cadastrar(usuario);
	}
}
