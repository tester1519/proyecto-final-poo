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
public class Rutas extends Clase_base
{
    private int codigo_ruta;
    private String lugar_salida;
    private String lugar_llegada;
    private float distancia;
    private boolean estado;

    /**
     *
     */
    public Rutas()
    {}
    
    public Rutas(int codigo_ruta,String lugar_salida,String lugar_llegada,
               float distancia,boolean estado)
    {
        this.codigo_ruta = codigo_ruta;
        this.lugar_salida = lugar_salida;
        this.lugar_llegada = lugar_llegada;
        this.distancia = distancia;
        this.estado = estado;
    }
    
    public int getCodigo_ruta() 
    {
        return codigo_ruta;
    }

    public void setCodigo_ruta(int codigo_ruta) 
    {
        this.codigo_ruta = codigo_ruta;
    }

    public String getLugar_salida() 
    {
        return lugar_salida;
    }

    public void setLugar_salida(String lugar_salida) 
    {
        this.lugar_salida = lugar_salida;
    }

    public String getLugar_llegada() 
    {
        return lugar_llegada;
    }

    public void setLugar_llegada(String lugar_llegada) 
    {
        this.lugar_llegada = lugar_llegada;
    }

    public float getDistancia() 
    {
        return distancia;
    }

    public void setDistancia(float distancia) 
    {
        this.distancia = distancia;
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
