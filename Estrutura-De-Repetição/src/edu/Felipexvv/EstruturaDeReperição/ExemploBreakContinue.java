package edu.Felipexvv.EstruturaDeReperição;

public class ExemploBreakContinue {
    public static void main(String[] args) {
        
        for(int numero = 1; numero <= 5 ;numero++){
            if (numero == 3) {
                break; //Break para a repeticao e finaliza ela mesmo sem ter terminado o fluxo
            }
            System.out.println("Numero: " + numero);
        }

        System.out.println("--------------------------------------");

        for(int numero = 1; numero <= 5 ;numero++){
            if (numero == 3) {
                continue;// Ja o continue ele faz aquela acao o fluxo mudar no caso ele bate no continue e ele volta para o for sem executar os comandos abaixo do contunue 
            }
            System.out.println("Numero: " + numero);//Por causa do continue essa mensagem quando o numero for 3 ela n vai ser executada pois o fluxo do FOR vai voltar no Continue
        }

    }
}
