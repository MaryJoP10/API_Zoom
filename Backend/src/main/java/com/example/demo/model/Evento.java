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
	private char id;
	private String nombre;
	private LocalDateTime fecha;
	
	//Constructores//
	public Evento(char id, String nombre, LocalDateTime fecha) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fecha = fecha;
	}
	
	//Accesores//
	public char getId() {
		return id;
	}
	public void setId(char id) {
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
