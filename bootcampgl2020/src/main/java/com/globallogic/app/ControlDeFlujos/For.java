package com.globallogic.app.ControlDeFlujos;

public class For {
    public static void main(String[] args) {
        // Ejercicio 4.4
        for (int i = 1; i <= 10; i++) {
            System.out.println("Valor iterado: " + i);
        }

        // Ejercicio 4.5
        int contador = 0;
        for (int j = 0; j <= 10000; j++) {
            if (j % 20 == 0) {
                contador++;
            }
        }
        System.out.println("Valor final del contador: " + contador);

        // Ejercicio 4.6
        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

        for (int k = 0; k < dias.length; k++) {
            System.out.println("Dia de la semana: " + dias[k]);
        }
    }
}
