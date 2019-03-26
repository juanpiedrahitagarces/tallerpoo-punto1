package com.HerramientasTorneo.co;

import java.util.ArrayList;

public class Fecha {

	private String lugar;
	private ArrayList<Partido> partidos;

	public Fecha(String lugar, ArrayList<Partido> partidos) {

		this.lugar = lugar;
		this.partidos = partidos;

	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public ArrayList<Partido> getPartidos() {
		return partidos;
	}

	public void setPartidos(ArrayList<Partido> partidos) {
		this.partidos = partidos;
	}

}
