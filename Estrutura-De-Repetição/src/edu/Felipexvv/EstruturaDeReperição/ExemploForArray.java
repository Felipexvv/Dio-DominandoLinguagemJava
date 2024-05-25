package edu.Felipexvv.EstruturaDeReperição;

public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = {"Lipe", "Gago", "Henzo", "Jonas"};

        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno do indice x=" + x + " é " + alunos[x] );
        }

        //Forma abreviada do For

        for(String aluno : alunos){
            System.out.println("Nome do aluno é :" + aluno);
        }
        //A cada interecao de alunos o aluno atual do indice atual vai atualizar automaticamente
    }
}
