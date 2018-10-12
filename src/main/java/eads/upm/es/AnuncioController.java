package eads.upm.es;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AnuncioController {

	    @RequestMapping("/anuncio")
		public String greeting(Model model, @RequestParam String nombre, @RequestParam String asunto, @RequestParam String texto) {
	    	model.addAttribute("nombre", nombre);
	    	model.addAttribute("asunto", asunto);
	    	model.addAttribute("texto", texto);	
			return "anuncio_publicado";
		}
}
