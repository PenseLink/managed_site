package penselink.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;



public class AutorizadorInterceptador extends HandlerInterceptorAdapter{

	public boolean preHandler(HttpServletRequest request, 
								HttpServletResponse response, 
								Object controller)
										throws Exception{
		
		String uri = request.getRequestURI();
		if(uri.endsWith("verificaLogin") || uri.endsWith("login")|| uri.contains("resources")){
			System.out.println("Passou pelo if dos resources");
			return true;
		}
		if (request.getSession().getAttribute("usuarioLogado")!=null){
			System.out.println("Passou pelo if do user logado diferente de null");
			return true;
		}		
		response.sendRedirect("login");
		System.out.println("redirecionou para a tela de login");
		return false;		
	}
}
