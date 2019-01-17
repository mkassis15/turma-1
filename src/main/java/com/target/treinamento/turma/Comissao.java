package com.target.treinamento.turma;

import java.util.Scanner;

public class Comissao {
	public static void main(String [] args) {

		Comissao minhaComissao = new Comissao();
		Calculadora minhaCalculadora = new Calculadora();

		
		Integer id = minhaComissao.numeroVendedor();
		Integer cod = minhaComissao.codigoPeca();
		Double valor = minhaComissao.valorPeca();
		Integer quant = minhaComissao.quantidadeVendida();
		Double total = minhaCalculadora.multiplica(Double.valueOf(quant), valor);
		Double resultado = minhaCalculadora.multiplica(total, 0.1);
	}


	private Integer quantidadeVendida() {
		System.out.println("Informe a quantidade que vendida:");
		return new Scanner(System.in).nextInt();
	}

	private Double valorPeca() {
		System.out.println("Informe o valor da peça:");
		return new Scanner(System.in).nextDouble();
	}

	private Integer codigoPeca() {
		System.out.println("Informe o codigo da peça:");
		return new Scanner(System.in).nextInt();
	}

	private Integer numeroVendedor() {
		System.out.println("Informe o número do vendedor:");
		return new Scanner(System.in).nextInt();
		 
	}
	

}
