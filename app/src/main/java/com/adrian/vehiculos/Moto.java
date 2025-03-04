package com.adrian.vehiculos;

public class Moto {

    private int ruedas = 23;
    
    public boolean encendida = false;
    
    char marca = 'B';
    
    double kilometraje = 0.0d;

    private Moto() {}

    //Sobrecargando el metodo constructor
    private Moto(int tipo) {}

    void encender(boolean estado) {}
    
    //Sobrecargando el metodo andar
    public void andar(int velocidad) {}

    //Sobrecargando el metodo andar
    private void andar(int velocidad, int lugar) {}
}
