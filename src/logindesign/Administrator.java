/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logindesign;

import javax.swing.JOptionPane;

/**
 *
 * @author Utilizator
 */
public class Administrator extends javax.swing.JFrame {

    /**
     * Creates new form Administrator
     */
    public Administrator(int id) {
        initComponents();
        this.id = id;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        infoBtn = new javax.swing.JButton();
        contabilitateBtn = new javax.swing.JButton();
        modificareAngajatiBtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(204, 255, 204));

        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Administrator");

        infoBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        infoBtn.setText("INFO");
        infoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoBtnMouseClicked(evt);
            }
        });

        contabilitateBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        contabilitateBtn.setText("CONTABILITATE");
        contabilitateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contabilitateBtnMouseClicked(evt);
            }
        });

        modificareAngajatiBtn1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        modificareAngajatiBtn1.setText("MODIFICARE ANGAJATI");
        modificareAngajatiBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificareAngajatiBtn1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addComponent(contabilitateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(infoBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addComponent(modificareAngajatiBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(modificareAngajatiBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(infoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contabilitateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void infoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoBtnMouseClicked
        // TODO add your handling code here:
        try{   
            Info info = new Info(id);
                info.setVisible(true);
             
            
        } catch (Exception ex){
            System.out.println("SQL exception");
            JOptionPane.showMessageDialog(null, ex);
            System.exit(0);
        }
    }//GEN-LAST:event_infoBtnMouseClicked

    private void contabilitateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contabilitateBtnMouseClicked
        // TODO add your handling code here:
        
        Contabilitate c = new Contabilitate();
        c.setVisible(true);
                
    }//GEN-LAST:event_contabilitateBtnMouseClicked

    private void modificareAngajatiBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificareAngajatiBtn1MouseClicked
        // TODO add your handling code here:
        try {
           ModificareAngajatiAdmin m = new ModificareAngajatiAdmin();
           m.setVisible(true);
           
        } catch (Exception ex){
             System.out.println("SQL exception");
            JOptionPane.showMessageDialog(null, ex);
            System.exit(0);
        }
    }//GEN-LAST:event_modificareAngajatiBtn1MouseClicked

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
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            int id = this.id;
            public void run() {
                new Administrator(id).setVisible(true);
            }
        });
    }

    
    
    Integer id;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton contabilitateBtn;
    private javax.swing.JButton infoBtn;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton modificareAngajatiBtn1;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
