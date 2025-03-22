package com.adrian.plantas;

public class Cebolla {

    // Exisste en toda la clase
    public static final int TIPO = 1;

    private int alturaPlanta;

    private float tiempoPlanta;

    public Cebolla(int peso) {

        super();
        // Solo existe en el constructor
        Cebolla morada = new Cebolla(56);

        morada.alturaPlanta = 0;

        morada.tiempoPlanta = 0;

        // Reasignado
        this.alturaPlanta = Cebolla.TIPO;

        this.tiempoPlanta = 0;
    }

    public void crecer(int altura, float tiempo) {


        // Reasignado valor
        this.alturaPlanta = altura;

        this.tiempoPlanta = tiempo;
    }
}
