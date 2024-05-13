public class SmartTv {
    boolean ligada = false;
    boolean desligada = true;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        desligada = true;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void mudarCanalParaCima() {
        canal++;
    }

    public void mudarCanalParaBaixo() {
        canal--;
    }

    public void mudarCanal (int novoCanal) {
        canal = novoCanal;
    }
}

