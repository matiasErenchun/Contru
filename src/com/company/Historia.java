package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Historia
{
    private String titulo;
    private String autor;
    private String sinopsis;
    private String urlImagen=" ";
    private HashMap<Integer,Hoja> hojas;

    public Historia(String titulo, String autor, String sinopsis)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.sinopsis = sinopsis;
        this.hojas=new HashMap<>();
    }

    public String getTitulo()
    {
        return this.titulo;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public String getAutor()
    {
        return autor;
    }

    public void setAutor(String autor)
    {
        this.autor = autor;
    }

    public String getSinopsis()
    {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis)
    {
        this.sinopsis = sinopsis;
    }

    public String getUrlImagen()
    {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen)
    {
        this.urlImagen = urlImagen;
    }

    public boolean agregarhoja(Hoja hoja)
    {
        boolean b= this.hojas.containsKey(hoja.getNumero());
        if(b)
        {

            System.out.println("erro al agregar hoja, este numero ya existe ");
            return false;
        }
        else
        {
            this.hojas.putIfAbsent(hoja.getNumero(),hoja);
            System.out.println("hoja agregada exitosamente ");
            return true;
        }
    }

    @Override
    public String toString()
    {
        String string="Titulo: "+this.titulo+", Autor: "+this.autor+", Sinopsis: "+this.sinopsis;
        return string;
    }


}
