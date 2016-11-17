package com.android.curso.controlesbasicos;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);

        TextView textView5 = (TextView) findViewById(R.id.textView5);
        textView5.setText("Texto en código");
        textView5.setTextSize(24);
        textView5.setTextColor(Color.parseColor("#FFFFFFFF"));
        textView5.setBackgroundColor(Color.parseColor("#FF123456"));
        textView5.setTypeface(Typeface.DEFAULT_BOLD);
    }
}
