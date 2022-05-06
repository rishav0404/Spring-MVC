package springmvc.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;

@Controller
public class ContactController {
	
	@ModelAttribute
	public void commonData(Model m) {
		m.addAttribute("Header" , "Welcome to Rishav's Singing Channel");
		m.addAttribute("Desc" , "Enjoy It...");
		System.out.println("Adding common data to model");
	}
	
	@RequestMapping("/contact")
	public String showForm(Model m) {
		
		return "contact";
	}
	
	@RequestMapping(path = "/processform",method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model)
	{
		
		 System.out.println(user);
		 if(user.getPassword(). isEmpty()) {
			 return "redirect:/contact";
		 }
		 //model.addAttribute("u" , user);
		
		return "success";
	}
	
	
}

/*
 * public String handleForm(@RequestParam("email") String userEmail ,
 * 
 * @RequestParam("name") String userName,
 * 
 * @RequestParam("password") String userPassword, Model model) {
 * 
 * System.out.println("User Email" +userEmail);
 * System.out.println("User Name"+userName); System.out.println("User Password"
 * +userPassword);
 * 
 * 
 * model.addAttribute("email" ,userEmail); model.addAttribute("name" ,userName);
 * model.addAttribute("password" ,userPassword);
 * 
 * return "success"; }
 */