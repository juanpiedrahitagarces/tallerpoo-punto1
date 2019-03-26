package com.universidad.estudiantes;

import com.universidad.core.Materia;

public class Nota {
	private double seguimiento;
	private double parcial;
	private double final_;
	private Materia materia;
	
	public Nota(Materia materia) {
		this.materia = materia;
	}

	
	public double calcularDefinitiva() {
		double definitiva = (this.seguimiento * 0.4) + (this.parcial * 0.3) + (this.final_ * 0.3);
		return definitiva;
	}
	
	public double getSeguimiento() {
		return seguimiento;
	}
	public void setSeguimiento(double seguimiento) {
		this.seguimiento = seguimiento;
	}
	public double getParcial() {
		return parcial;
	}
	public void setParcial(double parcial) {
		this.parcial = parcial;
	}
	public double getFinal() {
		return final_;
	}
	public void setFinal(double final_) {
		this.final_ = final_;
	}
	public Materia getMateria() {
		return materia;
	}
}
