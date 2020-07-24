package com.globallogic.app.ControlDeFlujos;

public class If {
    public static void main(String[] args) {
        // Ejercicio 4.1
        int varA = 3;
        int varB = 10;
        int suma = varA + varB;

        if (suma <= 10) {
            System.out.println("El valor de las sumas es: " + suma);
        } else {
            System.out.println("La suma de los numeros es Mayor a 10");
        }

        // Ejercicio 4.2
        char val1 = 'A';
        char val2 = 'b';

        if (Character.isLowerCase(val1)) {
            System.out.println("No es una letra mayuscula");
        } else {
            System.out.println("Es una letra mayuscula");
        }

        if (Character.isLowerCase(val2)) {
            System.out.println("No es una letra mayuscula");
        } else {
            System.out.println("Es una letra mayuscula");
        }

        // Ejercicio 4.3
        int valor = 400;

        if (valor == 300) {
            System.out.println("El descuento es de: " + valor * 0.2);
        } else if (valor > 350) {
            System.out.println("El descuento es de: " + valor * 0.25);
        } else {
            System.out.println("Sin descuentos, el total es: " + valor);
        }
    }
}
