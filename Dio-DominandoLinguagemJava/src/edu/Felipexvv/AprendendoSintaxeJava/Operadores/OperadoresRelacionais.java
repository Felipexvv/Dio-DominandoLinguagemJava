package edu.Felipexvv.AprendendoSintaxeJava.Operadores;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        //Operadores Relacionais

        /*
            (==) Quando desejamos verificar se uma variavel é IGUAL A outra;
            (!=) Quando desejamos verificar se uma variavel é DIFERENTE da outra;
            (>)  Quando desejamos verificar se uma variavel é MAIOR QUE a outra;  
            (>=) Quando desejamos verificar se uma variavel é MAIOR OU IGUAL a outra;
            (<)  Quando desejamos verificar se uma variavel é MENOR QUE outra;
            (<=) Quando desejamos verificar se uma variavel é MENOR OU IGUAL a outra;
        */

        String nome1 = "FELIPE";
        String nome2 = new String("FELIPE");

        //Melhor do que o (==) usando em objetos para comparar o conteudo
        System.out.println(nome1.equals(nome2));

        //System.out.println(nome1 == nome2); indicado para numeros


        int numero1 = 1;
        int numero2 = 2;
        
        
        boolean simNão = numero1 == numero2;

        if (numero1 < numero2) {
            System.out.println("A nossa condição é verdadeira");
        }else {
            System.out.println("Não é verdadeira a condição");
        }
        
        System.out.println("O numero1 é igual ao numero2? " + simNão);

        simNão = numero1 != numero2;

        System.out.println("Numero1 é diferente de numero2? " + simNão);

        simNão = numero1 > numero2;

        System.out.println("Numero1 é maior que numero2? " + simNão);
        


    }
}
