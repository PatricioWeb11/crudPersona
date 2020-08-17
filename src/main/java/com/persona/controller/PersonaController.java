package com.persona.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.persona.model.PersonaModel;
import com.persona.service.PersonaService;



@RestController
@RequestMapping("/persona")
public class PersonaController {
	@Autowired
	private PersonaService personaService;
	
	@GetMapping("/personas")
	public List<PersonaModel> obtenerPersonas(){
		return personaService.findAll();
	}
	
	@GetMapping("/persona/{id}")
	public PersonaModel obtenerPersona(@PathVariable int id) {
		return personaService.findById(id).get();
		
	}
	
	@PostMapping("/personas")
	public PersonaModel insertarPersona(@Validated @RequestBody PersonaModel persona) {
		return personaService.save(persona);
	}
	
//	@PutMapping("/personas")
//	public String actulizarPersona(@RequestBody PersonaModel persona) {
//		PersonaModel temporal = personaService.findById(persona.getId()).get();
//		temporal.setNombre(persona.getNombre());
//		temporal.setEdad(persona.getEdad());
//
//		personaService.save(temporal);
//
//		return "Persona actualizada correctamente";
//	}
	
	@PutMapping("/personas/{id}")
	public String actulizarPersona(@RequestBody PersonaModel persona) {
		PersonaModel temporal = personaService.findById(persona.getId()).get();
		temporal.setNombre(persona.getNombre());
		temporal.setEdad(persona.getEdad());

		personaService.save(temporal);

		return "Persona actualizada correctamente";
	}
	
	@DeleteMapping("/personas/{id}")
	public String eliminarPersona(@PathVariable int id) {
		if(personaService.existsById(id)) {
			personaService.deleteById(id);
			return "Persona eliminada";
		}
		return "La persona no se encuentra registrada";
		
	}
	
}
