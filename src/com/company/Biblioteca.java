package com.company;

import java.util.ArrayList;

public class Biblioteca
{
    private ArrayList<Historia>historias;

    public Biblioteca()
    {
        this.historias = new ArrayList<>();
    }

    public boolean agregarHistoria(Historia historia)
    {
        return this.historias.add(historia);
    }

    public void mostrarHistorias()
    {
        for (Historia historia:this.historias)
        {
            System.out.println(historia.toString());
        }
    }

    public ArrayList<Historia> getHistorias()
    {
        return this.historias;
    }



}
