package com.globallogic.app.POO.Polimorfismo;

public class Heladera extends Electrodomestico {
    public double capacidad;
    public boolean tieneFreezer;
    public double capacidadFreezer;

    public void encender() {
        System.out.println("Encendiendo heladera");
    }

    public void guardarElemento(String elemento) {
        System.out.println("Guardando " + elemento);
    }

    public void extraerElemento(String elemento) {
        System.out.println("Extrayendo " + elemento);
    }
}
