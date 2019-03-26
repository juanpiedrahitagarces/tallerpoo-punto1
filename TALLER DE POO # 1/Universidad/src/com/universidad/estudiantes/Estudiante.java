package com.universidad.estudiantes;

import java.util.ArrayList;

public class Estudiante {
	private String identificacion;
	private String nombre;
	private int edad;
	private ArrayList<Nota> notas;
	
	public Estudiante(String identificacion, String nombre, int edad) {
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.edad = edad;
		this.notas = new ArrayList<>();
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public String getNombre() {
		return nombre;
	}
}
