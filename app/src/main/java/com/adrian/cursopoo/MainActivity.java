package com.adrian.cursopoo;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.adrian.cetaceos.Ballena;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        TextView texto = new TextView(this);
        texto.setText("Hola");
        // new LinearLayout(new MainActivity()) = new LinearLayout(this);
        LinearLayout lienzo = new LinearLayout(this);

        lienzo.setOrientation(LinearLayout.VERTICAL);
        lienzo.setBackgroundColor(Color.WHITE);
        lienzo.addView(texto);

        this.setContentView(lienzo);

        //  El codicinal if

        int numero1 = 120;
        int numero2 = 12;
        boolean vivo = false;

        char letra1 = 'A';
        char letra2 = 'C';

        String texto1 = new String();

        if ((texto1 == null) || (numero1 == numero2)) {

            texto.setText("Se cumplio condicion");

        } else {

            texto.setText("No Se cumplio condicion");
        }

        // Codicinal switch

        String mensaje = "Eso";

        switch (mensaje) {
            case "Hola":
                texto.setText("Se cumplio condicion");

                break;

            case "Camara":
                texto.setText("Se cumplio condicion");

                break;

            default:
     texto.setText("No Se cumplio ninguna condicion");

                break;
        }
        
        
        boolean activo = true;
        boolean desactivado = false;
        
        if(activo)
        {
            
           texto.setText("Se cumplio condicion");

        
        } else if(desactivado) {
            
        	texto.setText("Se cumplio condicion");
        }else
        {
            
          texto.setText("No Se cumplio ninguna condicion"); 
            
        }
        
        
       //Bucles
        
        int edad1 = 1;
        int edad2 = 34;
       
       while(edad1>edad2) {
            
            texto.setText("Se repite infinitamemte"); 
      
       	
       } 
        
        
        
        
        
        
    }
}
