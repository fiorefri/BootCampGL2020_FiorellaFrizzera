package com.globallogic.app.ControlDeFlujos;

public class While {
    public static void main(String[] args) {
        // Ejercicio 4.7
        int i = 1;
        while (i <= 10) {
            System.out.println("Valor iterado: " + i);
            i++;
        }

        // Ejercicio 4.8
        int j = 1;
        while (j <= 50) {
            if (j % 2 == 0) {
                System.out.println("Valor iterado " + j + " par");
            } else {
                System.out.println("Valor iterado " + j + " impar");
            }
            j++;
        }
    }
}
