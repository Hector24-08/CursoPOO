package com.adrian.animales;

public class Aguila {
    //Definiendo atribitos
    private static final byte ALAS = 2;
    protected int edad;
    public boolean viva;
    public char sexo;
    public Perro gufi;
    
    public Aguila()
    {
        //Inicializando Atributos
       edad = 12;
       viva = true;
       sexo = 'F';
       gufi = new Perro();
        
    }
    
    
    public void volar()
    {
        
    }
    
    public void volar(int altura)
    {
        
    }
}
