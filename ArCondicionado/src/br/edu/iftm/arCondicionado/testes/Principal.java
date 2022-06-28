package br.edu.iftm.arCondicionado.testes;

import br.edu.iftm.arCondicionado.classes.ArCondicionado;

public class Principal {
    public static void main(String[] args) {
        ArCondicionado objeto = new ArCondicionado("LG", 18,1, true,false,0);
        System.out.println("Modelo do ar condicionado: " + objeto.getModelo());
        objeto.setModelo("Fujitsu");
        System.out.println("Modelo do ar condicionado: " + objeto.getModelo());



    }

}
