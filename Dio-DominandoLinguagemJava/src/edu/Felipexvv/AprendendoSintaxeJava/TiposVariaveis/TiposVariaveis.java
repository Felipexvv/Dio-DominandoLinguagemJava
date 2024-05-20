package edu.Felipexvv.AprendendoSintaxeJava.TiposVariaveis;

public class TiposVariaveis {
    public static void main(String[] args) {
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeorCurto2 = (short) numeroNormal;

        int numero = 5;
        numero = 10;

        System.out.println(numero);

        final double VALOR_DE_PI = 3.14;

        System.out.println(salarioMinimo + numeorCurto2 + " " + VALOR_DE_PI);
    }
} 