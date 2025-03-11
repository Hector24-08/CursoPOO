package com.adrian.cetaceos;

import com.adrian.animales.Perro;

public abstract class Cetaceo {

    public static final boolean ESTADO_VIVA = true;
    public static final boolean ESTADO_MUERTA = false;

    protected byte edad;
    protected char sexo;
    protected float duracionRespiro;

    private double tiempoCaza;
    private short numeroAletas;

    public static int peso = 13000;
    public final int ancho = 12;

    protected volatile boolean sana = true;

    private Perro amigo;

    public Cetaceo() {
        super(); // Acediendo al metodo constructor
        // de la super clase Object
        this.edad = 45;
        this.amigo = new Perro();
        this.numeroAletas = 4;
        this.tiempoCaza = 23.34d;
        this.duracionRespiro = 45.567f;
        this.sexo = 'M';
    }

    public Cetaceo(int largo) {
        super(); // Acediendo al metodo constructor
        // de la super clase Object
        this.edad = 45;
        this.amigo = new Perro();
        this.numeroAletas = 4;
        this.tiempoCaza = 23.34d;
        this.duracionRespiro = 45.567f;
        this.sexo = 'M';
    }

    public abstract void respirar();

    public abstract void respirar(float tiempo);

    public abstract int comer(double tiempo);

    final void morder(int fuerza) {
        
    }

    private void sentir() {
        
    }

    public static final void cantar(float duracion) {
        
    }

    protected void cazar(int velocidad) {
        
    }

    protected void cazar(int velocidad, float duracion) {
        
    }

    public boolean estadoVida() {

        return true;
    }
}
