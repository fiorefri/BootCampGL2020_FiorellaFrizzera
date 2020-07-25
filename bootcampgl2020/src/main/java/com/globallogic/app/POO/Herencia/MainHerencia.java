package com.globallogic.app.POO.Herencia;

public class MainHerencia {
    public static void main(String[] args) {
        // Electrodomestico
        Electrodomestico electro = new Electrodomestico();

        electro.marca = "Samsung";
        electro.peso = 20;
        electro.consumo = 'A';
        electro.color = "Blanco";

        System.out.println("El electrodomestico es de marca: " + electro.marca);
        System.out.println("El electrodomestico es de peso: " + electro.peso);
        System.out.println("El electrodomestico es de consumo: " + electro.consumo);
        System.out.println("El electrodomestico es de color: " + electro.color);
        electro.encender();
        electro.apagar();

        System.out.print("\n");

        // Heladera
        Heladera heladera = new Heladera();

        heladera.marca = "Philips";
        heladera.peso = 30;
        heladera.consumo = 'B';
        heladera.color = "Negro";
        heladera.capacidad = 15;
        heladera.tieneFreezer = true;
        heladera.capacidadFreezer = 5;

        System.out.println("La heladera es de marca: " + heladera.marca);
        System.out.println("La heladera es de peso: " + heladera.peso);
        System.out.println("La heladera es de consumo: " + heladera.consumo);
        System.out.println("La heladera es de color: " + heladera.color);
        System.out.println("La heladera es de capacidad: " + heladera.capacidad);
        System.out.println("La heladera tiene freezer? " + heladera.tieneFreezer);
        System.out.println("El freezer tiene capacidad: " + heladera.capacidadFreezer);
        heladera.encender();
        heladera.apagar();
        heladera.guardarElemento("Manzana");
        heladera.extraerElemento("Pera");
    }
}
