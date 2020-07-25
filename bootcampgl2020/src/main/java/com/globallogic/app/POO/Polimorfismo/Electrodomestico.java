package com.globallogic.app.POO.Polimorfismo;

public class Electrodomestico {
    public String marca;
    public double peso;
    public char consumo;
    public String color;

    static void encender() {
        System.out.println("Encendiendo electrodomestico");
    }

    static void apagar() {
        System.out.println("Apagando electrodomestico");
    }
}
