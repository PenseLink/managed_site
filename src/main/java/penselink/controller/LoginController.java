package penselink.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import penselink.model.entidades.Usuario;
import penselink.service.UsuarioService;

@Controller
public class LoginController {

	@Autowired
	private UsuarioService usuarioService;
	
	@RequestMapping("verificaLogin")
	public String efetuarLogin(HttpSession session, Usuario usuario){
		Usuario usuarioret = usuarioService.validarUsuario(usuario);
		if(usuarioret!=null){
			session.setAttribute("usuarioLogado", usuarioret);
			return "marca/marca";
		}
		else return "erroLogin";
	}
	
	@RequestMapping("")
	public String login (){
		return "login";
	}
}
