package edu.Felipexvv.EstruturasCondicionais;

public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "M";

        //Estrutura (Switch Case)
        switch (sigla) {
            case "P":
                System.out.println("Tamanho Pequeno");
                break;
            case "M":
                System.out.println("Tamanho Medio");
                break;
            case "G":
                System.out.println("Tamanho Grande");
                break;
            default:
                System.out.println("Tamanho INDEFINIDO!!!");
        }


        /* Forma basica Do IF
            if (sigla == "P") {
                System.out.println("Tamanho Pequeno");
            }else if (sigla == "M") {
                System.out.println("Tamanho Medio");
            }else if (sigla == "G") {
                System.out.println("Tamanho Grande");
            }else {
                System.out.println("Tamanho INDEFINIDO");
            }
         */
    }
}
