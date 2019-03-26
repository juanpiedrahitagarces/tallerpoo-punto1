package com.universidad.core;

import java.util.ArrayList;

public class Decanatura {
	private String nombre;
	private String decano;
	private ArrayList<Programa> programas;
	
	public Decanatura(String nombre, String decano) {
		this.nombre = nombre;
		this.decano = decano;
		this.programas = new ArrayList<>();
	}

	public String getDecano() {
		return decano;
	}

	public void setDecano(String decano) {
		this.decano = decano;
	}

	public ArrayList<Programa> getProgramas() {
		return programas;
	}

	public void setProgramas(ArrayList<Programa> programas) {
		this.programas = programas;
	}
	
	public void agregarPrograma(Programa programa) {
		this.programas.add(programa);
	}
	
	public String getNombre() {
		return nombre;
	}
}