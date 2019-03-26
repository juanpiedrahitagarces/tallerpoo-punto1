package com.HerramientasTorneo.co;

import java.util.ArrayList;

public class Equipo {
	private String Nombre;

	private String Tegnico;
	private String Estadio;
	private int titulos;

	private ArrayList<Jugador> jugadores;
	
	
	

	public Equipo(String Nombre, String Tegnico, String Estadio, int titulos, ArrayList<Jugador> jugadores) {

		this.Nombre = Nombre;
		this.Tegnico = Tegnico;
		this.Estadio = Estadio;
		this.titulos = titulos;
		this.jugadores = jugadores;

	}

	public String getTegnico() {
		return Tegnico;
	}

	public void setTegnico(String tegnico) {
		Tegnico = tegnico;
	}

	public String getEstadio() {
		return Estadio;
	}

	public void setEstadio(String estadio) {
		Estadio = estadio;
	}

	public int getTitulos() {
		return titulos;
	}

	public void setTitulos(int titulos) {
		this.titulos = titulos;
	}

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public String getNombre() {
		return Nombre;
	}

}
