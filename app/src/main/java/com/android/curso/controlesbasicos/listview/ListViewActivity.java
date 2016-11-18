package com.android.curso.controlesbasicos.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.android.curso.controlesbasicos.R;

public class ListViewActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        Button buttonSimpleList = (Button)findViewById(R.id.button_simple_list);
        Button buttonCustomList = (Button)findViewById(R.id.button_custom_list);

        buttonSimpleList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(),SimpleListActivity.class);
                startActivity(intent);
            }
        });

        buttonCustomList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(),CustomListActivity.class);
                startActivity(intent);
            }
        });
    }

}
