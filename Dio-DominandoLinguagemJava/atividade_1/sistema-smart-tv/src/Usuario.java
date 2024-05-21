public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual: "+ smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> Tv ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> Tv ligada? " + smartTv.ligada);


        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.mudarCanal(10);
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.mudarCanal(6);
        smartTv.diminuirCanal();
        System.out.println("Canal atual: " + smartTv.canal);
    }
}
