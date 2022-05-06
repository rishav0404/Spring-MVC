package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping("/home") //home will when /home is fired
	public String home(Model model) {
		System.out.println("this is home url");
		model.addAttribute("Name" , "Durgesh Tiwary");
		
		List<String> friends = new ArrayList<String>();
		friends.add("Ram");
		friends.add("Sita");
		friends.add("Laxman");
		
		model.addAttribute("l" ,friends);
		
		return "index";
		// views ke andar show karega index.jsp page
	}
	@RequestMapping("/about")
	public String about() {
		System.out.println("This about Controller");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help()
	{
		System.out.println("This is help controller");
		//creating object
		ModelAndView modelandview = new ModelAndView();
		//setting data
		modelandview.addObject("name", "Rishav");
		modelandview.addObject("id", 1234);
		
		//Marks
		List<Integer> list = new ArrayList<Integer>();
		list.add(123);
		list.add(345);
		list.add(678);
		
		modelandview.addObject("marks" , list);
		
	
		modelandview.setViewName("help");
		return modelandview;
	}
}
