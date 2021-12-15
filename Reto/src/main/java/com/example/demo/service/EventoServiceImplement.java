//Modificar las operaciones utilizadas en el repositorio//
package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Evento;
import com.example.demo.repository.EventoRepo;

@Service
public class EventoServiceImplement implements EventoService{
	@Autowired
	private EventoRepo eventoRepo;
	//Methods//

	@Override
	public void save(Evento evento) {
		eventoRepo.save(evento);
	}
	
	/*@Override
	public List<Evento> findAll() {
		return eventoRepo.findAll();
	}*/
}
