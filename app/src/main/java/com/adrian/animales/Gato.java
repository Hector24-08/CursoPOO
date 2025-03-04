package com.adrian.animales;

import com.adrian.plantas.Girasol;

public class Gato {
    // Modificador statatic
    // Puede ser accedido sin instanciar
    // un objeto de la clase
    public static int edad = 23;
    public char sexo = 'F';
    protected long tamano = 34;
    public Perro gufi = new Perro();
    Girasol pepe = new Girasol();

    public Gato(int tipo) {}

    public Gato() {}

    void dormir() {}

    // Modificador statatic
    // Puede ser accedido sin instanciar
    // un objeto de la clase
    public static int dormir(double tiempo) {

        return 34;
    }

    float dormir(char sexo, float animo) {

        return 45.3f;
    }
}
