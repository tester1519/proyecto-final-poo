/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_poo;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
/**
 *
 * @author albert luna
 */
public class Archivo 
{   
    //crear el archivo en la carpeta de archivos.
    public void crear_archivo(String nombre)
    {
        File arc = new File("Archivos//" + nombre + ".txt");
        if(!arc.exists())
        {
            try
            {
                arc.createNewFile();
            }
            catch(IOException ex)
            {
                System.err.print(ex.getMessage());
            }
        }
    }
    
    public void borrar_archivo(String nombre)
    {
        File arc = new File("Archivos//" + nombre + ".txt");
        if(arc.exists())
            arc.delete();
    }
    
    //se escribe en el archivo sin borrar lo existente de este.
    /**
     *
     * @param nombre nombre del archivo
     * @param obj objeto a insertar en el archivo
     */
    public void insertar_archivo(String nombre,Object obj)
    {
         try
         {
            File arc = new File("Archivos//" + nombre + ".txt");
            if(!arc.exists())
            {
                crear_archivo(nombre);
            }
            FileOutputStream fos = new FileOutputStream(arc,true);
             try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                 oos.writeObject(obj);
             }
         }
         catch(IOException ex)
         {
            System.err.print(ex.getMessage());
         }
    }
    
    //devuelve una lista con todos los objetos almacenados en el archivo.
    /**
     *
     * @param nombre nombre del archivo
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public ArrayList leer_archivo(String nombre) throws FileNotFoundException, IOException, ClassNotFoundException
    {
        ArrayList<Object> lista;
        lista = new ArrayList();
        
        try
        {
            File arc = new File("Archivos//" + nombre + ".txt");
            if(!arc.exists())
            {
                crear_archivo(nombre);
            }
        
            try (FileInputStream fis = new FileInputStream(arc)) {
                while(fis.available() > 0)
                {
                    ObjectInputStream ois = new ObjectInputStream(fis);
                    lista.add(ois.readObject());
                }
            }
        }
        catch(IOException ex)
        {
            System.err.print(ex.getMessage());
        }
        return lista;
    }
    
    
    //busca y devuelve un objeto de entre la lista de objetos de un archivo.
    public Object buscar_archivo(String nombre,int codigo) throws IOException, FileNotFoundException, ClassNotFoundException
    {
        File f = new File("Archivos//" + nombre + ".txt");
        if(!f.exists())
        {
            crear_archivo(nombre);
            return null;
        }
        
        Object resultado;
        
        ArrayList<Object> lista = leer_archivo(nombre);
        if((codigo-1) > lista.size())
        {
            System.out.println("La busqueda no se encontro");
            return null;
        }
        resultado = lista.get(codigo-1);
        return resultado;
    }
    
    //cambia el valor de uno de los objetos dentro de un archivo(replica y borra el pasado archivo para sustituirlo).
    public boolean actualizar_archivo(String nombre,Object obj,int codigo) throws IOException, FileNotFoundException, ClassNotFoundException
    {
        Object obj2 = buscar_archivo(nombre,codigo);
        if(obj2 == null)
        {
            System.out.println("Este objeto no se puede actualizar porque no fue encontrado");
            return false;
        }
        else
        {
            ArrayList<Object> lista ;
            lista =(ArrayList<Object>) leer_archivo(nombre);
            lista.set((codigo-1),obj);
            borrar_archivo(nombre);
            crear_archivo(nombre);
            for(Object c : lista)
            {
                insertar_archivo(nombre,c);
            }
            return true;
        }
    }
}
