package com.android.curso.controlesbasicos.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.android.curso.controlesbasicos.R;

import java.util.ArrayList;
import java.util.List;

public class CustomListActivity extends AppCompatActivity {
    private TextView textSelection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);

        ListView listView = (ListView) findViewById(R.id.listview);
        textSelection = (TextView) findViewById(R.id.text);

        List<Animal> items = createListItems();

        ListAdapter adapter = new ListAdapter(this,items);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String selection = ((Animal)adapterView.getAdapter().getItem(position)).getNombre();

                //String selection = ((TextView)view.findViewById(R.id.tvContent)).getText().toString();

                textSelection.setText("Selección: "+selection);
            }
        });
    }

    private List<Animal> createListItems() {
        List<Animal> items = new ArrayList<>();
        items.add(new Animal("aguila", R.drawable.aguila));
        items.add(new Animal("ballena", R.drawable.ballena));
        items.add(new Animal("caballo", R.drawable.caballo));
        items.add(new Animal("camaleon", R.drawable.camaleon));
        items.add(new Animal("canario", R.drawable.canario));
        items.add(new Animal("cerdo", R.drawable.cerdo));
        items.add(new Animal("delfin", R.drawable.delfin));
        items.add(new Animal("gato", R.drawable.gato));
        items.add(new Animal("iguana", R.drawable.iguana));
        items.add(new Animal("lince", R.drawable.lince));
        items.add(new Animal("lobo", R.drawable.lobo_9));
        items.add(new Animal("morena", R.drawable.morena));
        items.add(new Animal("orca", R.drawable.orca));
        items.add(new Animal("perro", R.drawable.perro));
        items.add(new Animal("vaca", R.drawable.vaca));
        return items;
    }
}
