package com.persona.model;

import java.util.Date;

public class PersonaModel {
	private int id;
	private String nombre;
	private int edad;
	private Date fecha;
	
	public PersonaModel() {
		this.fecha = new Date();
	}

	public PersonaModel(int id, String nombre, int edad, Date fecha) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.fecha = fecha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "PersonaModel [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", fecha=" + fecha + "]";
	}

	
	
	
	
	
	
	
}
