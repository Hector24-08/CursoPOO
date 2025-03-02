package com.adrian.cursopoo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
// Importando clase Loro del paquete animales
import com.adrian.animales.Loro;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new View(this));

        // Instanciando un objeto
        // de la clase Loro

        Loro pepito = new Loro();

        pepito.alas = 2;

        pepito.tiempoVidad = 23;

        pepito.comer();
    }
}
