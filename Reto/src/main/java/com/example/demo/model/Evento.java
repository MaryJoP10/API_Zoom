package com.example.demo.model;
import java.util.*;
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
	private Date fecha;
	
	//Constructores//
	public Evento(char id, String nombre, Date fecha) {
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
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
}
