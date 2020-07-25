package com.globallogic.app.POO.Polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class MainPolimorfismo {
    public static void main(String[] args) {
        // Heladera
        Heladera heladera = new Heladera();

        heladera.marca = "Philips";
        heladera.peso = 30;
        heladera.consumo = 'B';
        heladera.color = "Negro";
        heladera.capacidad = 15;
        heladera.tieneFreezer = true;
        heladera.capacidadFreezer = 5 ;

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

        System.out.print("\n");

        // Televisor
        Televisor televisor = new Televisor();

        televisor.marca = "Samsung";
        televisor.peso = 7;
        televisor.consumo = 'B';
        televisor.color = "Gris";
        televisor.pulgadas = 15;
        televisor.resolucion = "HD";

        System.out.println("El televisor es de marca: " + televisor.marca);
        System.out.println("El televisor es de peso: " + televisor.peso);
        System.out.println("El televisor es de consumo: " + televisor.consumo);
        System.out.println("El televisor es de color: " + televisor.color);
        System.out.println("El televisor es de pulgadas: " + televisor.marca);
        System.out.println("El televisor es de resolucion: " + televisor.resolucion);
        televisor.encender();
        televisor.apagar();
        televisor.cambiarCanal(15);

        System.out.print("\n");

        // Cafetera
        Cafetera cafetera = new Cafetera();

        cafetera.marca = "Moulinex";
        cafetera.peso = 2;
        cafetera.consumo ='A';
        cafetera.color = "Rojo";
        cafetera.litros = 1;

        System.out.println("La cafetera es de marca: " + cafetera.marca);
        System.out.println("La cafetera es de peso: " + cafetera.peso);
        System.out.println("La cafetera es de consumo: " + cafetera.consumo);
        System.out.println("La cafetera es de color: " + cafetera.color);
        System.out.println("La cafetera es de litros: " + cafetera.litros);
        cafetera.encender();
        cafetera.apagar();
        cafetera.elegirSabor("Capuccino");

        System.out.print("\n");

        // Lista Electrodomesticos
        Heladera heladera1 = new Heladera();
        Televisor televisor1 = new Televisor();
        Cafetera cafetera1 = new Cafetera();

        Electrodomestico[] electros = {heladera1, televisor1, cafetera1};

        for (Electrodomestico electro : electros) {
            electro.encender();
        }
    }
}
