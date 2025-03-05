package com.adrian.naves;

/** subclase Avion clase que hereda
 de la clase Nave */
public class Avion extends Nave {

    // Atributos
    public int numeroMotores = 2;

    public char color = 'V';

    // Metodos contructores
    public Avion() {

        // Esto es lo mismo que this
        // Avion f15 = new Avion(); = this
        Avion f15 = new Avion();

        f15.ensendida = true;
        f15.encender();
        f15.volar(400);
        f15.planer(500);

        // Esto es lo mismo que arriba
        this.ensendida = true;
        this.encender();
        this.volar(400);
        this.planer(500);

        // Esto es lo mismo que super
        // Nave nave1 = new Nave(); = super
        Nave nave1 = new Nave();

        nave1.encender(3);
        nave1.ensendida = true;
        nave1.numeroAlas = 2;

        // Esto es lo mismo que arriba
        super.encender(3);
        super.ensendida = true;
        super.numeroAlas = 2;
    }

    public Avion(short tipo) {}

    // Metodo sobrescrito

    @Override
    public void encender() {

        // Vieja logica
        super.encender();

        // Nueva logica
    }

    // Metodos
    public void planer(int altura) {}

    public int obtenerSenal() {

        return 34;
    }
}

/* Esta clase hereda los atributos
y metodos de la clase Nave */
