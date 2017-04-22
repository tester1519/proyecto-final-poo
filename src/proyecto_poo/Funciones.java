/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_poo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import proyecto_poo.Clases_unicas.Tickets;
import proyecto_poo.Clases_unicas.Usuarios;


/**
 *
 * @author albert luna
 */
public class Funciones 
{

    /**
     *
     */
    public static Usuarios usuario_general = new Usuarios();
    public static Tickets Ticket_general = new Tickets();
    
    
    public static int extraer_codigo(String cadena)
    {
        String codigo = "";
        
        for(int c=0;c<cadena.length();c++)
        {
            if(cadena.charAt(c) != ' ')
            {
                codigo = codigo + cadena.charAt(c);
            }
            else
            {
                break;
            }
        }
        return Integer.valueOf(codigo);
    }
    
    /**
     *
     * @param total_filas
     * @param codigo_viaje
     * @return
     * @throws java.lang.ClassNotFoundException
     * @throws java.io.FileNotFoundException
     */
    public static int[] generar_proximo_asiento(int total_filas,int codigo_viaje) throws IOException, FileNotFoundException, ClassNotFoundException
    {
        int v[] = new int[2];
        int total_columnas = 4;
        int ultima_fila;
        int ultima_columna;
        
        Archivo arc = new Archivo();
        ArrayList<Tickets> lista_tickets;
        ArrayList<Tickets> tickets_del_vaije = new ArrayList<>();
        lista_tickets = arc.leer_archivo("Tickets");
        
        for(Tickets elemento : lista_tickets)
        {
            if(codigo_viaje == elemento.getCodigo_viaje() && elemento.isEstado())
            {
                tickets_del_vaije.add(elemento);
            }
        }
        
        if(tickets_del_vaije.size() > 0)
        {
            ultima_fila = tickets_del_vaije.get(tickets_del_vaije.size() - 1).getFila();
            ultima_columna = tickets_del_vaije.get(tickets_del_vaije.size() - 1).getColumna();
        }
        else
        {
            v[0] = 1;
            v[1] = 1;
            return v;
        }
        
        if(ultima_columna < total_columnas)
        {
            ultima_columna++;
        }
        else if(ultima_columna == total_columnas && ultima_fila < total_filas)
        {
            ultima_fila++;
            ultima_columna = 1;
        }
                
        v[0] = ultima_fila;
        v[1] = ultima_columna;
        
        return v;
    }
    
    public static int generar_codigo_automatico(String nombre_archivo) throws IOException, FileNotFoundException, ClassNotFoundException
    {
        Archivo arc = new Archivo();
        ArrayList<Object> lista;
        lista = arc.leer_archivo(nombre_archivo);
        int codigo = (lista.size() + 1);
        return codigo;
    }
    
    
    static void solo_numeros(java.awt.event.KeyEvent evt, JTextField tb)
    {
        char c=evt.getKeyChar();
            
        if(Character.isLetter(c)) 
        {
            tb.getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(tb,"solo debe ingresar numeros");
        }
    }
}
