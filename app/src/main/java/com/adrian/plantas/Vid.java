package com.adrian.plantas;

public class Vid {

    // Atributos
    private int numeroFlores = 1000;
    protected float tiempoCosecha = 3.4f;
    public boolean planta = true;
    boolean comestible = true;

    // Metodo constructor
    public Vid() {}

    // Metodo constructor sobrecargado
    Vid(int tipo) {}
    
    // Metodos
    void crece() {}
    public void duerme() {
        
        
    }
    // Metodo duerme sobrecargado
    public void duermer(float tiempo, int duracion) {}
    // Metodo duerme sobrecargado
    protected void duerme(boolean dispierto) {}
    // Metodo duerme sobrecargado
    public void respira() {}
}
