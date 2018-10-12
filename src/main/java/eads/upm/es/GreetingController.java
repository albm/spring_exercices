package eads.upm.es;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingController {

	    @RequestMapping("/greeting")
		public String greeting(Model model) {
			model.addAttribute("name", "World");
			model.addAttribute("silent", false);
			return "greeting_template";
		}
}
