package com.globallogic.app.POO.Abstraccion;

public class Gato {
    private String nombre;
    private int patas;

    // Nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    // Patas
    public int getPatas() {
        return patas;
    }

    public void setPatas(int numeroPatas) {
        this.patas = numeroPatas;
    }
}
