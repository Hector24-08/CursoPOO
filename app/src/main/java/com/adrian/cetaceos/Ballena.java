package com.adrian.cetaceos;

public class Ballena extends Cetaceo {

    public int numeroOjos;

    public Ballena() {
        super();

        this.numeroOjos = 2;
    }

    public Ballena(int largo) {
        super(largo);
    }

    @Override
    public void respirar() {}

    @Override
    public void respirar(float tiempo) {
        
    }

    @Override
    public int comer(double tiempo) {

        return 34;
    }

    public void amantar() {
        
    }
}
