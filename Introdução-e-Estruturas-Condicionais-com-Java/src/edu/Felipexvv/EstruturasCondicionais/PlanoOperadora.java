package edu.Felipexvv.EstruturasCondicionais;

public class PlanoOperadora {
    public static void main(String[] args) {

        //Ordem decressente no caso de cima pra baixo se vc apontar o "M" vc pegaria o da listra "B" pois ele pega o que vc marcou e o de baixo
        //Se vc quiser apenas o "B" entao tem que marcar so ele e se vc marcar o "T" vc pegarar todas as informacoes dos de baixo
  
        String plano = "M"; 
        switch (plano) {
            case "T":
                System.out.println("5GB YouTube");
            case "M":
                System.out.println("Whats e Instagram gratis");
            case "B":
                System.out.println("100 Minutos de Ligação");
        }
    }
}
