package edu.Felipexvv.AprendendoSintaxeJava.Operadores;

public class OperadoresUnarios {
    public static void main(String[] args) {
        /*
            (+) Operador Unitario de valor positivo - numeros sao positivos sem esse operador explicitamente;
            (-) Operador Unitario de valor negativo - nega um numero ou expressao aritmetica;
            (++) Operador Unitario de incremento de valor - incrementa o valor em 1 unidade;
            (--) Operador Unitario de decremento de valor - decrementa o valor em 1 unidade;  
            (!) Operador Unitario logico de negacao - nega o valor de uma expressao booleana;

        */    

        int numero = 5;

        System.out.println(- numero);

        numero = - numero;
        //System.out.println(+ numero);

        numero = numero * -1;

        System.out.println(numero);

    }
}
