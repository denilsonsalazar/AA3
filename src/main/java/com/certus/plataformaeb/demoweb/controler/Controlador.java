package com.certus.plataformaeb.demoweb.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.certus.plataformaeb.demoweb.interfaceService.IpersonaService;
import com.certus.plataformaeb.demoweb.modelo.Persona;

import jakarta.validation.Valid;

@Controller
@RequestMapping
public class Controlador {

	@Autowired
	private IpersonaService service;

	@GetMapping("/listar")
	public String listar(Model model) {
		List<Persona> personas = service.listar();
		model.addAttribute("personas", personas);
		return "index";
	}
	
	@GetMapping("/new")
	public String agregar(Model model) {
		model.addAttribute("persona", new Persona());
		return "Formulario";
	}
	@GetMapping("/inicio")
	public String ainicio(Model model) {
		return "inicio";
	}
	
	@PostMapping("/save")
	public String save(@Valid Persona p, Model model) {
		service.save(p);
		return "redirect:/inicio";
	}
	

		
	

}
