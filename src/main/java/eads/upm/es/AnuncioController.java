package eads.upm.es;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AnuncioController {

	ArrayList <Anuncio> al = new ArrayList <>();
	
    @RequestMapping("/anuncio")
	public String greeting(Model model, @RequestParam String nombre, @RequestParam String asunto, @RequestParam String texto) {
    	model.addAttribute("nombre", nombre);
    	model.addAttribute("asunto", asunto);
    	model.addAttribute("texto", texto);	
    	
    	Anuncio anuncio = new Anuncio(nombre, asunto, texto);
    	al.add(anuncio);
    	
    	return ("success_page");
    	
    	
	}
    
    
	@RequestMapping("/main")
	public String mainPage(Model model) {
 
		Anuncio[] adv = al.toArray(new Anuncio[al.size()]);
    	for (Anuncio an : adv) {
    		System.out.print(an.nombre);
    	}
		model.addAttribute("adv", adv);
    	return "main_page";
		
	}
	
	@RequestMapping("/detalle")
	public String detallePage(Model model,  @RequestParam int index) {
		
		System.out.println("index : " + index);
		model.addAttribute("nombre", al.get(index-1).nombre);
    	model.addAttribute("asunto", al.get(index-1).asunto);
    	model.addAttribute("texto", al.get(index-1).texto);	
    	return "detail_page";
		
	}
	
}
