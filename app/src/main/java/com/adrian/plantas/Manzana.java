package com.adrian.plantas;

import com.adrian.cetaceos.Dias;

public class Manzana {

    public int numeroHojas;

    // Creando un atributo de tipo enumerado
    public Dias diasSeman;

    // Arrays o Matrices y Vectores

    public int[] datos = {23, 45, 34};

    public char[] letras = {'A', 'B', 'C', 'M'};

    public boolean[] condiciones = new boolean[4];

    public float[] tiempos = new float[3];
    
    
    // Array Bidimencionales 
    
    public int[][] edades = { {23,24,34},{23,2,4},{13,4,3}};
    
    public float[][] espacios = new float[3][4];

    public Manzana() {
        super();
        
          // Asignado volores al array Bidimencionales
        
        edades[0][0] = 34; 
        
        edades[0][1] = 3; 
        
        edades[0][2] = 346; 
        
        edades[1][0] = 345; 
        
        edades[1][1] = 36; 
        
        edades[1][2] = 3646; 
        
        edades[2][0] = 34; 
        
        edades[2][1] = 3; 
        
        edades[2][2] = 346; 
        
        

        // Asignado volores al array
        condiciones[0] = true;

        condiciones[1] = true;

        condiciones[2] = false;

        condiciones[3] = true;

        tiempos[0] = 34.23f;

        tiempos[1] = 3.23f;

        tiempos[2] = 345.23f;

        // Usar los arrays

        datos[0] = 'F';

        datos[1] = '5';

        datos[2] = '@';

        datos[3] = '$';

        // Inicializando el atributo
        numeroHojas = 100000;

        // Inicializando el enumerado
        diasSeman = Dias.LUNES;

        // Cambiando volor del enumerado

        diasSeman = Dias.JUEVES;

        int numero = 34;

        if (diasSeman == Dias.DOMINGO) {

            numero = 36;

        } else {

            numero = 234;
        }
    }

    public void crecer(int distancia) {}
}
