package com.mb.SpringCourse.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mb.SpringCourse.Models.User;
import com.mb.SpringCourse.Services.UserService;

@Controller
@RequestMapping("/")
public class HomeController {

	@Autowired
	UserService userService;
	
	public HomeController(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value = {"home"})
	public String Home(Model model) {
		List<User> users = userService.findAll(); 
		model.addAttribute("users1", users);
		
		for(User user : users) {
			System.out.println(user.toString());
		}
		return "home.jsp";
	}
	
	@RequestMapping(value = "register")
	public String register() {
		return "register.html";
	}
	
	@RequestMapping(value = "/add")
	public void add() {
		
		userService.save(null);
	}
	
	@RequestMapping(value = "registration", method = RequestMethod.GET)
	public String Registration() {
		return "registration.jsp";
	}
	
	@RequestMapping(value = "registration", method = RequestMethod.POST)
	public String RegisterUser(@ModelAttribute("user") User user, RedirectAttributes model) {
		System.out.println(user);
		user = userService.save(user);
		model.addFlashAttribute("user",user);
		return "redirect:" + user.getId();
	}
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public String Success(@PathVariable String id, @ModelAttribute("user") User user) {
		System.out.println(id);
		System.out.println("user:" + user.getName());

		return "sucess.jsp";
		
	}
		
}
