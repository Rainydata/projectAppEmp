package eam.app.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import eam.app.model.User;
import eam.app.service.userService;

@Controller
@RequestMapping("/aut")
public class controllerLogin {

	private userService userService;
	
	@Autowired
	
	public controllerLogin(userService userService) {
		this.userService = userService;
	}
	
	@PostMapping("/login")
	public String login(String username, String password, Model model) {
		User user = userService.findByUsernameAndPassword(username, password);
		if(user != null){
			return "redirect:/register";
		}else {
			model.addAttribute("error", "usuario o contraseña incorrecta");
			return "login";
		}
	}
	
	
	
}
