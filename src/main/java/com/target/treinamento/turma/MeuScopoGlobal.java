package com.target.treinamento.turma;

public class MeuScopoGlobal {

	Integer equacao;

	public static void main(String[] args) {
		MeuScopoGlobal m = new MeuScopoGlobal();
		m.primeiroMetodo();
		m.segundoMetodo();
		System.out.println(m.equacao);

	}

	public void primeiroMetodo() {
		this.equacao = 12;

	}

	public void segundoMetodo() {
		this.equacao = 14;

	}

}
