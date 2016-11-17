package com.android.curso.controlesbasicos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class RadioButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        //Obtenemos el grupo
        RadioGroup grupo = (RadioGroup) findViewById(R.id.radioGroup);

        //Establece la marca en un radio determinado
        grupo.check(R.id.radio2);

        //Elimina la marca de todas las opciones
        grupo.clearCheck();

        //Nos devolverá el ID del radio marcado o -1 si no hay ninguno
        int id = grupo.getCheckedRadioButtonId();

        //Obtenemos la etiqueta de texto
        final TextView txt = (TextView) findViewById(R.id.textView);

        RadioGroup.OnCheckedChangeListener evento = new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                txt.setText("El ID selecionado es: "+ checkedId);
            }
        };

        //Asignamos el evento creado al grupo
        grupo.setOnCheckedChangeListener(evento);
    }
}
