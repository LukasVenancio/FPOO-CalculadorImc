package br.senai.sp.jandira.model;

public class Calculo {

	private double resultado;

	public void setResultado(double peso, double altura) {

		resultado = peso / (altura * altura);
		
	}

	public double getResultado() {
		return resultado;
	
	}
			
}
