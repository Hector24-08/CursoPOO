package com.adrian.cetaceos;

public interface Concierto extends Habilidades, Sonido {
    
    public static final int TARIMAS = 4;
    
    public abstract void comenzar(float tiempo);
}
