package com.globallogic.app.EstructurasBasicas;

import java.util.Scanner;

public class StudentsDetails {
    public void StudentAge(int age) {
        System.out.println("La edad del estudiante es: " + age);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentsDetails estudiante = new StudentsDetails();

        System.out.println("Ingrese la edad del estudiante:");
        int age = scanner.nextInt();
        estudiante.StudentAge(age);

        scanner.close();
    }
}
