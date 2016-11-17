package com.android.curso.controlesbasicos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ImageViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        ImageView img = (ImageView) findViewById(R.id.imageView);
        img.setImageResource(R.drawable.stop);
    }
}
