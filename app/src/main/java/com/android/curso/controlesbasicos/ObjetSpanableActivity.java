package com.android.curso.controlesbasicos;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.Spannable;
import android.text.style.StyleSpan;
import android.widget.TextView;

public class ObjetSpanableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objet_spanable);

        //Creamos un objeto Editable
        Editable str = Editable.Factory.getInstance().newEditable("Pruebas de texto");

        //Establecemos que la palabra "Pruebas" sea negrita
        str.setSpan(new StyleSpan(Typeface.BOLD),0,7, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        //Obtenemos la etiqueta de pruebas
        TextView etiqueta = (TextView) findViewById(R.id.txtPrueba);

        etiqueta.setText(str);
    }
}
