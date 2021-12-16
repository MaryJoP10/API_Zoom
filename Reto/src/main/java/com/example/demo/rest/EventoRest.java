//Exponer servicios para que se puedan utilizar en el frontend//
package com.example.demo.rest;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.EventoService;
import com.example.demo.model.Evento;

@RestController
@CrossOrigin(origins="*")
@RequestMapping ("/eventos/")//url base para utilizar servicio//
public class EventoRest {
	
	@Autowired
	private EventoService eventoService;
	
	@GetMapping
	private ResponseEntity<List<Evento>> getAllEventos (){
		return ResponseEntity.ok(eventoService.findAll());
	}
	
	@PostMapping //Guardar//
	private void saveEvent (@RequestBody Evento evento){ //mandar persona//
		eventoService.save(evento);
	}
	/*private Evento create(Evento newEvent) {
		String API_SERVER ="https://api.zoom.us/v2/users/7496298811/meetings";
	}*/
}		
