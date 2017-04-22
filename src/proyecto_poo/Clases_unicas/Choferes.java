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
public class Choferes extends Clase_base
{
    private int codigo_chofer;
    private int codigo_datos;
    private String categoria_licencia;
    private String descripcion;
    private boolean estado;
    
    public Choferes()
    {}
    
    public Choferes(int codigo_chofer,int codigo_datos,String cat_licencia,
                    String descripcion,boolean estado)
    {
        this.codigo_chofer = codigo_chofer;
        this.codigo_datos = codigo_datos;
        this.categoria_licencia = cat_licencia;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getCodigo_chofer() 
    {
        return codigo_chofer;
    }

    public void setCodigo_chofer(int codigo_chofer) 
    {
        this.codigo_chofer = codigo_chofer;
    }

    public int getCodigo_datos() 
    {
        return codigo_datos;
    }

    public void setCodigo_datos(int codigo_datos) 
    {
        this.codigo_datos = codigo_datos;
    }

    public String getCategoria_licencia() 
    {
        return categoria_licencia;
    }

    public void setCategoria_licencia(String categoria_licencia) 
    {
        this.categoria_licencia = categoria_licencia;
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
