package com.adrian.cetaceos;

public class Discoteca implements Concierto, Sonido {

    public int tipoLugar = 34;

    public Discoteca() {}

    @Override
    public void comenzar(float tiempo) {}

    @Override
    public void sonar() {}

    @Override
    public void transmitir() {}

    @Override
    public void correr() {}

    @Override
    public void correr(float tiempo) {}

    @Override
    public int obtenerFuerza(char tipo) {
        return 6;
    }
}
