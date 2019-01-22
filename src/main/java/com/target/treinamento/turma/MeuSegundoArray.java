package com.target.treinamento.turma;

import java.util.Scanner;

public class MeuSegundoArray {
	public static void main(String[] args) {
		MeuSegundoArray meuSegundoArray = new MeuSegundoArray();

		meuSegundoArray.inicializa();
	}

	private void inicializa() {
		Double[] meuArray = new Double[10];

		for (int i = 0; i < 10; i++) {
			meuArray[i] = lerEntrada();
		}

		efetuaOperacao(meuArray);
		imprimiNaTela(meuArray);

	}

	private void imprimiNaTela(Double[] meuArray) {
		for (int i = 0; i < meuArray.length; i++) {
			System.out.println(meuArray[i]);
		}

	}

	private void efetuaOperacao(Double[] meuArray) {
		for (int i = 0; i < meuArray.length; i++) {
			meuArray[i] = meuArray[i] * meuArray[i];
		}
	}

	public Double lerEntrada() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextDouble();
	}
}
