/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_poo.Clases_unicas;

/**
 *
 * @author albert luna
 */
public class Telefonos extends Clase_base
{
    private int codigo_telefono;
    private int codigo_datos;
    private String telefono;
    private String descripcion;
    private boolean estado;
    
    public Telefonos()
    {}
    
    public Telefonos(int codigo_telefono,int cod_datos,String telefono,
                     String descripcion,boolean estado)
    {
        this.codigo_telefono = codigo_telefono;
        this.codigo_datos = cod_datos;
        this.telefono = telefono;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getCodigo_telefono() 
    {
        return codigo_telefono;
    }

    public void setCodigo_telefono(int codigo_telefono) 
    {
        this.codigo_telefono = codigo_telefono;
    }

    public int getCodigo_datos() 
    {
        return codigo_datos;
    }

    public void setCodigo_datos(int codigo_datos) 
    {
        this.codigo_datos = codigo_datos;
    }

    public String getTelefono() 
    {
        return telefono;
    }

    public void setTelefono(String telefono) 
    {
        this.telefono = telefono;
    }

    public String getDescripcion() 
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion) 
    {
        this.descripcion = descripcion;
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
