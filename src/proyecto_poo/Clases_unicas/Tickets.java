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
public class Tickets extends Clase_base
{
    private int codigo_ticket;
    private int codigo_viaje;
    private int codigo_usuario;
    private int fila;
    private int columna;
    private String fecha;
    private String hora;
    private boolean estado;
    
    public Tickets()
    {}
    
    public Tickets(int codigo_ticket,int codigo_viaje,int codigo_usuario,
                int fila,int columna,String fecha,String hora,boolean estado)
    {
        this.codigo_ticket = codigo_ticket;
        this.codigo_viaje = codigo_viaje;
        this.codigo_usuario = codigo_usuario;
        this.fila = fila;
        this.columna = columna;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
    }

    public int getCodigo_ticket() 
    {
        return codigo_ticket;
    }

    public void setCodigo_ticket(int codigo_ticket) 
    {
        this.codigo_ticket = codigo_ticket;
    }

    public int getCodigo_viaje() 
    {
        return codigo_viaje;
    }

    public void setCodigo_viaje(int codigo_viaje) 
    {
        this.codigo_viaje = codigo_viaje;
    }

    public int getCodigo_usuario() 
    {
        return codigo_usuario;
    }

    public void setCodigo_usuario(int codigo_usuario) 
    {
        this.codigo_usuario = codigo_usuario;
    }

    public int getFila() 
    {
        return fila;
    }

    public void setFila(int fila) 
    {
        this.fila = fila;
    }

    public int getColumna() 
    {
        return columna;
    }

    public void setColumna(int columna) 
    {
        this.columna = columna;
    }

    public String getFecha() 
    {
        return fecha;
    }

    public void setFecha(String fecha) 
    {
        this.fecha = fecha;
    }

    public String getHora() 
    {
        return hora;
    }

    public void setHora(String hora) 
    {
        this.hora = hora;
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
