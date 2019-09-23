package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Biblioteca
{
    private HashMap<String,Historia> historias;

    public Biblioteca()
    {
        this.historias = new HashMap<>();
    }

    public boolean agregarHistoria(Historia historia)
    {
        boolean contiene=this.historias.containsKey(historia.getTitulo());
        if(contiene)
        {
            System.out.println("esta historia ya existe o por lo menos este nombre ya existe");
            return false;
        }
        else
        {
            this.historias.put(historia.getTitulo(),historia);
            return true;
        }
    }

    public void mostrarHistorias()
    {
        Collection<Historia> contenerdorHistorias= this.historias.values();
        for (Historia historia : contenerdorHistorias)
        {
            System.out.println(historia.toString());
        }
    }


    public ArrayList<Historia> getHistorias()
    {
        Collection<Historia> contenerdorHistorias= this.historias.values();
        ArrayList<Historia> listaHistorias =new ArrayList<>(contenerdorHistorias);
        return listaHistorias;
    }

    public boolean agregarHojaAHistoria(String tituloHistoria,Hoja nuevaHoja)
    {
        if(this.historias.containsKey(tituloHistoria))
        {
            return this.historias.get(tituloHistoria).agregarhoja(nuevaHoja);
        }
        else
        {
            System.out.println("el titulo seleccionado no se pudo encontrar , por favor  ingres eun nombre valido");
            return false;
        }
    }

    public void leerHistoria(String titulo)
    {

        Historia historia=this.historias.get(titulo);
        historia.leerHojas(1,"gordo");
    }

    public boolean existeHistoria(String titulo)
    {
        if(this.historias.containsKey(titulo))
        {
            return true;

        }
        else
        {
            System.out.println("la historia no existe");
            return false;
        }
    }


}
