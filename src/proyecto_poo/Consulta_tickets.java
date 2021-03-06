/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_poo;

import java.awt.event.ItemEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyecto_poo.Clases_unicas.Autobus;
import proyecto_poo.Clases_unicas.Rutas;
import proyecto_poo.Clases_unicas.Tickets;
import proyecto_poo.Clases_unicas.Viajes;

/**
 *
 * @author albert luna
 */
public class Consulta_tickets extends javax.swing.JFrame {

    /**
     * Creates new form Consulta_tickets
     */
    public Consulta_tickets() throws IOException, FileNotFoundException, ClassNotFoundException {
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.tb_cant_asientos_vendidos.setEditable(false);
        this.tb_cant_asientos_libres.setEditable(false);
        this.tb_precio_asiento.setEditable(false);
        this.tb_total.setEditable(false);
        
        llenar_cb_rutas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cb_viajes = new javax.swing.JComboBox<>();
        tb_precio_asiento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tb_cant_asientos_vendidos = new javax.swing.JTextField();
        bt_salir = new javax.swing.JButton();
        tb_total = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tb_cant_asientos_libres = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cb_rutas = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setText("Precio del asiento");

        cb_viajes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_viajesItemStateChanged(evt);
            }
        });

        jLabel2.setText("Cantidad asientos vendidos");

        jLabel3.setText("Viajes");

        bt_salir.setText("Salir");
        bt_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_salirActionPerformed(evt);
            }
        });

        jLabel4.setText("Total de ingresos del viaje");

        jLabel5.setText("Cantidad de asientos libres");

        jLabel6.setText("Rutas");

        cb_rutas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_rutasItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(tb_cant_asientos_vendidos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5)
                        .addGap(21, 21, 21)
                        .addComponent(tb_cant_asientos_libres, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1)
                        .addGap(36, 36, 36)
                        .addComponent(tb_precio_asiento, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4)
                        .addGap(15, 15, 15)
                        .addComponent(tb_total, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(bt_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(cb_rutas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(17, 17, 17)
                                .addComponent(cb_viajes, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cb_rutas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cb_viajes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(tb_cant_asientos_vendidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(tb_cant_asientos_libres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(tb_precio_asiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(tb_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(bt_salir)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_salirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_bt_salirActionPerformed

    private void cb_rutasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_rutasItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange() == ItemEvent.SELECTED)
        {   
            int codigo_ruta;
            codigo_ruta = Funciones.extraer_codigo((String) cb_rutas.getSelectedItem());
        
            try {
                llenar_cb_viajes(codigo_ruta);
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(Venta_tickets.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_cb_rutasItemStateChanged

    private void cb_viajesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_viajesItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange() == ItemEvent.SELECTED)
        {
            try {
                // TODO add your handling code here:
                int codigo_viaje;
                codigo_viaje = Funciones.extraer_codigo((String) cb_viajes.getSelectedItem());
            
                llenar_todos_cb(codigo_viaje);
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(Venta_tickets.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_cb_viajesItemStateChanged

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
            java.util.logging.Logger.getLogger(Consulta_tickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consulta_tickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consulta_tickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consulta_tickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Consulta_tickets().setVisible(true);
                } catch (IOException | ClassNotFoundException ex) {
                    Logger.getLogger(Consulta_tickets.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    public void llenar_cb_rutas() throws IOException, FileNotFoundException, ClassNotFoundException
    {
        cb_rutas.removeAllItems();
        Archivo arc = new Archivo();
        ArrayList<Rutas> lista_rutas;
        
        lista_rutas = arc.leer_archivo("Rutas");
        
        for(Rutas elemento : lista_rutas)
        {
            if(elemento.isEstado())
            {
                cb_rutas.addItem(Integer.toString(elemento.getCodigo_ruta()) + " " + elemento.getLugar_llegada());
            }
        }
    }
    
    public void llenar_cb_viajes(int codigo_ruta) throws IOException, FileNotFoundException, ClassNotFoundException
    {
        cb_viajes.removeAllItems();
        Archivo arc = new Archivo();
        ArrayList<Viajes> lista_viajes;
        
        lista_viajes = arc.leer_archivo("Viajes");
        
        for(Viajes elemento : lista_viajes)
        {
            if(elemento.getCodigo_ruta() == codigo_ruta && elemento.isEstado() == true)
            {
                cb_viajes.addItem(Integer.toString(elemento.getCodigo_viaje()) + " " + elemento.getHora_salida());
            }
        }
    }
    
    public void llenar_todos_cb(int codigo_viaje) throws IOException, FileNotFoundException, ClassNotFoundException
    {
        int asientos_vendidos = 0;
        int cant_asientos;
        int codigo_autobus;
        Archivo arc = new Archivo();
        ArrayList<Tickets> lista_tickets;
        ArrayList<Viajes> lista_viajes;
        Autobus au;
        
        lista_tickets = arc.leer_archivo("Tickets");
        lista_viajes = arc.leer_archivo("Viajes");
        codigo_autobus = lista_viajes.get(codigo_viaje - 1).getCodigo_autobus();
        au = (Autobus) arc.buscar_archivo("Autobus", codigo_autobus);
        
        for(Tickets elemento : lista_tickets)
        {
            if(elemento.getCodigo_viaje() == codigo_viaje)
            {
                asientos_vendidos++;
            }
        }
        
        cant_asientos = (au.getCant_filas() * 4) - (asientos_vendidos);
        
        this.tb_cant_asientos_vendidos.setText(Integer.toString(asientos_vendidos));
        this.tb_cant_asientos_libres.setText(Integer.toString(cant_asientos));
        this.tb_precio_asiento.setText(String.valueOf(lista_viajes.get(codigo_viaje - 1).getPrecio_ticket()));
        this.tb_total.setText(Float.toString(asientos_vendidos * Float.valueOf(tb_precio_asiento.getText())));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_salir;
    private javax.swing.JComboBox<String> cb_rutas;
    private javax.swing.JComboBox<String> cb_viajes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField tb_cant_asientos_libres;
    private javax.swing.JTextField tb_cant_asientos_vendidos;
    private javax.swing.JTextField tb_precio_asiento;
    private javax.swing.JTextField tb_total;
    // End of variables declaration//GEN-END:variables
}
