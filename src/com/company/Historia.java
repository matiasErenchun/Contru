package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Historia
{
    private String titulo;
    private String autor;
    private String sinopsis;
    private String urlImagen = " ";
    private HashMap<Integer, Nodo>nodos;
    private HashMap<Integer,Final>finales;
    private HashMap<Integer,Reinicio>renicios;

    public Historia(String titulo, String autor, String sinopsis)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.sinopsis = sinopsis;
        this.nodos = new HashMap<>();
        this.finales = new HashMap<>();
        this.renicios = new HashMap<>();
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

    public boolean hojaExiste(Integer numeroHoja)
    {
        if(this.renicios.containsKey(numeroHoja))
        {
            return true;
        }
        if(this.finales.containsKey(numeroHoja))
        {
            return true;
        }
        if(this.nodos.containsKey(numeroHoja))
        {
            return true;
        }

        return false;
    }

    public boolean agregarhoja(Hoja hoja)
    {
        boolean b = this.hojaExiste(hoja.getNumero());
        if (b) {

            System.out.println("erro al agregar hoja, este numero ya existe ");
            return false;
        }
        else
        {
            if(hoja.getClass().equals(Nodo.class))
            {
                Nodo nodo=(Nodo)hoja;
                this.nodos.put(hoja.getNumero(),nodo);
            }
            if(hoja.getClass().equals(Final.class))
            {
                Final fin=(Final) hoja;
                this.finales.put(hoja.getNumero(),fin);
            }
            if(hoja.getClass().equals(Reinicio.class))
            {
                Reinicio reinicio=(Reinicio) hoja;
                this.renicios.put(hoja.getNumero(),reinicio);
            }
            return false;
        }
    }


    @Override
    public String toString()
    {
        String string = "Titulo: " + this.titulo + ", Autor: " + this.autor + ", Sinopsis: " + this.sinopsis;
        return string;
    }

    public void leerHojas(Integer numeroHoja, String aventurero)
    {
        if(this.hojaExiste(numeroHoja))
        {
            boolean continuarLeyendo=true;
            while (continuarLeyendo)
            {
                if(!this.hojaExiste(numeroHoja))
                {
                    System.out.println(" la historia termino ");
                    continuarLeyendo=false;
                }
                else
                {
                    if(this.renicios.containsKey(numeroHoja))
                    {
                        Reinicio hojaActual=this.renicios.get(numeroHoja);
                        System.out.println(hojaActual.getContenidoModificadoConAventurero(aventurero));
                        System.out.println(" reinicio");
                        numeroHoja=1;
                    }
                    else
                    {
                        if (this.finales.containsKey(numeroHoja))
                        {
                            Final hojaActual=this.finales.get(numeroHoja);
                            System.out.println(hojaActual.getContenidoModificadoConAventurero(aventurero));
                            numeroHoja=-1;
                        }
                        else
                        {
                            Nodo hojaActual=this.nodos.get(numeroHoja);
                            System.out.println(hojaActual.getContenidoModificadoConAventurero(aventurero));
                            numeroHoja=hojaActual.mostrarElegirOpcion();
                        }
                    }
                }

            }
        }
    }





}
