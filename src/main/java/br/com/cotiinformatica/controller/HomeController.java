package br.com.cotiinformatica.controller;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.cotiinformatica.entities.Usuario;
import br.com.cotiinformatica.repositories.UsuarioRepository;

@Controller
public class HomeController {

	/*
	 * Método para abrir a página home.jsp como página inicial do projeto
	 */
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	/*
	 * Método para capturar o SUBMIT (envio do formulário)
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/cadastrar-usuario")
	public ModelAndView cadastrarUsuario(HttpServletRequest request) {
		
		// definir o nome da página para onde o fluxo irá retornar
		ModelAndView modelAndView = new ModelAndView("home"); 
		
		try {
			
			Usuario usuario = new Usuario();
			
			// capturando os dados enviados pelo formulário
			usuario.setIdusuario(UUID.randomUUID());
			usuario.setNome(request.getParameter("nome"));
			usuario.setEmail(request.getParameter("email"));
			usuario.setSenha(request.getParameter("senha"));
			
			// gravando o usuário no banco de dados
			UsuarioRepository usuarioRepository = new UsuarioRepository();
			usuarioRepository.create(usuario);
			
			modelAndView.addObject("mensagem", "Usuário cadastrado com sucesso!");
		}
		catch(Exception e) {
			modelAndView.addObject("mensagem", e.getMessage());
		}
		
		return modelAndView;
	}
}
