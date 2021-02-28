/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logindesign;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Utilizator
 */
public class Angajat extends javax.swing.JFrame {

    /**
     * Creates new form Angajat
     */
    public Angajat(int id) {
        initComponents();
        this.id = id;
        //System.out.println(this.id + "   " + id);
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
        programareBtn = new javax.swing.JButton();
        infoBtn = new javax.swing.JButton();
        pacientBtn = new javax.swing.JButton();
        titlePanel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(204, 255, 204));

        programareBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        programareBtn.setText("PROGRAMARE NOUA");
        programareBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                programareBtnMouseClicked(evt);
            }
        });

        infoBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        infoBtn.setText("INFO");
        infoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoBtnMouseClicked(evt);
            }
        });

        pacientBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pacientBtn.setText("PACIENT NOU");
        pacientBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pacientBtnMouseClicked(evt);
            }
        });

        titlePanel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titlePanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titlePanel.setText("Angajat");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(programareBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addComponent(pacientBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(infoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pacientBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(programareBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void programareBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_programareBtnMouseClicked
        // TODO add your handling code here:
        try{
            ProgramareNoua p = new ProgramareNoua(id);
            p.setVisible(true);
            
        } catch (Exception ex){
            System.out.println("SQL exception");
            JOptionPane.showMessageDialog(null, ex);
            System.exit(0);
        }
        
    }//GEN-LAST:event_programareBtnMouseClicked

    private void pacientBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pacientBtnMouseClicked
        // TODO add your handling code here:
        try{
            PacientNou p = new PacientNou();
            p.setVisible(true);
            
        } catch (Exception ex){
            System.out.println("SQL exception");
            JOptionPane.showMessageDialog(null, ex);
            System.exit(0);
        }
    }//GEN-LAST:event_pacientBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Angajat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Angajat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Angajat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Angajat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            private int id = this.id;
            public void run() {
                new Angajat(this.id).setVisible(true);
            }
        });
    }

    
    Integer id;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton infoBtn;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton pacientBtn;
    private javax.swing.JButton programareBtn;
    private javax.swing.JLabel titlePanel;
    // End of variables declaration//GEN-END:variables
}