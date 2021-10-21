package br.senai.sp.jandira.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.senai.sp.jandira.calc.Calculo;

public class Tela {

	public void criarTela() {

		JFrame tela = new JFrame("Calculadora de IMC");
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setSize(450, 600);
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

		JLabel lblRetornoEstado = new JLabel("AQUI VIRÁ UM RESULTADO!");
		lblRetornoEstado.setBounds(120, 250, 100, 330);
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
				
				String Altura = txtAltura.getText();
				double valorAltura = Double.parseDouble(Altura);

				String Peso = txtPeso.getText();
				double valorPeso = Double.parseDouble(Peso);
				
				Calculo calculadora = new Calculo();
				calculadora.setAltura(valorAltura);
				calculadora.setPeso(valorPeso);
				
				System.out.println(calculadora.getResultado());

			}
		});

	}

}
