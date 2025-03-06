package com.adrian.naves;

public abstract class Helicoptero {
    
    
    public Helicoptero()
    {
        
    }
    
    //Metodos abstractos
    public abstract void volar();
    
    public abstract int aterrizar(float tiempo);
    
    public abstract void alumbrar(int tipo);
}
