public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Qual o volume?: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status: TV ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status: TV desligada? " + smartTv.desligada);

        smartTv.aumentarVolume();
        System.out.println("Novo status: Qual o volume atual? " + smartTv.volume);

        smartTv.mudarCanal(4);
        System.out.println("Novo status: Canal atual: " + smartTv.canal);
    }
}

