package com.globallogic.app.ControlDeFlujos;

public class ForEach {
    public static void main(String[] args) {
        // Ejercicio 4.9
        int[] arrayNum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int num : arrayNum) {
            System.out.println("Valor iterado: " + num);
        }

        // Ejercicio 4.10
        String[] diasSem = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        for (String dia : diasSem) {
            System.out.println("Dia de la semana: " + dia);
        }

        // Ejercicio 4.11
        String mensaje = "BootCamp 2020";
        for (char letra : mensaje.toCharArray()) {
            System.out.println("Letra: " + letra);
        }
    }
}
