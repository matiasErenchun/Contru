package com.company;

import java.util.ArrayList;

public abstract class Hoja
{
    private Integer numero;
    private String contenido;
    private String opcion= " ";

    public Hoja(Integer numero, String contenido, String opcion)
    {
        this.numero = numero;
        this.contenido = contenido;
        this.opcion = opcion;
    }

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

    public String getOpcion()
    {
        return opcion;
    }

    public void setOpcion(String opcion)
    {
        this.opcion = opcion;
    }


    public String getContenidoModificadoConAventurero(String aventurero)
    {
        String salida=this.getContenido().replaceAll("/--/",aventurero);
        return salida;
    }

    public void printContenido(String contenido)
    {
        System.out.println(contenido);
    }
}
