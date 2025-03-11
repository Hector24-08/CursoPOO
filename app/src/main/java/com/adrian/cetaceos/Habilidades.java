package com.adrian.cetaceos;

public interface Habilidades {

    public static final int OJO = 2;
    public static final int BOCA = 1;

    public abstract void correr();

    public abstract void correr(float tiempo);

    public int obtenerFuerza(char tipo);
}
