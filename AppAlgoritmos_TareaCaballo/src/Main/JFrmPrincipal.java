/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import logica.Tablero1;
import javax.swing.JOptionPane;

/**
 *
 * @version 15 de abril del 2019
 * @author Hernaldo Valerio Pineda
 */
public class JFrmPrincipal extends javax.swing.JFrame {

    Tablero1 matris; 
    
    public JFrmPrincipal() {
        initComponents();             
        this.CargarCombo();
        this.jTxTImpresion_Matris.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTxTImpresion_Matris = new javax.swing.JTextArea();
        jBttnCambiarTamanno_Matris = new javax.swing.JButton();
        jBttnElegirCoordenadas_Salida = new javax.swing.JButton();
        jBttnMostrarTiempo_Caballo = new javax.swing.JButton();
        jBttnImprimirRecorrido = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTxtFld_TamannoMatris = new javax.swing.JTextField();
        jTxtFld_fila = new javax.swing.JTextField();
        jTxtFld_columna = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jCmbBox_tammano = new javax.swing.JComboBox<>();
        jBttnCalcularRecorrido1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTxTImpresion_Matris.setColumns(20);
        jTxTImpresion_Matris.setRows(5);
        jScrollPane1.setViewportView(jTxTImpresion_Matris);

        jBttnCambiarTamanno_Matris.setText("Cambiar");
        jBttnCambiarTamanno_Matris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBttnCambiarTamanno_MatrisActionPerformed(evt);
            }
        });

        jBttnElegirCoordenadas_Salida.setText("Ubicar");
        jBttnElegirCoordenadas_Salida.setToolTipText("");
        jBttnElegirCoordenadas_Salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBttnElegirCoordenadas_SalidaActionPerformed(evt);
            }
        });

        jBttnMostrarTiempo_Caballo.setText("Mostrar");

        jBttnImprimirRecorrido.setText("Imprimir ");

        jLabel1.setText("Modificar el tamaño de la matris");

        jLabel2.setText("Elegir las coordenadas de salida");

        jLabel3.setText("Calcular el recorrido");

        jLabel4.setText("Mostrar tiempo requerido para el calculo");

        jLabel5.setText("Imprimir recorrido");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Matriz del caballo");

        jLabel7.setText("Fila");

        jLabel8.setText("Columna");

        jBttnCalcularRecorrido1.setText("Calcular1");
        jBttnCalcularRecorrido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBttnCalcularRecorrido1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBttnImprimirRecorrido)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTxtFld_fila, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtFld_columna, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jBttnElegirCoordenadas_Salida, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBttnMostrarTiempo_Caballo)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTxtFld_TamannoMatris, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBttnCambiarTamanno_Matris)
                                .addGap(18, 18, 18)
                                .addComponent(jCmbBox_tammano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jBttnCalcularRecorrido1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBttnCambiarTamanno_Matris)
                            .addComponent(jTxtFld_TamannoMatris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCmbBox_tammano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtFld_fila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtFld_columna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBttnElegirCoordenadas_Salida))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBttnCalcularRecorrido1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(11, 11, 11)
                .addComponent(jBttnMostrarTiempo_Caballo)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBttnImprimirRecorrido)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void CargarCombo(){
        jCmbBox_tammano.addItem("5");
        jCmbBox_tammano.addItem("6");
        jCmbBox_tammano.addItem("7");
        jCmbBox_tammano.addItem("8");
    }
    
    private void jBttnCambiarTamanno_MatrisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttnCambiarTamanno_MatrisActionPerformed
        int tamanno = Integer.parseInt(jTxtFld_TamannoMatris.getText());        
        //int tamanno1 = (int)jCmbBox_tammano.getSelectedItem();
        this.matris = new Tablero1(tamanno);
        this.jTxTImpresion_Matris.setText(matris.MostrarTablero());
        this.jTxtFld_TamannoMatris.setText("");
        this.jTxtFld_fila.requestFocus();
    }//GEN-LAST:event_jBttnCambiarTamanno_MatrisActionPerformed

    private void jBttnElegirCoordenadas_SalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttnElegirCoordenadas_SalidaActionPerformed
        int fila = Integer.parseInt(jTxtFld_fila.getText());
        int columna = Integer.parseInt(jTxtFld_columna.getText());                
        this.matris.PosicionarCaballo1(fila, columna);
        this.jTxTImpresion_Matris.setText(matris.MostrarTablero());
    }//GEN-LAST:event_jBttnElegirCoordenadas_SalidaActionPerformed

    private void jBttnCalcularRecorrido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttnCalcularRecorrido1ActionPerformed
        // TODO add your handling code here:
        this.matris.Movimiento();
        this.jTxTImpresion_Matris.setText(matris.MostrarTablero());
    }//GEN-LAST:event_jBttnCalcularRecorrido1ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBttnCalcularRecorrido1;
    private javax.swing.JButton jBttnCambiarTamanno_Matris;
    private javax.swing.JButton jBttnElegirCoordenadas_Salida;
    private javax.swing.JButton jBttnImprimirRecorrido;
    private javax.swing.JButton jBttnMostrarTiempo_Caballo;
    private javax.swing.JComboBox<String> jCmbBox_tammano;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTxTImpresion_Matris;
    private javax.swing.JTextField jTxtFld_TamannoMatris;
    private javax.swing.JTextField jTxtFld_columna;
    private javax.swing.JTextField jTxtFld_fila;
    // End of variables declaration//GEN-END:variables
}
