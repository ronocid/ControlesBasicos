package com.android.curso.controlesbasicos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class ButtonsActivity extends AppCompatActivity {
    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);

        //Codigo para el button
        txt = (TextView) findViewById(R.id.txt1);
        final Button boton = (Button) findViewById(R.id.testButton);

        /*View.OnClickListener eventoBoton = new View.OnClickListener() {
            int vecesPulsado = 0;
            @Override
            public void onClick(View view) {
                      vecesPulsado++;
                txt.setText("Se ha pulsado el botón "+ vecesPulsado+ " vez/veces");
            }
        };

        boton.setOnClickListener(eventoBoton);*/


        //Codigo para el ToggleButton
        final TextView txtON = (TextView) findViewById(R.id.txtOn);
        final TextView txtOFF = (TextView) findViewById(R.id.txtOff);

        final ToggleButton botonToggle = (ToggleButton) findViewById(R.id.toggleButton1);

        View.OnClickListener eventoToggle = new View.OnClickListener() {
            int vecesOn = 0;
            int vecesOff = 0;
            @Override
            public void onClick(View view) {
                if(botonToggle.isChecked()){
                    vecesOn++;
                    txtON.setText("El botón ha estado encendido "+ vecesOn+ " vez/veces");
                }else{
                    vecesOff++;
                    txtOFF.setText("El botón ha estado apagado "+ vecesOff+ " vez/veces");
                }
            }
        };

        botonToggle.setOnClickListener(eventoToggle);


        //Codigo para el ToggleButton
        final TextView txtONSwitch = (TextView) findViewById(R.id.txtOnSwitch);
        final TextView txtOFFSwitch = (TextView) findViewById(R.id.txtOffSwitch);

        final Switch bSwitch = (Switch) findViewById(R.id.bswitch);

        View.OnClickListener eventoSwitch = new View.OnClickListener() {
            int vecesOn = 0;
            int vecesOff = 0;
            @Override
            public void onClick(View view) {
                if(bSwitch.isChecked()){
                    vecesOn++;
                    txtONSwitch.setText("El botón ha estado encendido "+ vecesOn+ " vez/veces");
                }else{
                    vecesOff++;
                    txtOFFSwitch.setText("El botón ha estado apagado "+ vecesOff+ " vez/veces");
                }
            }
        };

        bSwitch.setOnClickListener(eventoSwitch);
    }

    int vecesPulsado = 0;
    public void cuenta(View view) {
        vecesPulsado++;
        txt.setText("Se ha pulsado el botón "+ vecesPulsado+ " vez/veces");
    }
}
