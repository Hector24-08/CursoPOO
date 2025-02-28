package com.adrian.cursopoo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new View(this));

        // Creando o instanciqndo un objeto de la
        // Clase Gato

        Gato pepe = new Gato();
        // Accediendo al atributo edad con el objeto
        // pepe
        pepe.edad = 23;

        // Accediendo al metodo comer con el objeto
        // pepe
        pepe.comer();
    }

    // Definiendo o implementado la clase Gato

    class Gato {

        // Atributos o propiedades
        // de la clase Gato
        int edad = 5;
        int peso = 4;
        char sexo = 'M';
        boolean vivo = true;

        // Metodos de la clase Gato
        void comer() {}

        void dormir() {}

        void mauyar() {}
    }

    class Planta {

        // Atributos
        int edad = 12;
        int tamano = 34;

        // Metodos
        void dorrmir() {}

        void crece() {}
    }
}
