package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {
	
	@RequestMapping("/one")
	public String One() {
		System.out.println("This is one handler");
		return "redirect:/enjoy";
	}
	/*
	 * public RedirectView handler() { RedirectView r = new RedirectView();
	 * r.setUrl("https://www.google.com"); return r; }
	 */
	
	@RequestMapping("/enjoy")
	public String Two() {
		System.out.println("This is two handler");
		return "contact";
	}
}
