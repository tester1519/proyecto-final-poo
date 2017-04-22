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
public class Viajes extends Clase_base
{
    private int codigo_viaje;
    private int codigo_ruta;
    private int codigo_autobus;
    private int codigo_chofer;
    private String hora_salida;
    private String hora_llegada;
    private String fecha;
    private float precio_ticket;
    private boolean estado;
    
    public Viajes()
    {}
    
    public Viajes(int codigo_viaje,int codigo_ruta,int codigo_autobus,
                int codigo_chofer,String hora_salida,String hora_llegada,
                String fecha,float precio_ticket,boolean estado)
    {
        this.codigo_viaje = codigo_viaje;
        this.codigo_ruta = codigo_ruta;
        this.codigo_autobus = codigo_autobus;
        this.codigo_chofer = codigo_chofer;
        this.hora_salida = hora_salida;
        this.hora_llegada = hora_llegada;
        this.fecha = fecha;
        this.precio_ticket = precio_ticket;
        this.estado = estado;
    }

    public int getCodigo_viaje() 
    {
        return codigo_viaje;
    }

    public void setCodigo_viaje(int codigo_viaje) 
    {
        this.codigo_viaje = codigo_viaje;
    }

    public int getCodigo_ruta() 
    {
        return codigo_ruta;
    }

    public void setCodigo_ruta(int codigo_ruta) 
    {
        this.codigo_ruta = codigo_ruta;
    }

    public int getCodigo_autobus() 
    {
        return codigo_autobus;
    }

    public void setCodigo_autobus(int codigo_autobus) 
    {
        this.codigo_autobus = codigo_autobus;
    }

    public int getCodigo_chofer() 
    {
        return codigo_chofer;
    }

    public void setCodigo_chofer(int codigo_chofer) 
    {
        this.codigo_chofer = codigo_chofer;
    }

    public String getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(String hora_salida) 
    {
        this.hora_salida = hora_salida;
    }

    public String getHora_llegada() 
    {
        return hora_llegada;
    }

    public void setHora_llegada(String hora_llegada) 
    {
        this.hora_llegada = hora_llegada;
    }

    public String getFecha() 
    {
        return fecha;
    }

    public void setFecha(String fecha) 
    {
        this.fecha = fecha;
    }

    public float getPrecio_ticket() 
    {
        return precio_ticket;
    }

    public void setPrecio_ticket(float precio_ticket) 
    {
        this.precio_ticket = precio_ticket;
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
