package br.senai.sp.jandira.calc;

public class Calculo {

	private double altura;
	private double peso;
	private double resultado;

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setResultado() {

		resultado = peso / (altura * altura);
	}

	public double getResultado() {
		return resultado;
	}

}
