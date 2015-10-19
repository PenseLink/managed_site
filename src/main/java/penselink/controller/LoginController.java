package penselink.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import penselink.model.entidades.Usuario;
import penselink.service.UsuarioService;

@Controller
public class LoginController {

	@Autowired
	private UsuarioService usuarioService;
	
	@RequestMapping("verificaLogin")
	public String efetuarLogin(HttpSession session, Usuario usuario){
		
			Usuario user = new Usuario();
			user.setId(1);
			user.setUsername("Geovan");
			user.setPassword("123");
			session.setAttribute("usuarioLogado", user);
			return "marca/marca";				
	}
	
	@RequestMapping("")
	public String login (){
		return "login";
	}
	
	@RequestMapping(value="/usuario/getWS/{id}")
	public @ResponseBody Usuario getByIdWS(@PathVariable ("id") Integer id, Usuario usuario, Model model){
		return usuarioService.getById(id);
	}
	
	@RequestMapping(value="/usuario/getAllWS")
	public @ResponseBody List<Usuario> getAllWS(Usuario usuario, Model model){
		return usuarioService.listar();
	}
}
