/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_poo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyecto_poo.Clases_unicas.Autobus;
import proyecto_poo.Clases_unicas.Choferes;
import proyecto_poo.Clases_unicas.Datos;
import proyecto_poo.Clases_unicas.Rutas;
import proyecto_poo.Clases_unicas.Viajes;

/**
 *
 * @author albert luna
 */
public class Mantenimiento_viajes extends javax.swing.JFrame {

    /**
     * Creates new form Mantenimiento_viajes
     * @throws java.io.IOException
     * @throws java.io.FileNotFoundException
     * @throws java.lang.ClassNotFoundException
     */
    public Mantenimiento_viajes() throws IOException, FileNotFoundException, ClassNotFoundException {
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.tb_codigo_viaje.setEditable(false);
        
        llenar_cb_viajes();
        llenar_cb_rutas();
        llenar_cb_autobus();
        llenar_cb_chofer();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_autobus = new javax.swing.JLabel();
        lb_chofer = new javax.swing.JLabel();
        lb_fecha = new javax.swing.JLabel();
        lb_codigo_viaje = new javax.swing.JLabel();
        lb_viajes = new javax.swing.JLabel();
        lb_hora_llegada = new javax.swing.JLabel();
        lb_precio_ticket = new javax.swing.JLabel();
        lb_rutas = new javax.swing.JLabel();
        cb_estado = new javax.swing.JCheckBox();
        cb_viajes = new javax.swing.JComboBox<>();
        cb_autobus = new javax.swing.JComboBox<>();
        cb_chofer = new javax.swing.JComboBox<>();
        bt_salir = new javax.swing.JButton();
        bt_guardar = new javax.swing.JButton();
        bt_nuevo = new javax.swing.JButton();
        bt_activar = new javax.swing.JButton();
        bt_desactivar = new javax.swing.JButton();
        lb_hora_salida = new javax.swing.JLabel();
        cb_rutas = new javax.swing.JComboBox<>();
        bt_elegir = new javax.swing.JButton();
        tb_fecha = new javax.swing.JTextField();
        tb_codigo_viaje = new javax.swing.JTextField();
        tb_hora_salida = new javax.swing.JTextField();
        tb_hora_llegada = new javax.swing.JTextField();
        tb_precio_ticket = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        lb_autobus.setText("Autobus");

        lb_chofer.setText("Chofer");

        lb_fecha.setText("Fecha");

        lb_codigo_viaje.setText("Codigo del viaje");

        lb_viajes.setText("Viajes");

        lb_hora_llegada.setText("Hora de llegada");

        lb_precio_ticket.setText("Precio del ticket");

        lb_rutas.setText("Rutas");

        cb_estado.setText("Estado");

        bt_salir.setText("Salir");
        bt_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_salirActionPerformed(evt);
            }
        });

        bt_guardar.setText("Guardar");
        bt_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_guardarActionPerformed(evt);
            }
        });

        bt_nuevo.setText("Nuevo");
        bt_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_nuevoActionPerformed(evt);
            }
        });

        bt_activar.setText("Activar");
        bt_activar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_activarActionPerformed(evt);
            }
        });

        bt_desactivar.setText("Desactivar");
        bt_desactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_desactivarActionPerformed(evt);
            }
        });

        lb_hora_salida.setText("Hora de salida");

        bt_elegir.setText("Elegir");
        bt_elegir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_elegirActionPerformed(evt);
            }
        });

        tb_precio_ticket.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tb_precio_ticketKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(lb_viajes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cb_viajes, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt_elegir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(670, 670, 670)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bt_desactivar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(lb_hora_salida))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cb_rutas, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(cb_autobus, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(cb_chofer, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(tb_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(lb_hora_llegada)
                                .addGap(85, 85, 85)
                                .addComponent(lb_precio_ticket)))))
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cb_estado)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(52, 52, 52)
                            .addComponent(lb_rutas)
                            .addGap(122, 122, 122)
                            .addComponent(lb_autobus)
                            .addGap(128, 128, 128)
                            .addComponent(lb_chofer)
                            .addGap(117, 117, 117)
                            .addComponent(lb_fecha))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lb_codigo_viaje)
                                .addComponent(tb_codigo_viaje, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(45, 45, 45)
                            .addComponent(tb_hora_salida, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(tb_hora_llegada, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(tb_precio_ticket, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bt_guardar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(bt_nuevo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_activar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_guardar)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_rutas)
                            .addComponent(lb_autobus)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lb_fecha)
                                .addComponent(lb_chofer)))))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cb_autobus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cb_rutas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cb_chofer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tb_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(bt_nuevo)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_hora_llegada)
                    .addComponent(lb_precio_ticket)
                    .addComponent(lb_hora_salida)
                    .addComponent(lb_codigo_viaje))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tb_hora_salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tb_codigo_viaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tb_hora_llegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tb_precio_ticket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_activar))
                .addGap(47, 47, 47)
                .addComponent(bt_desactivar)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cb_viajes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bt_elegir)
                        .addComponent(lb_viajes))
                    .addComponent(cb_estado))
                .addGap(17, 17, 17)
                .addComponent(bt_salir)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_salirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_bt_salirActionPerformed

    private void bt_activarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_activarActionPerformed
        if("".equals(this.tb_codigo_viaje.getText()))
        {
            JOptionPane.showMessageDialog(this,"Debe seleccionar un viaje para poder activarlo");
            return;
        }
        
        Archivo arc = new Archivo();
        try {
            int codigo = Integer.valueOf(tb_codigo_viaje.getText());
            Viajes v = (Viajes) arc.buscar_archivo("Viajes",codigo);
            v.setEstado(true);
            arc.actualizar_archivo("Viajes", v , codigo);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Mantenimiento_rutas.class.getName()).log(Level.SEVERE, null, ex);
        }
        bt_nuevo.doClick();
    }//GEN-LAST:event_bt_activarActionPerformed

    private void bt_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_nuevoActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            llenar_cb_rutas();
            llenar_cb_autobus();
            llenar_cb_chofer();
            llenar_cb_viajes();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Mantenimiento_viajes.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.tb_codigo_viaje.setText("");
        this.tb_fecha.setText("");
        this.tb_hora_salida.setText("");
        this.tb_hora_llegada.setText("");
        this.tb_precio_ticket.setText("");
        this.cb_estado.setSelected(false);
    }//GEN-LAST:event_bt_nuevoActionPerformed

    private void bt_elegirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_elegirActionPerformed
        // TODO add your handling code here:
        Archivo arc = new Archivo();
        int codigo_viaje = Funciones.extraer_codigo(cb_viajes.getSelectedItem().toString());
        try 
        {
            Viajes v = (Viajes) arc.buscar_archivo("Viajes", codigo_viaje);
            Rutas r = (Rutas) arc.buscar_archivo("Rutas",v.getCodigo_ruta());
            Autobus a = (Autobus) arc.buscar_archivo("Autobus",v.getCodigo_autobus());
            Choferes c = (Choferes) arc.buscar_archivo("Choferes",v.getCodigo_chofer());
            Datos d = (Datos) arc.buscar_archivo("Datos",c.getCodigo_datos());
            String cadena;
            
            cadena = v.getCodigo_ruta() + " " + r.getLugar_llegada();
            this.cb_rutas.setSelectedItem(cadena);
            
            cadena = v.getCodigo_autobus() + " " + a.getPlaca();
            this.cb_autobus.setSelectedItem(cadena);
            
            cadena = v.getCodigo_chofer() + " " + d.getNombre();
            this.cb_chofer.setSelectedItem(cadena);
            
            this.tb_codigo_viaje.setText(Integer.toString(v.getCodigo_viaje()));
            this.tb_fecha.setText(v.getFecha());
            this.tb_hora_salida.setText(v.getHora_salida());
            this.tb_hora_llegada.setText(v.getHora_llegada());
            this.tb_precio_ticket.setText(Float.toString(v.getPrecio_ticket()));
            this.cb_estado.setSelected(v.isEstado());
        } 
        catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Mantenimiento_rutas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bt_elegirActionPerformed

    private void bt_desactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_desactivarActionPerformed
        // TODO add your handling code here:
        if("".equals(this.tb_codigo_viaje.getText()))
        {
            JOptionPane.showMessageDialog(this,"Debe seleccionar un viaje para poder activarlo");
            return;
        }
        
        Archivo arc = new Archivo();
        try {
            int codigo = Integer.valueOf(tb_codigo_viaje.getText());
            Viajes v = (Viajes) arc.buscar_archivo("Viajes",codigo);
            v.setEstado(false);
            arc.actualizar_archivo("Viajes", v , codigo);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Mantenimiento_rutas.class.getName()).log(Level.SEVERE, null, ex);
        }
        bt_nuevo.doClick();
    }//GEN-LAST:event_bt_desactivarActionPerformed

    private void bt_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_guardarActionPerformed
        // TODO add your handling code here:
        if(!validar())
        {
            JOptionPane.showMessageDialog(this,"Debe llenar todos los campos");
            return;
        }
        
        if("".equals(tb_codigo_viaje.getText()))
        {
            Viajes v;
            try {
                tb_codigo_viaje.setText(Integer.toString(Funciones.generar_codigo_automatico("Viajes")));
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(Mantenimiento_rutas.class.getName()).log(Level.SEVERE, null, ex);
            }
            v = recoger_datos();
            Archivo arc = new Archivo();
            arc.insertar_archivo("Viajes", v);
            bt_nuevo.doClick();
        }
        else
        {
            Viajes v = recoger_datos();
            Archivo arc = new Archivo();
            try {
                arc.actualizar_archivo("Viajes",v,v.getCodigo_viaje());
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(Mantenimiento_rutas.class.getName()).log(Level.SEVERE, null, ex);
            }
            bt_nuevo.doClick();
        }
    }//GEN-LAST:event_bt_guardarActionPerformed

    private void tb_precio_ticketKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb_precio_ticketKeyTyped
        // TODO add your handling code here:
            Funciones.solo_numeros(evt, tb_precio_ticket);
    }//GEN-LAST:event_tb_precio_ticketKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mantenimiento_viajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mantenimiento_viajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mantenimiento_viajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mantenimiento_viajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Mantenimiento_viajes().setVisible(true);
                } catch (IOException | ClassNotFoundException ex) {
                    Logger.getLogger(Mantenimiento_viajes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    public boolean validar()
    {
        if("".equals(this.tb_fecha.getText()) || "".equals(this.tb_hora_salida.getText()) || "".equals(this.tb_hora_llegada.getText())
            || "".equals(this.tb_precio_ticket.getText()) || this.cb_rutas.getSelectedItem() == "" || this.cb_autobus.getSelectedItem() == ""
            || this.cb_chofer.getSelectedItem() == "")
        {
            return false;
        }
        return true;
    }
    
    public void llenar_cb_viajes() throws IOException, FileNotFoundException, ClassNotFoundException
    {
        cb_viajes.removeAllItems();
        Archivo arc = new Archivo();
        ArrayList<Viajes> lista;
        lista = arc.leer_archivo("Viajes");
        Rutas r;
        String cadena;
        
        for(Viajes elemento : lista)
        {
            r = (Rutas) arc.buscar_archivo("Rutas",elemento.getCodigo_ruta());
            cadena = elemento.getCodigo_viaje() + " " + elemento.getHora_salida() + " " + r.getCodigo_ruta() + " " + r.getLugar_llegada();
            this.cb_viajes.addItem(cadena);
        }
    }
    
    public void llenar_cb_rutas() throws IOException, FileNotFoundException, ClassNotFoundException
    {
        cb_rutas.removeAllItems();
        Archivo arc = new Archivo();
        ArrayList<Rutas> lista;
        lista = arc.leer_archivo("Rutas");
        String cadena;
        
        for(Rutas elemento : lista)
        {
            if(elemento.isEstado())
            {
                cadena = elemento.getCodigo_ruta() + " " + elemento.getLugar_llegada();
                this.cb_rutas.addItem(cadena);
            }
        }
    }
    
    public void llenar_cb_autobus() throws IOException, FileNotFoundException, ClassNotFoundException
    {
        cb_autobus.removeAllItems();
        Archivo arc = new Archivo();
        ArrayList<Autobus> lista;
        lista = arc.leer_archivo("Autobus");
        String cadena;
        
        for(Autobus elemento : lista)
        {
            if(elemento.isEstado())
            {
                cadena = elemento.getCodigo_autobus() + " " + elemento.getPlaca();
                this.cb_autobus.addItem(cadena);
            }
        }
    }
    
    public void llenar_cb_chofer() throws IOException, FileNotFoundException, ClassNotFoundException
    {
        cb_chofer.removeAllItems();
        Archivo arc = new Archivo();
        ArrayList<Choferes> lista;
        lista = arc.leer_archivo("Choferes");
        Datos d;
        String cadena;
        
        for(Choferes elemento : lista)
        {
            if(elemento.isEstado())
            {
                d = (Datos) arc.buscar_archivo("Datos",elemento.getCodigo_datos());
                cadena = elemento.getCodigo_chofer() + " " + d.getNombre();
                this.cb_chofer.addItem(cadena);
            }
        }
    }
    
    public Viajes recoger_datos()
    {
        Viajes v = new Viajes();
        
        v.setCodigo_viaje(Integer.valueOf(this.tb_codigo_viaje.getText()));
        v.setCodigo_ruta(Funciones.extraer_codigo(this.cb_rutas.getSelectedItem().toString()));
        v.setCodigo_autobus(Funciones.extraer_codigo(this.cb_autobus.getSelectedItem().toString()));
        v.setCodigo_chofer(Funciones.extraer_codigo(this.cb_chofer.getSelectedItem().toString()));
        v.setFecha(this.tb_fecha.getText());
        v.setHora_salida(this.tb_hora_salida.getText());
        v.setHora_llegada(this.tb_hora_llegada.getText());
        v.setPrecio_ticket(Float.valueOf(this.tb_precio_ticket.getText()));
        v.setEstado(this.cb_estado.isSelected());
        
        return v;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_activar;
    private javax.swing.JButton bt_desactivar;
    private javax.swing.JButton bt_elegir;
    private javax.swing.JButton bt_guardar;
    private javax.swing.JButton bt_nuevo;
    private javax.swing.JButton bt_salir;
    private javax.swing.JComboBox<String> cb_autobus;
    private javax.swing.JComboBox<String> cb_chofer;
    private javax.swing.JCheckBox cb_estado;
    private javax.swing.JComboBox<String> cb_rutas;
    private javax.swing.JComboBox<String> cb_viajes;
    private javax.swing.JLabel lb_autobus;
    private javax.swing.JLabel lb_chofer;
    private javax.swing.JLabel lb_codigo_viaje;
    private javax.swing.JLabel lb_fecha;
    private javax.swing.JLabel lb_hora_llegada;
    private javax.swing.JLabel lb_hora_salida;
    private javax.swing.JLabel lb_precio_ticket;
    private javax.swing.JLabel lb_rutas;
    private javax.swing.JLabel lb_viajes;
    private javax.swing.JTextField tb_codigo_viaje;
    private javax.swing.JTextField tb_fecha;
    private javax.swing.JTextField tb_hora_llegada;
    private javax.swing.JTextField tb_hora_salida;
    private javax.swing.JTextField tb_precio_ticket;
    // End of variables declaration//GEN-END:variables
}
