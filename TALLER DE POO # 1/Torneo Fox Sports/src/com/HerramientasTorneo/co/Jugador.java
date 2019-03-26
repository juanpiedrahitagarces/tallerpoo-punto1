package com.HerramientasTorneo.co;

public class Jugador {

	private String nombre;
	private int edad;
	private String posicion;

	public Jugador(String nombre, int edad, String posicion) {

		this.edad = edad;
		this.nombre = nombre;
		this.posicion = posicion;

	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public String getPosicion() {
		return posicion;
	}
	
	
	

}
