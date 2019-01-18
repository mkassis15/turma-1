package com.target.treinamento.turma;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {

		Calculadora minhaCalculadora = new Calculadora();

		Double a = minhaCalculadora.LeiaPrimeiraEntrada();
		Double b = minhaCalculadora.LeiaSegundaEntrada();
		Double c = minhaCalculadora.LeiaTerceiraEntrada();
		Double resultado = 0.0;
		
		if (c.equals(1.1)) {
			resultado = minhaCalculadora.adiciona(a, b);
			
		} else if (c.equals(1.2)){
			resultado = minhaCalculadora.divide(a, b);
		} else if (c.equals(1.3)) {
			resultado = minhaCalculadora.diminui(a, b);
		}else if (c.equals(1.4)) {
			resultado = minhaCalculadora.multiplica(a, b);
		}

		System.out.println("o resultado foi:" +resultado);


	}
	
	public Double adiciona(Double a, Double b) {
		return (a+b);
	}

	public Double multiplica(Double a, Double b) {
		return (a*b);
	}

	public Double divide(Double a, Double b) {
		return (a/b);
	}

	public Double diminui(Double a, Double b) {
		return (a-b);
	}

	private Double LeiaTerceiraEntrada() {
		System.out.println("Informe a operação:");
		return lerEntrada();
	}

	private Double LeiaSegundaEntrada() {
		System.out.println("Informe o segundo número:");

		return lerEntrada();
	}
	
	private Double LeiaPrimeiraEntrada() {
		System.out.println("Digite o primeiro valor:");


		return lerEntrada();
	}
	 
		
	private Double lerEntrada() {
		Scanner scanner = new Scanner(System.in);		
		return scanner.nextDouble();
	}
	

	}


