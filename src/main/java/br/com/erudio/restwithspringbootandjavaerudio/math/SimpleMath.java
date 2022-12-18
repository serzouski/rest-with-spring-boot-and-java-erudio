package br.com.erudio.restwithspringbootandjavaerudio.math;

public class SimpleMath {
    public Double soma(Double numberOne, Double numberTwo){
        return numberOne + numberTwo;
    }
    public Double subtracao(Double numberOne, Double numberTwo){
        return numberOne - numberTwo;
    }
    public Double divisao(Double numberOne, Double numberTwo){
        return numberOne / numberTwo;
    }
    public Double multiplicacao(Double numberOne, Double numberTwo){
        return numberOne * numberTwo;
    }
    public Double media(Double numberOne, Double numberTwo){
        return (numberOne + numberTwo) / 2;
    }
    public Double raizCadrada(Double number){
        return Math.sqrt(number);
    }
}
