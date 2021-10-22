package br.senai.sp.jandira.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Calculo;
import br.senai.sp.jandira.model.DeterminadorImc;

public class Tela {

	public void criarTela() {

		JFrame tela = new JFrame("Calculadora de IMC");
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setSize(450, 500);
		tela.setLayout(null);

		// Componentes da tela

		JLabel lblTitulo = new JLabel("Cálculo de IMC");
		lblTitulo.setFont(new Font("Serif", Font.PLAIN, 30));
		lblTitulo.setBounds(20, 20, 220, 80);
		lblTitulo.setForeground(Color.blue);

		JLabel lblAltura = new JLabel("Sua altura:");
		lblAltura.setBounds(20, 100, 100, 50);
		lblAltura.setFont(new Font("Serif", Font.PLAIN, 20));

		JLabel lblPeso = new JLabel("Seu peso:");
		lblPeso.setBounds(20, 160, 100, 50);
		lblPeso.setFont(new Font("Serif", Font.PLAIN, 20));

		JTextField txtAltura = new JTextField();
		txtAltura.setBounds(140, 100, 120, 50);

		JTextField txtPeso = new JTextField();
		txtPeso.setBounds(140, 160, 120, 50);

		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.setBounds(40, 230, 350, 50);
		btnCalcular.setBackground(Color.gray);
		btnCalcular.setFont(new Font("Serif", Font.BOLD, 20));

		JLabel lblResultados = new JLabel("Resultados:");
		lblResultados.setBounds(20, 150, 100, 330);
		lblResultados.setFont(new Font("Serif", Font.BOLD, 20));

		JLabel lblValor = new JLabel("Valor do IMC:");
		lblValor.setBounds(20, 200, 100, 330);
		lblValor.setFont(new Font("Serif", Font.PLAIN, 15));

		JLabel lblEstado = new JLabel("Estado do IMC:");
		lblEstado.setBounds(20, 250, 100, 330);
		lblEstado.setFont(new Font("Serif", Font.PLAIN, 15));

		JLabel lblRetornoValor = new JLabel();
		lblRetornoValor.setBounds(120, 200, 100, 330);
		lblRetornoValor.setFont(new Font("Serif", Font.PLAIN, 15));

		JLabel lblRetornoEstado = new JLabel();
		lblRetornoEstado.setBounds(120, 250, 500, 330);
		lblRetornoEstado.setFont(new Font("Serif", Font.PLAIN, 15));

		tela.getContentPane().add(lblTitulo);
		tela.getContentPane().add(lblAltura);
		tela.getContentPane().add(lblPeso);
		tela.getContentPane().add(txtAltura);
		tela.getContentPane().add(txtPeso);
		tela.getContentPane().add(btnCalcular);
		tela.getContentPane().add(lblResultados);
		tela.getContentPane().add(lblValor);
		tela.getContentPane().add(lblEstado);
		tela.getContentPane().add(lblRetornoValor);
		tela.getContentPane().add(lblRetornoEstado);

		tela.setVisible(true);

		btnCalcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				double valorAltura = Double.valueOf(txtAltura.getText());
				double valorPeso = Double.valueOf(txtPeso.getText());
				
				Calculo calculo = new Calculo();
				
				calculo.setResultado(valorPeso, valorAltura);

				lblRetornoValor.setText(String.valueOf(calculo.getResultado()));
				double retornoValor = calculo.getResultado();
				
				DeterminadorImc determinadora = new DeterminadorImc();
				determinadora.setEstado(retornoValor);
				
				lblRetornoEstado.setText(determinadora.getEstado());
				
				if(calculo.getResultado() <= 18.5 ) {
					lblRetornoValor.setForeground(Color.BLUE);
					lblRetornoEstado.setForeground(Color.BLUE);		
					
				}else if(calculo.getResultado() > 18.5 && calculo.getResultado() < 25) {
					lblRetornoValor.setForeground(Color.green);
					lblRetornoEstado.setForeground(Color.green);
					
				}else if(calculo.getResultado() >= 25 && calculo.getResultado() < 30) {
					lblRetornoValor.setForeground(Color.cyan);
					lblRetornoEstado.setForeground(Color.cyan);
					
				}else if(calculo.getResultado() >= 30 && calculo.getResultado() < 35) {
					lblRetornoValor.setForeground(Color.yellow);
					lblRetornoEstado.setForeground(Color.yellow);
					
				}else if(calculo.getResultado() >= 35 && calculo.getResultado() < 40) {
					lblRetornoValor.setForeground(Color.orange);
					lblRetornoEstado.setForeground(Color.orange);
					
				}else if(calculo.getResultado() >= 40) {
					lblRetornoValor.setForeground(Color.red);
					lblRetornoEstado.setForeground(Color.red);
					
				}
				
			}
		});

	}

}
