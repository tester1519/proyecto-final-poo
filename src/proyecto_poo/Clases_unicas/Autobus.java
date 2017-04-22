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
public class Autobus extends Clase_base
{
    private int codigo_autobus;
    private String placa;
    private String matricula;
    private String modelo;
    private float millage;
    private String color;
    private int cant_filas;
    private String des_estado;
    private boolean estado;
    
    public Autobus()
    {}
    
    public Autobus(int codigo_autobus,String placa,String matricula,
                   String modelo,float millage,String color,int cant_filas,
                   String des_estado,boolean estado)
    {
        this.codigo_autobus = codigo_autobus;
        this.placa = placa;
        this.matricula = matricula;
        this.modelo = modelo;
        this.millage = millage;
        this.color = color;
        this.cant_filas = cant_filas;
        this.des_estado = des_estado;
        this.estado = estado;
    }

    public int getCodigo_autobus() 
    {
        return codigo_autobus;
    }

    public void setCodigo_autobus(int codigo_autobus) 
    {
        this.codigo_autobus = codigo_autobus;
    }

    public String getPlaca() 
    {
        return placa;
    }

    public void setPlaca(String placa) 
    {
        this.placa = placa;
    }

    public String getMatricula() 
    {
        return matricula;
    }

    public void setMatricula(String matricula) 
    {
        this.matricula = matricula;
    }

    public String getModelo() 
    {
        return modelo;
    }

    public void setModelo(String modelo) 
    {
        this.modelo = modelo;
    }

    public float getMillage() 
    {
        return millage;
    }

    public void setMillage(float millage) 
    {
        this.millage = millage;
    }

    public String getColor() 
    {
        return color;
    }

    public void setColor(String color) 
    {
        this.color = color;
    }

    public int getCant_filas() 
    {
        return cant_filas;
    }

    public void setCant_filas(int cant_filas) 
    {
        this.cant_filas = cant_filas;
    }

    public String getDes_estado() 
    {
        return des_estado;
    }

    public void setDes_estado(String des_estado) 
    {
        this.des_estado = des_estado;
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
