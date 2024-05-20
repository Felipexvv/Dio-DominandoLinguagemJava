package edu.Felipexvv.AprendendoSintaxeJava.Operadores;

public class OperadoresBasico {
    public static void main(String[] args) {
    
    //Atribuição

    String nome = "Lipe";
    int idade = 20;
    double peso = 70.0;
    char sexo = 'M';
    boolean doadorOrgaos = true;
    String doador;
    if (doadorOrgaos == true) {
        doador = "Sim";
    } else {
        doador = "Não";
    }

    System.out.println("Meu nome: " + nome + " Minha idade: " + idade + " Meu Peso: " + peso + " Sexo: " + sexo + " Doador De Orgãos? " + doador );

    //Operadores Aritimeticos

    double soma = 10.5 + 15.7;
    int subtração = 113 - 25;
    int multiplicação = 20 * 7; 
    int divisão = 18 / 3;
    int modulo = 18 % 3;
    double resultado = (10 * 7) +  (20/4);

    //Apenas para o codigo n ficar notificando erro por variaveis sem uso
    System.out.println(soma + multiplicação + subtração + modulo + divisão + resultado);

    //Concatenação Com Strings

    String nomeCompleto = "Luiz" + " " + "Felipe";
    System.out.println(nomeCompleto);

    //Concatenação Numeros e Strings

    String Concatenação = "?";

    Concatenação = 1+1+1+"1";
    System.out.println(Concatenação);

    Concatenação = 1+"1"+1+1;
    System.out.println(Concatenação);

    Concatenação = 1+"1"+1+"1";
    System.out.println(Concatenação);

    Concatenação = "1"+1+1+1;
    System.out.println(Concatenação);

    Concatenação = "1"+(1+1+1);
    System.out.println(Concatenação);





    }
}
