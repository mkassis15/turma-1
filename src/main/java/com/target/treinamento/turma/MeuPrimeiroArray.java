package com.target.treinamento.turma;

public class MeuPrimeiroArray {

	public static void main(String[] args) {
		MeuPrimeiroArray meuPrimeiroArray = new MeuPrimeiroArray();

		meuPrimeiroArray.inicializa();
	}

	private void inicializa() {
		Integer[] numeros = new Integer[4];
		numeros[0] = 100;
		numeros[1] = numeros[0] = 100;
		numeros[2] = numeros[1] = 100;
		numeros[3] = numeros[2] = 100;

		System.out.println(numeros[0]);
		System.out.println(numeros[1]);
		System.out.println(numeros[2]);
		System.out.println(numeros[3]);
	}

}
