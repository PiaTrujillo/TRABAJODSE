/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Modelo.Compra;
import Modelo.Entrada;
import controlador.Registro;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pía Trujillo / José Ignacio Gutiérrez
 */
public class ComprarEntrada extends javax.swing.JFrame {
    
    Registro reg = new Registro();

    /**
     * Creates new form ComprarEntrada
     */
    public ComprarEntrada() {
        initComponents();
        
        this.jtxt_titulo.setEditable(false);
        this.jtxt_precio.setEditable(false);
        this.jtxt_entrada.setEditable(false);
        
        String titulo, alias;
        boolean disponible;
        
        Registro reg = new Registro();
        
        DefaultTableModel modelo = (DefaultTableModel)this.jtbl_listado.getModel();
        
        modelo.setRowCount(0);
        

        List<Entrada> lista = reg.buscarTodos();

        for (Entrada entrada : lista) {
            titulo = entrada.getTitulo();
            alias = entrada.getAlias();
            disponible = entrada.isDisponible();

            if(disponible){
            modelo.addRow(new Object[]{titulo, alias, disponible});
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jtxt_entrada = new javax.swing.JTextField();
        jbtn_limpiar = new javax.swing.JButton();
        jbtn_salir = new javax.swing.JButton();
        jbtn_comprar = new javax.swing.JButton();
        jtxt_precio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtxt_titulo = new javax.swing.JTextField();
        jtxt_alias = new javax.swing.JTextField();
        jbtn_buscar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbl_listado = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Comprar Entradas");

        jLabel3.setText("Ingrese Numero de Entradas");

        jtxt_entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_entradaActionPerformed(evt);
            }
        });

        jbtn_limpiar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbtn_limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        jbtn_limpiar.setText("Limpiar");
        jbtn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_limpiarActionPerformed(evt);
            }
        });

        jbtn_salir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbtn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salida.png"))); // NOI18N
        jbtn_salir.setText("Salir");
        jbtn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_salirActionPerformed(evt);
            }
        });

        jbtn_comprar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbtn_comprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verificar.png"))); // NOI18N
        jbtn_comprar.setText("Comprar");
        jbtn_comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_comprarActionPerformed(evt);
            }
        });

        jLabel4.setText("Título");

        jLabel5.setText("Precio");

        jLabel7.setText("Ingrese Alias");

        jbtn_buscar.setText("Buscar");
        jbtn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_buscarActionPerformed(evt);
            }
        });

        jLabel8.setText("Recuerda: El alias corresponde a los primeros 3 caracteres del título");

        jtbl_listado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Título", "Alias", "Disponible"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtbl_listado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jbtn_limpiar)
                                .addGap(156, 156, 156)
                                .addComponent(jbtn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxt_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtxt_precio)
                                        .addComponent(jtxt_titulo, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jtxt_alias, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jbtn_buscar)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jbtn_comprar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtxt_alias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_buscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtxt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtxt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxt_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtn_comprar)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_limpiar)
                    .addComponent(jbtn_salir))
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxt_entradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_entradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_entradaActionPerformed

    private void jbtn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_limpiarActionPerformed

        this.jtxt_alias.setText("");
        this.jtxt_titulo.setText("");
        this.jtxt_entrada.setText("");
        this.jtxt_precio.setText("");
        this.jtxt_alias.requestFocus(true);

    }//GEN-LAST:event_jbtn_limpiarActionPerformed

    private void jbtn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_salirActionPerformed

        dispose();
    }//GEN-LAST:event_jbtn_salirActionPerformed

    private void jbtn_comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_comprarActionPerformed

        String alias = this.jtxt_alias.getText();
        
        Entrada entrada = reg.buscarPorAlias(alias);
        
        int entradasVendidas = entrada.getCantidadEntrada();
        
        int cantidad = Integer.parseInt(this.jtxt_entrada.getText());
        int precio = Integer.parseInt(this.jtxt_precio.getText());
        int total = cantidad*precio;
        int totalEntradas = entradasVendidas + cantidad;
        
        Compra compra = new Compra(alias, totalEntradas);
        
        int opcion = JOptionPane.showConfirmDialog(null, "Total a pagar: $"+total+"\n¿Desea finalizar la compra?", "Aviso", 1);
        
        if (opcion == 0) {
            reg.actualizarCompra(compra);
            JOptionPane.showMessageDialog(this, "Compra realizada", "Aviso", 1);  
        }
        else{
            JOptionPane.showMessageDialog(this, "Compra no realizada", "Aviso", 2);
        }
        
    }//GEN-LAST:event_jbtn_comprarActionPerformed

    private void jbtn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_buscarActionPerformed

        String alias = this.jtxt_alias.getText();
        
        Entrada entrada = reg.buscarPorAlias(alias);
        
        String titulo = entrada.getTitulo();
        int precio = entrada.getPrecio();
        int cantidadEntrada = 0;
        
        this.jtxt_titulo.setText(titulo);
        this.jtxt_precio.setText(String.valueOf(precio));
        this.jtxt_entrada.setText(String.valueOf(cantidadEntrada));
        this.jtxt_entrada.setEditable(true);
        
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
//            java.util.logging.Logger.getLogger(ComprarEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ComprarEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ComprarEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ComprarEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ComprarEntrada().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtn_buscar;
    private javax.swing.JButton jbtn_comprar;
    private javax.swing.JButton jbtn_limpiar;
    private javax.swing.JButton jbtn_salir;
    private javax.swing.JTable jtbl_listado;
    private javax.swing.JTextField jtxt_alias;
    private javax.swing.JTextField jtxt_entrada;
    private javax.swing.JTextField jtxt_precio;
    private javax.swing.JTextField jtxt_titulo;
    // End of variables declaration//GEN-END:variables
}
