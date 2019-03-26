package com.universidad.core;

import java.util.ArrayList;

import com.universidad.estudiantes.Estudiante;

public class Programa {
	private String nombre;
	private int nroSemestres;
	private int costo;
	private int nroCreditos;
	private ArrayList<Materia> materias;
	private ArrayList<Estudiante> estudiantes;
	
	public Programa(String nombre, int nroSemestres, int nroCreditos, ArrayList<Materia> materias) {
		this.nombre = nombre;
		this.nroSemestres = nroSemestres;
		this.nroCreditos = nroCreditos;
		this.materias = materias;
		this.materias = new ArrayList<>();
		this.estudiantes = new ArrayList<>();
	}

	public int getNroSemestres() {
		return nroSemestres;
	}

	public void setNroSemestres(int nroSemestres) {
		this.nroSemestres = nroSemestres;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	public int getNroCreditos() {
		return nroCreditos;
	}

	public void setNroCreditos(int nroCreditos) {
		this.nroCreditos = nroCreditos;
	}

	public ArrayList<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(ArrayList<Materia> materias) {
		this.materias = materias;
	}

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	public String getNombre() {
		return nombre;
	}
}
