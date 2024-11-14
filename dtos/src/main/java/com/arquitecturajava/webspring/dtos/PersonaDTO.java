package com.arquitecturajava.webspring.dtos;

import java.io.Serializable;

public class PersonaDTO implements Serializable{
	
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public PersonaDTO(String nombre) {
		super();
		this.nombre = nombre;
	}

	public PersonaDTO() {
		super();
	}

}
