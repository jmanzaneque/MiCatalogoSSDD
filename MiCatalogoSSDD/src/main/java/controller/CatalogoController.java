package controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Editorial;
import repository.EditorialRepository;
import repository.LibroRepository;

@Controller
public class CatalogoController {
	
	@Autowired
	private EditorialRepository repEditorial;
		
	@RequestMapping("/")
	public String catalogo(Model model) {
		
		model.addAttribute("editoriales", repEditorial.findAll());
		//model.addAttribute("libros", repLibro.findAll());
		return "catalogo";
	}
	
	@PostConstruct
	public void init() {
		Editorial plaza = new Editorial("Plaza",622754789,"plaza@plaza.es",45200,527896235);
		repEditorial.save(plaza);
		Editorial castro = new Editorial("Castro",62802348,"castroSm@castro.es",45200,582832265);
		repEditorial.save(castro);
	}
}
