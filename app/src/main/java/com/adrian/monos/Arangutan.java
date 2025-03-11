package com.adrian.monos;
import com.adrian.animales.Perro;

public class Arangutan extends Primate implements HabilidadesPrimate {

    //Datos de tipp numeros enteros
    public byte numeroOjos = 5;
    
    public short peso = 0;
    
    public int tipo = 0;
    
    public long edad = 0;
    
    //Datos de tipo numeros decimales
    
    public float tiempo = 0;
    
    public double era = 0;
    
    //Datos de tipo caracter
    
    public char sexo = ' ';
    
    //Datos de tipo boleano
    
    public boolean vivo = false;
    
    public boolean muerto = false;
    
    //Datos de tipo Objeto
    
    Perro gufi = null;
    
    

    public Arangutan() {
        super(4);
    }

    @Override
    public void comer(int cantidad) {}

    @Override
    public int saltar(int distancia) {
        return 4;
    }

    @Override
    public void procrear(boolean estado) {}
    
    @Override
    public int comerFruta(int cantidad) {
        // TODO: Implement this method
        return super.comerFruta(cantidad);
    }
    
    @Override
    public void criar() {
        super.criar();
        // TODO: Implement this method
    }
    
    
    
}
