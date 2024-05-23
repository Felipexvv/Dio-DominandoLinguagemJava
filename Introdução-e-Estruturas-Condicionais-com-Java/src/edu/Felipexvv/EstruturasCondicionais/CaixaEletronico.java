package edu.Felipexvv.EstruturasCondicionais;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Saque realizado com SUCESSO!!! ");
            System.out.println("Seu saldo atual é de R$: " + saldo);
        }else {
            System.out.println("Valor solicitado Maior que o Saldo Disponivel!!!");
        }
        
    }
}
