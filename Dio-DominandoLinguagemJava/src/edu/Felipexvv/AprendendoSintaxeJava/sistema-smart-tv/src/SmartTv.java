public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Agora voce esta no canal: " + canal);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Agora voce esta no canal: " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Agora voce esta no canal: " + canal);
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando volume para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo volume para: " + volume);
    }
}