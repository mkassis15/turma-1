package com.target.treinamento.turma;

public class reverter {

	public static void main(String[] args) {

		for (int i = 0; i < 200; i++) {
			if (i % 2 == 0) {
				System.out.println("é par:" + i);
			}
		}

		reverter palidromo = new reverter();

		System.out.println(palidromo.isPalindromo("rafael"));
		System.out.println(palidromo.isPalindromo("ovo"));
		System.out.println(palidromo.isPalindromo("socorram me subi no onibus em marrocos"));
	}

	/*
	 * 
	 */
	/**
	 * @ @param
	 *       valor
	 * @return
	 */
	private boolean isPalindromo(String valor) {

		String novoValor = valor.replaceAll("\\s+", "");

		Integer inicio = 0, fim = novoValor.length();

		while (inicio < fim) {

			if (novoValor.charAt(inicio) != novoValor.charAt(fim - 1)) {
				return false;
			}

			inicio = inicio + 1;
			fim = fim - 1;
		}

		return true;
	}

	private boolean isPalindromo1(String valor) {

		
		for (Integer inicio = 0, fim = valor.length(); inicio < fim; inicio++, fim--) {
			if (valor.charAt(inicio) != valor.charAt(fim - 1)) {
				return false;
			}

		}

		return true;

	}

	

	}

