package com.universidad.main;

import java.util.ArrayList;
import java.util.Arrays;

import com.universidad.core.Decanatura;
import com.universidad.core.Materia;
import com.universidad.core.Programa;
import com.universidad.estudiantes.Estudiante;
import com.universidad.estudiantes.Nota;

public class Principal {
	public static void main(String[] args) {
		Decanatura 	ingenieria 	= new Decanatura("Decanatura de Ingenierias", "Jesús");
		Materia		poo			= new Materia("Programaciun OO", 4);
		Materia		calculoMulti= new Materia("Calculo Multivariable", 4);
		
		ArrayList<Materia> materias = new ArrayList<>(Arrays.asList(poo, calculoMulti));
	
		Programa	sistemas	= new Programa("Ingenieria de Sistemas", 10, 250, materias);
		Programa 	electronica = new Programa("Ingenieria Electrónica", 10, 270, materias);
		
		Estudiante	alejandro 		= new Estudiante("123", " \nAlejandro", 20);
		Estudiante 	juan		= new Estudiante("321", "\nJuan", 30);
		Estudiante 	wilson		= new Estudiante("567", "\nWilson", 21);
		
		
		Nota 		notaPOOalejandro	= new Nota(poo);
		Nota		notaCalcuJuan	= new Nota(calculoMulti);
		Nota		notaPOOWilson		= new Nota(poo);
		Nota		notaCalcuWilson	= new Nota(calculoMulti);
		
		// Notas de alejandro
		notaPOOalejandro.setSeguimiento(4.3);
		notaPOOalejandro.setParcial(2.0);
		notaPOOalejandro.setFinal(3.2);
		
		alejandro.getNotas().add(notaPOOalejandro);
		
		// Notas de Juan
		notaCalcuJuan.setSeguimiento(3);
		notaCalcuJuan.setParcial(2.9);
		notaCalcuJuan.setFinal(2.9);
		
		juan.getNotas().add(notaCalcuJuan);
		
		// Notas de wilson
		notaPOOWilson.setSeguimiento(4.5);
		notaPOOWilson.setParcial(5.0);
		notaPOOWilson.setFinal(1.2);
		
		notaCalcuWilson.setSeguimiento(3.5);
		notaCalcuWilson.setParcial(2.0);
		notaCalcuWilson.setFinal(3.2);
		
		wilson.getNotas().add(notaCalcuWilson);
		wilson.getNotas().add(notaPOOWilson);
		
		
		
		// Ingreso los estudiantes al programa
		sistemas.getEstudiantes().add(wilson);
		sistemas.getEstudiantes().add(juan);
		sistemas.getEstudiantes().add(alejandro);
		
		// Ingreso los estudiantes al programa
				sistemas.getEstudiantes().add(wilson);
				sistemas.getEstudiantes().add(juan);
				electronica.getEstudiantes().add(alejandro);
		

		
		
		for (Estudiante est : sistemas.getEstudiantes()) {
			System.out.println(est.getNombre());
			
			for (int i = 0; i < est.getNotas().size(); i++) {
				Nota nota = est.getNotas().get(i);
			System.out.println(nota.getMateria().getNombre() + " le queda en " + nota.calcularDefinitiva());
			}
		}
	}
}













