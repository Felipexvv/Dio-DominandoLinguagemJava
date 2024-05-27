package edu.Felipexvv.EstruturasExcepcionais;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryAndCatch {
    public static void main(String[] args) {
        
        try{
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite o seu nome");
            String nome = scanner.next();

            System.out.println("Digite o seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();

            //Imprimindo os dados obtidos pelo usuario

            System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase() );
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura + " cm");
            scanner.close();
        }catch(InputMismatchException e){
            System.out.println("Os campos Idade e Altura precisam ser numericos");
        }
        



    }
}
