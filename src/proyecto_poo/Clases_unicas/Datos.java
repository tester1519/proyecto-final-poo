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
public class Datos extends Clase_base 
{
    private int codigo_datos;
    private String nombre;
    private String fecha_nacimiento;
    private String fecha_inicio;
    private boolean estado;
    
    public Datos()
    {}
    
    public Datos(int codigo_datos,String nombre,String fecha_nacimiento,
                 String fecha_inicio,boolean estado)
    {
        this.codigo_datos = codigo_datos;
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.fecha_inicio = fecha_inicio;
        this.estado = estado;
    }

    public int getCodigo_datos() 
    {
        return codigo_datos;
    }

    public void setCodigo_datos(int codigo_datos) 
    {
        this.codigo_datos = codigo_datos;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getFecha_nacimiento() 
    {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) 
    {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getFecha_inicio() 
    {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) 
    {
        this.fecha_inicio = fecha_inicio;
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
