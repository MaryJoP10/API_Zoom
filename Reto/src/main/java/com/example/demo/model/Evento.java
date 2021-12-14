package com.example.demo.model;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table ( name = "Eventos_Zoom")
public class Evento {
	//Atributos//
	@Id
	private String id;
	private String nombre;
	private LocalDateTime fecha;
	
	//Constructores//
	public Evento(String id, String nombre, LocalDateTime fecha) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fecha = fecha;
	}
	
	//Accesores//
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	
}
