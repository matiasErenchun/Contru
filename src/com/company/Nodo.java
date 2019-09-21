package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Nodo extends Hoja
{
    private ArrayList<Opcion>opcions;

    public Nodo(Integer numero, String contenido)
    {
        super(numero, contenido);
        this.opcions=new ArrayList<>();
    }

    public boolean agregarOpcion(Opcion opcion)
    {
        return this.opcions.add(opcion);
    }

}
