package com.android.curso.controlesbasicos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class CheckBoxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        CheckBox check = (CheckBox) findViewById(R.id.checkbox);
        CompoundButton.OnCheckedChangeListener eventoCheck = new CheckBox.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton checkView, boolean isChecked) {
                if(isChecked){
                    checkView.setText("Realizado");
                }else{
                    checkView.setText("No realizado");
                }
            }
        };

        check.setOnCheckedChangeListener(eventoCheck);
    }
}
