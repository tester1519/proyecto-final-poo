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
public class Direcciones extends Clase_base
{
    private int codigo_direccion;
    private int codigo_datos;
    private String direccion;
    private String descripcion;
    private boolean estado;
    
    public Direcciones()
    {}
    
    public Direcciones(int codigo_direccion,int cod_datos,String direccion,
                     String descripcion,boolean estado)
    {
        this.codigo_direccion = codigo_direccion;
        this.codigo_datos = cod_datos;
        this.direccion = direccion;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getCodigo_direccion() 
    {
        return codigo_direccion;
    }

    public void setCodigo_direccion(int codigo_direccion) 
    {
        this.codigo_direccion = codigo_direccion;
    }

    public int getCodigo_datos() 
    {
        return codigo_datos;
    }

    public void setCodigo_datos(int codigo_datos) 
    {
        this.codigo_datos = codigo_datos;
    }

    public String getDireccion() 
    {
        return direccion;
    }

    public void setDireccion(String direccion) 
    {
        this.direccion = direccion;
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
