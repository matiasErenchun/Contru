package com.company;

import java.util.Scanner;

public class Lector
{
    private Scanner scanner;

    public Lector()
    {
        this.scanner = new Scanner(System.in);
    }

    public String leerTexto(String mensaje)
    {
        System.out.println(mensaje);
        String texto = scanner.nextLine();
        while (!texto.matches("^[0-9A-Za-z.,\\?\\¿() ¡!;]*$"))
        {
            System.out.println("errores de formato en su texto por favor ingrese solo los sifuentes carascteres 0-9 A-Za-z.,?¿() ¡!;");
            System.out.println(mensaje);
            texto = scanner.nextLine();
        }

        return texto;
    }

    public Integer leerNumero(String mensaje)
    {
        System.out.println(mensaje);
        String texto = scanner.nextLine();
        while (!texto.matches("^[0-9]*$"))
        {
            System.out.println("errores de formato en su texto por favor ingrese solo numeros sin otro tipo de caracter");
            System.out.println(mensaje);
            texto = scanner.nextLine();
        }
        Integer numero = Integer.parseInt(texto);
        return numero;
    }
}
