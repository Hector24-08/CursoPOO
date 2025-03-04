package com.adrian.automoviles;

public class Avion {
    private byte numeroAlas = 2;
    public boolean activo = true;
    public float tiempoVuelo = 34.456f;
    // Atributo estatico
    public static int cantidadConbustible = 34;

    protected Avion(int tipo) {}

    public Avion() {}

    public Avion(boolean operativo) {}

    void volar(double tiempo) {}

    // Metodo estatico
    public static void alumbrarCielo() {}

    // Metodo estatico
    private static int obtenerVelocidad() {
        return 50;
    }

    // Metodo con valor de retorno
    private boolean volar() {
        return true;
    }

    protected void planear(boolean estado) {}

    // Metodo con valor de retorno
    public int aumetarVelocidad(int cantidad) {

        return 34;
    }
}
