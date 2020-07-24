package com.globallogic.app.EstructurasBasicas;

public class EmpleadoDemo {
    public static void main(String[] args) {
        new Empleado();

        Empleado.setSalario(1000);

        System.out.println(Empleado.getNombre() + " tiene un salario promedio de " + Empleado.getSalario());
    }
}
