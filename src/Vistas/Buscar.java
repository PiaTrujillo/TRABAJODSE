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
 * @author starj
 */
public class Buscar extends javax.swing.JFrame {

    /**
     * Creates new form Buscar
     */
    public Buscar() {
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

        jtxt_alias = new javax.swing.JTextField();
        jbtn_buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbl_datos = new javax.swing.JTable();
        jbtn_volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar Película");

        jtxt_alias.setText("Ingrese Alias");
        jtxt_alias.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxt_aliasFocusGained(evt);
            }
        });
        jtxt_alias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_aliasActionPerformed(evt);
            }
        });

        jbtn_buscar.setText("Buscar");
        jbtn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_buscarActionPerformed(evt);
            }
        });

        jtbl_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Título", "Alias", "Estreno", "Entradas", "Precio", "Disponible"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtbl_datos);

        jbtn_volver.setText("Volver");
        jbtn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jtxt_alias, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtn_buscar)
                .addGap(72, 72, 72))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(jbtn_volver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_alias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jbtn_volver)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxt_aliasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_aliasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_aliasActionPerformed

    private void jbtn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_volverActionPerformed
        
        dispose();
        
    }//GEN-LAST:event_jbtn_volverActionPerformed

    private void jtxt_aliasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxt_aliasFocusGained
        
        this.jtxt_alias.setText("");
        
    }//GEN-LAST:event_jtxt_aliasFocusGained

    private void jbtn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_buscarActionPerformed
        
        String titulo, alias;
        int precio, cantidad;
        boolean disponible;
        Date fecha;
        
        Registro reg = new Registro();
        
        DefaultTableModel modelo = (DefaultTableModel)this.jtbl_datos.getModel();
        
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
                alias = entrada.getAlias();
                fecha = entrada.getFuncion();
                cantidad = entrada.getCantidadEntrada();
                precio = entrada.getPrecio();
                disponible = entrada.isDisponible();
                
                modelo.addRow(new Object[]{titulo, alias, fecha, cantidad, precio, disponible});
            }
        }
        else{ //buscar por alias
            
            Entrada entrada = reg.buscarPorAlias(alias);
                titulo = entrada.getTitulo();
                alias = entrada.getAlias();
                fecha = entrada.getFuncion();
                cantidad = entrada.getCantidadEntrada();
                precio = entrada.getPrecio();
                disponible = entrada.isDisponible();
                
                modelo.addRow(new Object[]{titulo, alias, fecha, cantidad, precio, disponible});
        }    
        
        
    }//GEN-LAST:event_jbtn_buscarActionPerformed

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
//            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Buscar().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtn_buscar;
    private javax.swing.JButton jbtn_volver;
    private javax.swing.JTable jtbl_datos;
    private javax.swing.JTextField jtxt_alias;
    // End of variables declaration//GEN-END:variables
}
