package br.edu.iftm.arCondicionado.classes;

public class ArCondicionado {

    //Atribultos
    private String modelo;
    private int temperatura;
    private int velocidade;
    private boolean estaLigado;

    private boolean estaOcilando;
    private int timer;

    public ArCondicionado(){}

    public ArCondicionado(String modelo, int temperatura, int velocidade, boolean estaLigado, boolean estaOcilando, int timer) {
        this.modelo = modelo;
        this.temperatura = temperatura;
        this.velocidade = velocidade;
        this.estaLigado = estaLigado;
        this.estaOcilando = estaOcilando;
        this.timer = timer;
    }
    public void ligar(){
        estaLigado = true;
    }
    public void deligar(){
        estaLigado = false;
    }

    public void aumentar(){
        temperatura = temperatura + 2;
    }
    public void diminuir(){
        temperatura = temperatura - 2;
    }

    public void ligaOcilacao(){
        estaOcilando = true;
    }
    public void desligaOcilacao(){
        estaOcilando = false;
    }
    public void ligarTimer(int tempo){
        timer = tempo;
    }

    //Métodos getter e setters

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public boolean isEstaLigado() {
        return estaLigado;
    }

    public void setEstaLigado(boolean estaLigado) {
        this.estaLigado = estaLigado;
    }

    public boolean isEstaOcilando() {
        return estaOcilando;
    }

    public void setEstaOcilando(boolean estaOcilando) {
        this.estaOcilando = estaOcilando;
    }

    public int getTimer() {
        return timer;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }
}
