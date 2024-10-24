package pe.com.cibertec.LP2_EF_FERNANDEZ_PAZ.controller;

import org.springframework.stereotype.Controller;



import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import pe.com.cibertec.model.entity.UsuarioEntity;

import pe.com.cibertec.service.UsuarioService;


@Controller
@RequiredArgsConstructor

public class UsuarioController {
	
	private final UsuarioService usuarioService;
	
	public UsuarioController(UsuarioService usuarioService) {
	    this.usuarioService = usuarioService;
	}
	
	@GetMapping("/registrar")
	public String mostrarRegistrarUsuario(Model model) {
		model.addAttribute("usuario", new UsuarioEntity());
		return "registrar";
	}
	
	@PostMapping("/registrar")
	public String registrarUsuario(@ModelAttribute("usuario") UsuarioEntity usuarioFormulario,
			Model model, @RequestParam("foto") MultipartFile foto) {
		
		usuarioService.crearUsuario(usuarioFormulario, foto);
		return "registrar";
	}
	
	@GetMapping("/")
	public String mostrarLogin(Model model) {
		model.addAttribute("usuario", new UsuarioEntity());
		return "login";	
	}
	
	
	@PostMapping("/login")
	public String login(@ModelAttribute("usuario") UsuarioEntity usuarioFormulario,
			Model model, HttpSession session) {
		boolean validarUsuario = usuarioService.validarUsuario(usuarioFormulario);
		if(validarUsuario) {
			session.setAttribute("usuario", usuarioFormulario.getCorreo());
			return "redirect:/menu";
		}
		model.addAttribute("loginInvalido", "No existe el usuario");
		model.addAttribute("usuario", new UsuarioEntity());
		return "login";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	

	
}