// Paquete o directorio donde se encuentra
// la clase Perro
package com.adrian.animales;

// Clase publica Perro
public class Perro {

    // Atribitos de la clase Perro

    public int edad = 12; // Publico

    private int peso = 23; // Privado

    protected char sexo = 'M'; // Protegido

    boolean vivo = true; // Por defecto

    // Constructor de la clase Perro
    public Perro() {}

    // Metodos de la clase Perro

    public void dormir() { // Publico
    }

    protected void comer() { // Protegido
    }

    private void caminar() { // Privado
    }

    void ladrar() { // Por defecto
    }
}
