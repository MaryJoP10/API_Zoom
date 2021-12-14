//Exponer servicios para que se puedan utilizar en el frontend//
package com.example.demo.rest;
import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.EventoService;
import com.example.demo.model.Evento;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping ("/eventos/")//url base para utilizar servicio//
public class EventoRest {
	
	@Autowired
	private EventoService eventoService;
	
	@GetMapping
	private ResponseEntity<List<Evento>> getAllEventos (){
		return ResponseEntity.ok(eventoService.findAll());
	}
	
	@PostMapping //Guardar//
	private ResponseEntity<Evento> saveEvent (@RequestBody Evento evento){ //mandar persona//
		try {
			Evento saveEvent = eventoService.save(evento);
			return ResponseEntity.created(new URI("/eventos/"+saveEvent.getId())).body(saveEvent);
		}
		catch (Exception e){
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
}		
