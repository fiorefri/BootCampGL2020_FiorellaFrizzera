package com.globallogic.app.POO.Abstraccion;

public class MainAbstraccion {
    public static void main(String[] args) {
        Gato gato = new Gato();

        gato.setNombre("Midnight");
        gato.setPatas(4);

        System.out.println("El nombre del gato es: " + gato.getNombre());
        System.out.println("El numero de patas es: " + gato.getPatas());
    }
}
