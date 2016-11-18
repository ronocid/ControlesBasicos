package com.android.curso.controlesbasicos.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.android.curso.controlesbasicos.R;

import java.util.ArrayList;
import java.util.List;

public class SimpleListActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_list);

        listView = (ListView)findViewById(R.id.listview);

        List<String> list = new ArrayList<String>();
        list.add("Mercury");
        list.add("Venus");
        list.add("Earth");
        list.add("Mars");
        list.add("Jupiter");
        list.add("Saturn");
        list.add("Uranus");
        list.add("Neptune");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);

    }
}
