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
public class Emails extends Clase_base
{
    private int codigo_email;
    private int codigo_datos;
    private String email;
    private String descripcion;
    private boolean estado;
    
    public Emails()
    {}
    
    public Emails(int codigo_email,int cod_datos,String email,
                     String descripcion,boolean estado)
    {
        this.codigo_email = codigo_email;
        this.codigo_datos = cod_datos;
        this.email = email;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getCodigo_email() 
    {
        return codigo_email;
    }

    public void setCodigo_email(int codigo_email) 
    {
        this.codigo_email = codigo_email;
    }

    public int getCodigo_datos() 
    {
        return codigo_datos;
    }

    public void setCodigo_datos(int codigo_datos) 
    {
        this.codigo_datos = codigo_datos;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setEmail(String email) 
    {
        this.email = email;
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