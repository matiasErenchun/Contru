package com.company;

import java.util.ArrayList;

public abstract class Hoja
{
    private Integer numero;
    private String contenido;
    private String urlImagen = " ";


    public Hoja(Integer numero, String contenido)
    {
        this.numero = numero;
        this.contenido = contenido;

    }


    public Integer getNumero()
    {
        return numero;
    }

    public void setNumero(Integer numero)
    {
        this.numero = numero;
    }

    public String getContenido()
    {
        return contenido;
    }

    public void setContenido(String contenido)
    {
        this.contenido = contenido;
    }


    public String getUrlImagen()
    {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen)
    {
        this.urlImagen = urlImagen;
    }

    public String getContenidoModificadoConAventurero(String aventurero)
    {
        String salida = this.getContenido().replaceAll("/--/", aventurero);
        return salida;
    }

    public void printContenido()
    {

        System.out.println(this.contenido);
    }

}
