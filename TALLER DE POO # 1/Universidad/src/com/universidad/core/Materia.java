package com.universidad.core;

public class Materia {
	private String nombre;
	private int nroCreditos;
	private int nroHoras;
	private double valor;
	
	public Materia(String nombre, int nroCreditos) {
		this.nombre = nombre;
		this.nroCreditos = nroCreditos;
	}

	public int getNroHoras() {
		return nroHoras;
	}

	public void setNroHoras(int nroHoras) {
		this.nroHoras = nroHoras;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getNombre() {
		return nombre;
	}

	public int getNroCreditos() {
		return nroCreditos;
	}
}
