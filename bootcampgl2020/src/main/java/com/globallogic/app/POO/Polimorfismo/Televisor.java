package com.globallogic.app.POO.Polimorfismo;

public class Televisor extends Electrodomestico {
    public double pulgadas;
    public String resolucion;

    static void encender() {
        System.out.println("Encendiendo televisor");
    }

    static void cambiarCanal(int canal) {
        System.out.println("Cambiando al canal " + canal);
    }
}
