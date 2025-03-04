package com.adrian.cursopoo;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.adrian.electrodomesticos.Lapto;
import com.adrian.electrodomesticos.PSP;
import com.adrian.electrodomesticos.Tablet;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(new View(this));

        Lapto vid = new Lapto();

        vid.cargar();
        vid.encender(23.34f);
        vid.potenciaMaxiama(true);
        vid.numeroNucleos = 8;

        Tablet canaima = new Tablet();

        canaima.inivir();
        canaima.encender(2.3f);
        canaima.potenciaMaxiama(true);
        canaima.numeroNucleos = 4;

        PSP pspVita = new PSP();

        pspVita.configurar();
        pspVita.encender(4.4f);
        pspVita.potenciaMaxiama(true);
        pspVita.numeroNucleos = 8;
    }
}
