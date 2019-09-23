package com.company;

import java.util.ArrayList;

public class Sistema
{
    private Biblioteca biblioteca;
    private Lector lector;
    private Persistor persistor;

    public Sistema()
    {
        this.biblioteca = new Biblioteca();
        this.lector = new Lector();
        this.persistor = new Persistor();
    }

    public void crearAgregarHistoria()
    {
        String titulo = lector.leerTexto("ingrese el nombre de su historia");
        String autor = lector.leerTexto("ingrese el nombre del autor");
        String sinopsis = lector.leerTexto("ingrese la sinopsis");

        Historia historia = new Historia(titulo, autor, sinopsis);
        this.biblioteca.agregarHistoria(historia);
    }

    public void menu()
    {
        this.cargarDators(this.persistor.lectorGson());
        System.out.println(" ingrese 1 para crear una historia, 2 para ver las historias, " +
                "3 para agreagr una hoja a una historia, 4 para leer y 0 para salir");

        Integer opcion = this.lector.leerNumero("ingrese el numero de su opcion");
        while (opcion != 0)
        {
            if (opcion == 1)
            {
                this.crearAgregarHistoria();
            }
            if (opcion == 2)
            {
                this.biblioteca.mostrarHistorias();
            }
            if(opcion == 3)
            {
                this.agregar_Hoja_Nodo_a_Historia();
            }
            if(opcion==4)
            {
                this.leerHistoria();
            }
            System.out.println(" ingrese 1 para crear una historia, 2 para ver las historias, " +
                    "3 para agreagr una hoja a una historia, 4 para leer y 0 para salir");
            opcion = this.lector.leerNumero("ingrese el numero de su opcion");
        }
        this.persistor.escritorGson(this.biblioteca.getHistorias());
    }

    public void cargarDators(ArrayList<Historia> historias)
    {
        for (Historia historia : historias)
        {
            this.biblioteca.agregarHistoria(historia);
        }
    }

    public void agregar_Hoja_Nodo_a_Historia()
    {
        this.biblioteca.mostrarHistorias();
        String titulo=this.lector.leerTexto("ingrese el titulo de historia");
        Integer numeroHoja=this.lector.leerNumero("ingrese el nuemro de la hoja");
        String contenido=this.lector.leerTexto("ingrese el contenido de la hoja");
        Nodo hoja=new Nodo(numeroHoja,contenido);
        this.biblioteca.agregarHojaAHistoria(titulo,hoja);
    }

    public void leerHistoria()
    {
        this.biblioteca.mostrarHistorias();
        String titulo=this.lector.leerTexto("ingrese el titulo de la historia que quiere leer");
        if(this.biblioteca.existeHistoria(titulo))
        {
            this.biblioteca.leerHistoria(titulo);
        }
    }


}
