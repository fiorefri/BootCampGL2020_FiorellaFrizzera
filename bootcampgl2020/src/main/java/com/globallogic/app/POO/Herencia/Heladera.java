package com.globallogic.app.POO.Herencia;

public class Heladera extends Electrodomestico {
    public double capacidad;
    public boolean tieneFreezer;
    public double capacidadFreezer;

    static void guardarElemento(String elemento) {
        System.out.println("Guardando " + elemento);
    }

    static void extraerElemento(String elemento) {
        System.out.println("Extrayendo " + elemento);
    }
}
