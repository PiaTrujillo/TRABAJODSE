/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Modelo.Entrada;
import controlador.Registro;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pía Trujillo / José Ignacio Gutiérrez
 */
public class Resumen extends javax.swing.JFrame {

    /**
     * Creates new form Resumen
     */
    public Resumen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtn_listar = new javax.swing.JButton();
        jbtn_volver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbl_listado = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jtxt_alias = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Resumen de Ventas");

        jbtn_listar.setText("Listar");
        jbtn_listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_listarActionPerformed(evt);
            }
        });

        jbtn_volver.setText("Volver");
        jbtn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_volverActionPerformed(evt);
            }
        });

        jtbl_listado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Título", "Entradas Vendidas", "Recaudación"
            }
        ));
        jScrollPane1.setViewportView(jtbl_listado);

        jLabel1.setText("Ingrese Alias");

        jtxt_alias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_aliasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jbtn_volver))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(jtxt_alias, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtn_listar)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_listar)
                    .addComponent(jLabel1)
                    .addComponent(jtxt_alias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jbtn_volver)
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_listarActionPerformed

        String titulo, alias;
        int precio, cantidad, total;
        
        Registro reg = new Registro();
        
        DefaultTableModel modelo = (DefaultTableModel)this.jtbl_listado.getModel();
        
        try {
            alias = this.jtxt_alias.getText();
        } catch (Exception e) {
            alias = "";
        }
        
        modelo.setRowCount(0);
        
        if (alias == ""){ //listar a todos
            List<Entrada> lista = reg.buscarTodos();
            
            for (Entrada entrada : lista) {
                titulo = entrada.getTitulo();
                cantidad = entrada.getCantidadEntrada();
                precio = entrada.getPrecio();
                total = cantidad*precio;
                
                modelo.addRow(new Object[]{titulo, cantidad, total});
            }
        }
        else{ //buscar por alias
            
            Entrada entrada = reg.buscarPorAlias(alias);
                titulo = entrada.getTitulo();
                cantidad = entrada.getCantidadEntrada();
                precio = entrada.getPrecio();
                total = cantidad*precio;
                
                modelo.addRow(new Object[]{titulo, cantidad, total});
        }    
        
    }//GEN-LAST:event_jbtn_listarActionPerformed

    private void jbtn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_volverActionPerformed
        
        dispose();
        
    }//GEN-LAST:event_jbtn_volverActionPerformed

    private void jtxt_aliasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_aliasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_aliasActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Resumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Resumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Resumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Resumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Resumen().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtn_listar;
    private javax.swing.JButton jbtn_volver;
    private javax.swing.JTable jtbl_listado;
    private javax.swing.JTextField jtxt_alias;
    // End of variables declaration//GEN-END:variables
}
