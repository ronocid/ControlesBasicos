package com.android.curso.controlesbasicos.listview;

/**
 * Created by roberto.nova on 18/11/2016.
 */

public class Animal {
    private String nombre;
    private int drawableImageID;

    public Animal(String nombre, int drawableImageID) {
        this.nombre = nombre;
        this.drawableImageID = drawableImageID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDrawableImageID() {
        return drawableImageID;
    }

    public void setDrawableImageID(int drawableImageID) {
        this.drawableImageID = drawableImageID;
    }
}
