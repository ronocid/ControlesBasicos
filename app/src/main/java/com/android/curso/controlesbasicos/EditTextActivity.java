package com.android.curso.controlesbasicos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.widget.EditText;

public class EditTextActivity extends AppCompatActivity {

    public static final String TAG = "EditTextActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        EditText editText = (EditText) findViewById(R.id.editText);
        String texto = editText.getText().toString();
        String textoHtml = Html.toHtml(editText.getText());


        editText.setText(Html.fromHtml("<p>Esto es una <b>prueba</b>.</p>"));
    }
}
