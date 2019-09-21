package com.company;

public class Opcion
{
    private String opcion;
    private Integer numeroHojaDestino;

    public Opcion(String opcion, Integer numeroHojaDestino) {
        this.opcion = opcion;
        this.numeroHojaDestino = numeroHojaDestino;
    }

    public String getOpcion()
    {
        return opcion;
    }

    public void setOpcion(String opcion)
    {
        this.opcion = opcion;
    }

    public Integer getNumeroHojaDestino()
    {
        return numeroHojaDestino;
    }

    public void setNumeroHojaDestino(Integer numeroHojaDestino)
    {
        this.numeroHojaDestino = numeroHojaDestino;
    }
}
