package com.target.treinamento.turma;

import java.util.Scanner;

public class Cotacao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String cotacao_dolar = "", valor_dolar = "", valor_real = "";

		System.out.print("Conversor de dólar em real\n\n");

		System.out.print("Digite a cotação do dolar: ");
		cotacao_dolar = entrada.nextLine();

		System.out.print("Digite o valor em dolar: ");
		valor_dolar = entrada.nextLine();

		valor_real = String.valueOf(Double.valueOf(cotacao_dolar) * Double.valueOf(valor_dolar));

		System.out.print("O Valor em reais é " + valor_real + "\n");
	}

}
