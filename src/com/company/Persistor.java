package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Persistor
{

    public void escritorGson(ArrayList algo)
    {
        Gson gson= new GsonBuilder().setPrettyPrinting().create();
        String jSon =gson.toJson(algo);
        System.out.println(jSon);
        FileWriter fichero = null;
        PrintWriter escritor = null;
        try
        {
            fichero = new FileWriter("src/respaldo/respaldo.txt");
            escritor = new PrintWriter(fichero);

            escritor.println(jSon);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                // Nuevamente aprovechamos el finally para
                // asegurarnos que se cierra el fichero.
                if (null != fichero)
                    fichero.close();
            }
            catch (Exception e2)
            {
                e2.printStackTrace();
            }
        }

    }

    public ArrayList lectorGson()
    {
        File archivo = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String sFinal = "";

        try
        {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File("src/respaldo/respaldo.txt");
            fileReader = new FileReader(archivo);
            bufferedReader = new BufferedReader(fileReader);

            // Lectura del fichero
            String linea;
            while ((linea = bufferedReader.readLine()) != null)
                sFinal = sFinal + linea;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta
            // una excepcion.
            try
            {
                if (null != fileReader)
                {
                    fileReader.close();
                }
            }
            catch (Exception e2)
            {
                e2.printStackTrace();
            }
        }
        System.out.println(sFinal);
        Gson gson = new Gson();
        Type tipoHistoria= new TypeToken<List<Historia>>(){}.getType();
        Collection<Historia> historias = gson.fromJson(sFinal, tipoHistoria);
        ArrayList<Historia> misHistorias = new ArrayList<>(historias);
        return misHistorias;
    }

}
