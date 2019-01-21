package com.target.treinamento.turma;

public class reverter {

	public static void main(String[] args) {

		reverter palidromo = new reverter();

		System.out.println(palidromo.isPalindromo("O123V-88O"));
		System.out.println(palidromo.isPalindromo("OR1E22L1A22X"));
		System.out.println(palidromo.isPalindromo("Matheus"));
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

		String novoValor = valor.replaceAll("\\d+", "").replaceAll("-", "");

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

}
