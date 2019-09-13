package com.company;

public class Main {

    public static void main(String[] args)
    {
        printHoja();
    }

    public static  void printHoja()
    {
        Hoja hoja=new Hoja(1,"hola soy  /--/ y tengo mucha hambre, /--/ vive en la luna");
        hoja.printContenido(hoja.getContenido());
        hoja.printContenido(hoja.getContenidoModificadoConAventurero("jose"));

    }
}
