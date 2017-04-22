/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_poo.Clases_unicas;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import proyecto_poo.Archivo;
import proyecto_poo.Funciones;


/**
 *
 * @author albert luna
 */
public class Usuarios extends Clase_base
{
    private int codigo_usuario;
    private int codigo_tipo_usuario;
    private int codigo_datos;
    private String nombre_usuario;
    private String clave;
    private boolean estado;

    public Usuarios()
    {}
    
    public Usuarios(int codigo_usuario,int codigo_tipo_usuario, int cod_datos,
                         String nombre_usuario,String clave,boolean estado)
    {
        this.codigo_usuario = codigo_usuario;
        this.codigo_tipo_usuario = codigo_tipo_usuario;
        this.codigo_datos = cod_datos;
        this.nombre_usuario = nombre_usuario;
        this.clave = clave;
        this.estado = estado;
    }
    
    public boolean ingresar_sistema(String nombre,String clave) throws IOException, FileNotFoundException, ClassNotFoundException
    {
        boolean entrada = false;
        
        ArrayList<Usuarios> lista = new ArrayList<>();
        Archivo arc = new Archivo();
        lista = arc.leer_archivo("Usuarios");
        
        for(Usuarios elemento : lista)
        {
            if(nombre.equals(elemento.getNombre_usuario()) && 
                clave.equals(elemento.getClave()) && 
                elemento.isEstado() == true)
            {
                entrada = true;
                Funciones.usuario_general = elemento;
            }
        }
        
        return entrada;
    }

    public int getCodigo_usuario() 
    {
        return codigo_usuario;
    }

    public void setCodigo_usuario(int codigo_usuario) 
    {
        this.codigo_usuario = codigo_usuario;
    }

    public int getCodigo_tipo_usuario() 
    {
        return codigo_tipo_usuario;
    }

    public void setCodigo_tipo_usuario(int codigo_tipo_usuario) 
    {
        this.codigo_tipo_usuario = codigo_tipo_usuario;
    }

    public int getCodigo_datos() 
    {
        return codigo_datos;
    }

    public void setCodigo_datos(int codigo_datos) 
    {
        this.codigo_datos = codigo_datos;
    }

    public String getNombre_usuario() 
    {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) 
    {
        this.nombre_usuario = nombre_usuario;
    }

    public String getClave() 
    {
        return clave;
    }

    public void setClave(String clave) 
    {
        this.clave = clave;
    }

    public boolean isEstado() 
    {
        return estado;
    }

    public void setEstado(boolean estado) 
    {
        this.estado = estado;
    }    
}
