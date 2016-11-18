package com.android.curso.controlesbasicos.listview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.curso.controlesbasicos.R;

import java.util.List;

/**
 * Created by roberto.nova on 17/11/2016.
 */

public class ListAdapter extends ArrayAdapter<Animal> {
    private final Activity context;
    private final List<Animal> items;

    public ListAdapter(Activity context,List<Animal> items) {
        super(context, R.layout.item_listview,items);
        this.context = context;
        this.items = items;
    }

    public View getView(int position, View convertView,ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View view = inflater.inflate(R.layout.item_listview, null);

        Animal item = items.get(position);

        ImageView imagen = (ImageView) view.findViewById(R.id.imgAnimal);
        imagen.setImageResource(item.getDrawableImageID());

        TextView nombre = (TextView) view.findViewById(R.id.tvContent);
        nombre.setText(item.getNombre());

        TextView numCelda = (TextView) view.findViewById(R.id.tvField);
        numCelda.setText(String.valueOf(position));

        return view;
    }
}
