package edu.Felipexvv.AprendendoSintaxeJava.Operadores;

public class OperadoresTernarios {
    public static void main(String[] args) {
        
        //Exemplo do Operador ternario

        int a, b;

        a = 5;
        b = 6;
        
        //Serve apenas em operacoes booleanas (a==b) ou é falso ou é true
        //se "a" for igual a "b" (?) se sim opção 1 (:) se não opção 2;
        String Resultado = a==b ? "Verdadeiro" : "Falso";
       
        /*
            if (a==b) 
                Resultado = "Verdadeiro";
            else 
                Resultado = "falso";
        */
    
        System.out.println(Resultado);
    }
}
