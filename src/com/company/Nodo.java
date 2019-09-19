package com.company;

import java.util.HashMap;

public class Nodo extends Hoja
{
    private HashMap<Integer,Hoja> hojasSiguentes;

    public Nodo(Integer numero, String contenido, String opcion)
    {
        super(numero, contenido, opcion);
        this.hojasSiguentes=new HashMap<>();
    }

    public Nodo(Integer numero, String contenido)
    {
        super(numero, contenido);
        this.hojasSiguentes=new HashMap<>();
    }

    public boolean agregarHojaSiguente(Hoja hoja)
    {
        if(this.hojasSiguentes.containsKey(hoja.getNumero()))
        {
            System.out.println("este numero de hoja ya existe");
            return false;
        }
        else
        {
           this.hojasSiguentes.putIfAbsent(hoja.getNumero(),hoja);
           if(this.hojasSiguentes.containsKey(hoja.getNumero()))
           {
               return true;
           }
           System.out.println("error al agregar la hoja");
           return false;
        }
    }
}
