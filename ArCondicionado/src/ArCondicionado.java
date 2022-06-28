public class ArCondicionado {
    private String modelo;
    private int temperatura;
    private int velocidade;
    private boolean estaLigado;
    private boolean EstaOcilando;
    private int timer;

    public ArCondicionado(){}
    
    public ArCondicionado(String modelo, int temperatura, int velocidade, boolean estaLigado, boolean estaOcilando, int timer) {
        this.modelo = modelo;
        this.temperatura = temperatura;
        this.velocidade = velocidade;
        this.estaLigado = estaLigado;
        EstaOcilando = estaOcilando;
        this.timer = timer;
    }


}
