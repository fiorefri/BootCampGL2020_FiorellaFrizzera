package com.globallogic.app.POO.Polimorfismo;

public class Cafetera extends Electrodomestico {
    public double litros;

    public void encender() {
        System.out.println("Encendiendo cafetera");
    }

    public void elegirSabor(String sabor) {
        System.out.println("El sabor del cafe es: " + sabor);
    }
}
