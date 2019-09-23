package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Nodo extends Hoja
{
    private ArrayList<Opcion> opcions;

    public Nodo(Integer numero, String contenido)
    {
        super(numero, contenido);
        this.opcions = new ArrayList<>();
    }

    public boolean agregarOpcion(Opcion opcion)
    {
        return this.opcions.add(opcion);
    }


    public Integer mostrarElegirOpcion()
    {
        if(this.opcions.size()>0)
        {
            int i=0;
            while(i<this.opcions.size())
            {
                System.out.println("opcion "+(i+1)+": "+this.opcions.get(i).getOpcion());
                i++;
            }
            Lector lector=new Lector();
            Integer opcion=lector.leerNumero("ingrese la opcion que desea tomar");
            while (opcion-1<0 && opcion>=this.opcions.size())
            {
                System.out.println("opcion ingresada no es valida");
                opcion=lector.leerNumero("ingrese la opcion que desea tomar");
            }

             return this.opcions.get(opcion-1).getNumeroHojaDestino();

        }
        System.out.println("camino sin salida");
        return -1;
    }

    public boolean agregarOpcion(String texto,Integer paginaDestino)
    {
        Opcion opcion=new Opcion(texto,paginaDestino);
        return this.opcions.add(opcion);
    }

}
