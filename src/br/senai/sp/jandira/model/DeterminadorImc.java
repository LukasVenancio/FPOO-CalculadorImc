package br.senai.sp.jandira.model;

public class DeterminadorImc {
	
	private String estado;

	public String getEstado() {
		return estado;
	}

	public void setEstado(double resultado) {
		
		if(resultado <= 18.5) {
			estado = "Abaixo do peso!";
		
		}else if (resultado > 18.5 && resultado < 25) {
			estado = "Peso ideal!";
			
		}else if (resultado >= 25 && resultado < 30) {
			estado = "Levemente acima do peso!";
			
		}else if (resultado >= 30 && resultado < 35) {
			estado = "Obesidade grau I";
			
		}else if (resultado >= 35 && resultado < 40) {
			estado = "Obesidade grau II";
			
		}else if (resultado >= 40) {
			estado = "Obesidade grau III";
			
		}
	}
	
	

}
