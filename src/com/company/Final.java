package com.company;

public class Final extends Hoja
{
    private String tipofinal;


    public Final(Integer numero, String contenido, String tfinal)
    {
        super(numero, contenido);
        this.tipofinal = tfinal;
    }


    public String getTipofinal()
    {
        return tipofinal;
    }

}
