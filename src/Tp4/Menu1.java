
package Tp4;

public class Menu1 extends javax.swing.JFrame {
Directorio directorio;
    public Menu1(Directorio directorio) {
        
        initComponents();
        this.directorio=directorio;
    }
    

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnAGREGAR = new javax.swing.JButton();
        btnBUSCAR = new javax.swing.JButton();
        btnBUSCARTELEFONO = new javax.swing.JButton();
        btnBUSCARCIUDAD = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setText("MENU PRINCIPAL");

        btnAGREGAR.setText("Agregar");
        btnAGREGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAGREGARActionPerformed(evt);
            }
        });

        btnBUSCAR.setText("Buscar y/o eliminar cliente por telefono");
        btnBUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBUSCARActionPerformed(evt);
            }
        });

        btnBUSCARTELEFONO.setText("Buscar telefono");
        btnBUSCARTELEFONO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBUSCARTELEFONOActionPerformed(evt);
            }
        });

        btnBUSCARCIUDAD.setText("Buscar clientes por ciudad");
        btnBUSCARCIUDAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBUSCARCIUDADActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBUSCARCIUDAD)
                    .addComponent(btnBUSCARTELEFONO)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBUSCAR)
                    .addComponent(btnAGREGAR))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAGREGAR)
                .addGap(18, 18, 18)
                .addComponent(btnBUSCAR)
                .addGap(18, 18, 18)
                .addComponent(btnBUSCARTELEFONO)
                .addGap(18, 18, 18)
                .addComponent(btnBUSCARCIUDAD)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAGREGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAGREGARActionPerformed
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarCliente1(directorio).setVisible(true);
                dispose();
            }
        });
    }//GEN-LAST:event_btnAGREGARActionPerformed

    private void btnBUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBUSCARActionPerformed
      java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BusquedaClienteTelefono(directorio).setVisible(true);
                dispose();
            }
        });
    }//GEN-LAST:event_btnBUSCARActionPerformed

    private void btnBUSCARTELEFONOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBUSCARTELEFONOActionPerformed
      java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BusquedaTelefono(directorio).setVisible(true);
                dispose();
            }
        });
    }//GEN-LAST:event_btnBUSCARTELEFONOActionPerformed

    private void btnBUSCARCIUDADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBUSCARCIUDADActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarClientesCiudad(directorio).setVisible(true);
                dispose();
            }
        });
    }//GEN-LAST:event_btnBUSCARCIUDADActionPerformed

    
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
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Menu1(directorio).setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAGREGAR;
    private javax.swing.JButton btnBUSCAR;
    private javax.swing.JButton btnBUSCARCIUDAD;
    private javax.swing.JButton btnBUSCARTELEFONO;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
