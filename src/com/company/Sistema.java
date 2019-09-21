package com.company;

public class Sistema
{
    private Biblioteca biblioteca;
    private Lector lector;

    public Sistema()
    {
        this.biblioteca =new Biblioteca();
        this.lector=new Lector();
    }

    public void crearAgregarHistoria()
    {
        String titulo=lector.leerTexto("ingrese el nombre de su historia");
        String autor=lector.leerTexto("ingrese el nombre del autor");
        String sinopsis=lector.leerTexto("ingrese la sinopsis");

        Historia historia=new Historia(titulo,autor,sinopsis);
        this.biblioteca.agregarHistoria(historia);
    }

    public void menu()
    {
        System.out.println(" ingrese 1 para crear una historia, 2 para verlas y 0 para salir");
        Integer opcion=this.lector.leerNumero("ingrese el numero de su opcion");
        while(opcion!=0)
        {
            if (opcion==1)
            {
                this.crearAgregarHistoria();
            }
            if(opcion==2)
            {
                this.biblioteca.mostrarHistorias();
            }
            System.out.println(" ingrese 1 para crear una historia, 2 para verlas y 0 para salir");
            opcion=this.lector.leerNumero("ingrese el numero de su opcion");
        }
    }


}
