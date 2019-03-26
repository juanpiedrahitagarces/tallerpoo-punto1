package com.HerramientasTorneo.co;

import java.util.ArrayList;



public class Torneo {
	private String duracion;
	private int ValorPremio;
	private String nombre;
	private ArrayList<Equipo> equipos;

	public Torneo(String duracion, int valorPremio, ArrayList<Equipo> equipos, String nombre) {
		this.duracion = duracion;
		this.equipos = equipos;
		this.ValorPremio = valorPremio;
		this.nombre = nombre;

	}

	public ArrayList<Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(ArrayList<Equipo> equipos) {
		this.equipos = equipos;
	}

	public String getDuracion() {
		return duracion;
	}

	public int getValorPremio() {
		return ValorPremio;
	}

	public String getNombre() {
		return nombre;
	}

	public String getPatrocinador() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
