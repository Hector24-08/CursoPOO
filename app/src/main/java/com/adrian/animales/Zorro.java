package com.adrian.animales;

import android.content.Context;
import android.graphics.Picture;
import android.widget.Toast;

public class Zorro {

    // Atributo por valor
    public int edad = 12;
    // Atribito por referencia
    public Perro toby = new Perro();

    public Zorro(Context contexto) {
        
        //Atributo edad
        this.edad = 34;
        
        //Atributo toby, obketo de la clase Perro
        this.toby.edad = 12;
        this.toby.dormir();
        this.toby.comer();

        Toast.makeText(contexto, "Edad " + edad, Toast.LENGTH_SHORT).show();
    }

    public void auyar(float tiempo) {}
}
