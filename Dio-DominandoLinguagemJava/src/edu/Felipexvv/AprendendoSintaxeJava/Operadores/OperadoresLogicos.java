package edu.Felipexvv.AprendendoSintaxeJava.Operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
        //Operadores Logicos 

        // (&&) Operador logico "E";
        //(||)  Operador logico "OU";

        boolean condição1 = true;
        boolean condição2 = false;

        if (condição1 && (7 > 4)) {
            System.out.println("boooooas aqui daqui fala feromonas ai!!");
        }

        if (condição1 && condição2) {
            System.out.println("As duas condções são verdadeiras!");
        }
        
        if (condição1 || condição2) {
            System.out.println("Uma das condições é verdadeira!");
        }

    }
}
