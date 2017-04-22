/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_poo;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author albert luna
 */
public class Proyecto_POO 
{

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.io.FileNotFoundException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException 
    {   
        // TODO code application logic here
        System.out.println("Hola este es nuestro proyecto"
                + "\n\nIntegrantes: \n\nAlbert Manuel Luna (2-14-2039) \nChristopher Michael Guzman (2-14-0172)"
                + "\n\nCredenciales: \n\nUsuario: 'admin' \npassword: 'admin'");
        Login fb = new Login();
        fb.setVisible(true); 
    }   
}
