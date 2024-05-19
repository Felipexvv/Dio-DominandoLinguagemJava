package edu.Felipexvv.AprendendoSintaxeJava.AnatomiaClasses;

public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("Ola, Mundo");

        String primeiroNomme = "Paulo";
        String segundoNome = "Cesar";

        String nomeCompleto = nomeCompleto(primeiroNomme, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do metodo: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
