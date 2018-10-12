package eads.upm.es;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UrlController {

	    @RequestMapping("/url")
		public String greeting(Model model, @RequestParam String nenlace) {
	    	model.addAttribute("nenlace", nenlace);
	
			return "enlace_publicado";
		}
}
