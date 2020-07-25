package com.globallogic.app.POO.Polimorfismo;

public class Heladera extends Electrodomestico {
    public double capacidad;
    public boolean tieneFreezer;
    public double capacidadFreezer;

    static void encender() {
        System.out.println("Encendiendo heladera");
    }

    static void guardarElemento(String elemento) {
        System.out.println("Guardando " + elemento);
    }

    static void extraerElemento(String elemento) {
        System.out.println("Extrayendo " + elemento);
    }
}
