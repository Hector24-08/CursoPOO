package com.adrian.cursopoo;

import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.adrian.electrodomesticos.Lapto;
import com.adrian.electrodomesticos.PSP;
import com.adrian.electrodomesticos.Tablet;
import com.adrian.naves.CPU;
import com.adrian.naves.ChipP;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
TextView texto = new TextView(this);
texto.setText("Hola");    
//new LinearLayout(new MainActivity()) = new LinearLayout(this);
LinearLayout lienzo = new LinearLayout(this);
          
lienzo.setOrientation(LinearLayout.VERTICAL);
lienzo.setBackgroundColor(Color.BLUE);  
lienzo.addView(texto);  
        

        this.setContentView(lienzo);

        CPU corei7 = new CPU();
        corei7.circuitos = 34;
        corei7.nombre = "i7";
        corei7.procesar(34);
        
    }
}
