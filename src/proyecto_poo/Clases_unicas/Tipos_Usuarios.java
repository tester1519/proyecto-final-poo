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
public class Tipos_Usuarios extends Clase_base
{
    private int codigo_tipo_usuario;
    private String tipo_usuario;
    private String descripcion;
    private boolean estado;
    
    public Tipos_Usuarios()
    {}
    
    public Tipos_Usuarios(int codigo_tipo_usuario,String tipo_usuario,
                          String descripcion,boolean estado)
    {
        this.codigo_tipo_usuario = codigo_tipo_usuario;
        this.tipo_usuario = tipo_usuario;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getCodigo_tipo_usuario() 
    {
        return codigo_tipo_usuario;
    }

    public void setCodigo_tipo_usuario(int codigo_tipo_usuario) 
    {
        this.codigo_tipo_usuario = codigo_tipo_usuario;
    }

    public String getTipo_usuario() 
    {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) 
    {
        this.tipo_usuario = tipo_usuario;
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
