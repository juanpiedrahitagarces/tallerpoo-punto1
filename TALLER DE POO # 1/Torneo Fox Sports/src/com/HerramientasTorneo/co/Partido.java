package com.HerramientasTorneo.co;

import java.util.ArrayList;

public class Partido {
	private int GolVisitante;
	private int GolDeLocal;
	private int tiempo;
	private String resultado;
	private ArrayList<Equipo> equipos;

	public Partido(int GolVisitante, int GolDeLocal, int tiempo, String resultado, ArrayList<Equipo> equipos) {
		this.GolVisitante = GolVisitante;
		this.GolDeLocal = GolDeLocal;
		this.tiempo = tiempo;
		this.resultado = resultado;
		this.equipos = equipos;

	}

	public int getGolVisitante() {
		return GolVisitante;
	}

	public void setGolVisitante(int golVisitante) {
		GolVisitante = golVisitante;
	}

	public int getGolDeLocal() {
		return GolDeLocal;
	}

	public void setGolDeLocal(int golDeLocal) {
		GolDeLocal = golDeLocal;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public int getTiempo() {
		return tiempo;
	}

	public ArrayList<Equipo> getEquipos() {
		return equipos;
	}
	
	

}
