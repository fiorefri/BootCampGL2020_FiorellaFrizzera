package com.globallogic.app.POO.Polimorfismo;

public class Televisor extends Electrodomestico {
    public double pulgadas;
    public String resolucion;

    public void encender() {
        System.out.println("Encendiendo televisor");
    }

    public void cambiarCanal(int canal) {
        System.out.println("Cambiando al canal " + canal);
    }
}
