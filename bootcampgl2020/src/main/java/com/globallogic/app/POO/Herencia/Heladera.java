package com.globallogic.app.POO.Herencia;

public class Heladera extends Electrodomestico {
    public double capacidad;
    public boolean tieneFreezer;
    public double capacidadFreezer;

    public void guardarElemento(String elemento) {
        System.out.println("Guardando " + elemento);
    }

    public void extraerElemento(String elemento) {
        System.out.println("Extrayendo " + elemento);
    }
}
