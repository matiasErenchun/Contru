package com.company;

import java.util.ArrayList;

public class Historia
{
    private String nombre;
    private String autor;
    private String sinopsis;
    private String urlImagen;
    private ArrayList<Hoja>hojas;

    public Historia(String nombre, String autor, String sinopsis, String urlImagen)
    {
        this.nombre = nombre;
        this.autor = autor;
        this.sinopsis = sinopsis;
        this.urlImagen = urlImagen;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
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
}
