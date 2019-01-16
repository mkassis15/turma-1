package com.target.treinamento.turma;

public class Calculadora {
    public static void main (String[] args) {

        Double a = 5.0;
        Double b = 10.0;

        Double adiciona = new Calculadora().adiciona(a,b);
        System.out.println("O resultado da adição = " + adiciona);

        Double r_diminui = new Calculadora().diminui(a,b);
        System.out.println("O resultado da subtração = " + r_diminui);

        Double r_divide = new Calculadora().divide(a,b);
        System.out.println("O resultado da divisão = " +r_divide);

        Double r_multiplica = new Calculadora().multiplica(a,b);
        System.out.println("O resultado da multiplicação = " +r_multiplica);
    }

    private Double adiciona(Double a,Double b){
        Double resultado = (a+b);
        return(resultado);
    }

    private Double diminui(Double a,Double b){
        Double resultado = (a-b);
        return(resultado);
    }

    private Double divide(Double a,Double b){
        Double resultado = (a/b);
        return(resultado);
    }

    private Double multiplica(Double a,Double b){
        Double resultado = (a*b);
        return(resultado);
    }
}
