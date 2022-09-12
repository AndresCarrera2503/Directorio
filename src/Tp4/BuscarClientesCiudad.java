package Tp4;

import java.util.ArrayList;
import javax.swing.DefaultListModel;


public class BuscarClientesCiudad extends javax.swing.JFrame {
    DefaultListModel modelo = new DefaultListModel();
    Directorio directorio;
    public BuscarClientesCiudad(Directorio directorio) {
        initComponents();
        litLISTA.setModel(modelo);
        this.directorio=directorio;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCIUDAD = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnBUSCAR = new javax.swing.JButton();
        btnSALIR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        litLISTA = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setText("Clientes por ciudad");

        txtCIUDAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCIUDADActionPerformed(evt);
            }
        });

        jLabel2.setText("Ciudad:");

        btnBUSCAR.setText("Buscar");
        btnBUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBUSCARActionPerformed(evt);
            }
        });

        btnSALIR.setText("Salir");
        btnSALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSALIRActionPerformed(evt);
            }
        });

        litLISTA.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(litLISTA);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtCIUDAD, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBUSCAR)
                                .addGap(31, 31, 31)
                                .addComponent(btnSALIR)))
                        .addGap(73, 73, 73))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCIUDAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnBUSCAR)
                    .addComponent(btnSALIR))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCIUDADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCIUDADActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCIUDADActionPerformed

    private void btnSALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSALIRActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
                            public void run() {
                                    new Menu1(directorio).setVisible(true);
                                    dispose();
                                }
                        });
    }//GEN-LAST:event_btnSALIRActionPerformed

    private void btnBUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBUSCARActionPerformed
       ArrayList <Cliente> lista = directorio.buscarClientes(txtCIUDAD.getText());
       modelo.removeAllElements();
       for(Cliente t: lista){
         modelo.addElement(t.getApellido()+ " "+t.getNombre()+" "+t.getDni());
       }
    }//GEN-LAST:event_btnBUSCARActionPerformed

    
    public static void main(String args[]) {
      
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new BuscarClientesCiudad().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBUSCAR;
    private javax.swing.JButton btnSALIR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> litLISTA;
    private javax.swing.JTextField txtCIUDAD;
    // End of variables declaration//GEN-END:variables
}
