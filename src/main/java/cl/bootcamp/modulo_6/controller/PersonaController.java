package cl.bootcamp.modulo_6.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cl.bootcamp.modulo_6.model.Persona;
import cl.bootcamp.modulo_6.service.PersonaService;

@Controller
@RequestMapping("/persona")
public class PersonaController {
	
	@Autowired
	private PersonaService personaService;
	
	
	
	
	@GetMapping("/holamundo")
	public ModelAndView holaMundo(@RequestParam(defaultValue="") String nombre,
							@RequestParam(defaultValue="0") int edad) {
		
		ModelAndView modelAndView= new ModelAndView("hola-mundo.jsp");
		modelAndView.addObject("nom", nombre);
		modelAndView.addObject("ed", edad);
		
		return modelAndView ;
	}
	@GetMapping("/chaomundo/{nom}/{edad}")
	public ModelAndView chaoMundoPath(@PathVariable("nom") String nombre,
								@PathVariable int edad) {
		ModelAndView modelAndView= new ModelAndView("chao-mundo.jsp");
		modelAndView.addObject("nom", nombre);
		modelAndView.addObject("ed", edad);
		return modelAndView;
	}
	
	@GetMapping("/form")
	public String formGet() {		
		return "formulario-persona.jsp";
	}
	
	@PostMapping("/form")
	public ModelAndView formPost(@ModelAttribute Persona persona) {		
		
		personaService.crearPersona(persona);
		ModelAndView modelAndView= new ModelAndView("muestra-persona.jsp");
		modelAndView.addObject("per", persona);
		
		return modelAndView;
	}
	
	@GetMapping("/listado")
	public ModelAndView listado() {		
		List<Persona> listado=  personaService.obtenerListado();
		ModelAndView modelAndView= new ModelAndView("muestra-perona_list.jsp");
		modelAndView.addObject("list", listado);
		
		return modelAndView;
	}
	
	@GetMapping("/rut/{rut}")
	public ModelAndView porRut(@PathVariable String rut) {
		
		Persona persona=personaService.obtenerPorRut(rut);
		ModelAndView modelAndView= new ModelAndView("muestra-persona.jsp");
		modelAndView.addObject("per", persona);
		return modelAndView;
	}
	@GetMapping("/borrar/rut/{rut}")
	public String borrarRut(@PathVariable String rut) {
		
		personaService.eliminar(rut);
		return "redirect:/persona/listado";
	}
}
