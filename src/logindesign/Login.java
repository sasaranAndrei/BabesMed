/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logindesign;
//import com.sun.istack.internal.logging.Logger;
import java.awt.*;
import java.sql.*;
import java.util.logging.Level;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Utilizator
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        mainPanel = new javax.swing.JPanel();
        cruceIcon = new javax.swing.JLabel();
        babesMedLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        orarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(204, 255, 204));

        cruceIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poze si icons/login_med.png"))); // NOI18N

        babesMedLabel.setFont(new java.awt.Font("Lucida Handwriting", 2, 33)); // NOI18N
        babesMedLabel.setText("BABES MED");

        usernameLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        usernameLabel.setText("Username :");

        passwordLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        passwordLabel.setText("Password : ");

        usernameTextField.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N

        passwordTextField.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        loginBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        loginBtn.setText("LOG IN");
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnMouseClicked(evt);
            }
        });

        orarBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        orarBtn.setText("ORAR");
        orarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orarBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(cruceIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(babesMedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(orarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(usernameLabel)
                                    .addComponent(passwordLabel))
                                .addGap(66, 66, 66)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(22, 45, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(babesMedLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(cruceIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(orarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked
        // TODO add your handling code here:
        PreparedStatement ps;
        ResultSet rs;
        
        int superAdministrator = 0;
        int administrator = 0;
        int id;
        
        String user = usernameTextField.getText();
        String pass = String.valueOf(passwordTextField.getPassword());
        
        String query = "select * from utilizator where username =? AND password =?";    
        
        try{
            ps = MyConnection.getConnection().prepareStatement(query);
            
            ps.setString(1, user);
            ps.setString(2, pass);
            
            rs = ps.executeQuery();
            
            
            if (rs.next()){
                JOptionPane.showMessageDialog(null, "Bun venit, " + user.toUpperCase());
                
                superAdministrator = rs.getInt("superadministrator");
                administrator = rs.getInt("administrator");
                id = rs.getInt("angajat_idangajat");
                
                //System.out.println(id);
                
                
                //System.out.println(superAdministrator);
                //System.out.println(administrator);
                
               
                if (superAdministrator == 1){
                    SuperAdministrator superAdmin = new SuperAdministrator(id);
                    superAdmin.setVisible(true);
                }
                else if (administrator == 1){
                    Administrator admin = new Administrator(id);
                    admin.setVisible(true);
                }
                else {
                    Angajat angajat = new Angajat(id);
                    angajat.setVisible(true);
                    /*
                    select utilizator.username, angajat.nume 
from utilizator inner join angajat
on utilizator.idutilizator = angajat.idangajat;
                    */
                }
                this.dispose();
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Nume de utilizator sau parola invalida", "Acces respins",JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (Exception ex){
            System.out.println("SQL exception");
            JOptionPane.showMessageDialog(null, ex);
            System.exit(0);
        }
        
        
    }//GEN-LAST:event_loginBtnMouseClicked

    private void orarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orarBtnMouseClicked
        // TODO add your handling code here:
        PreparedStatement ps;
        ResultSet rs;

        String query = "select angajat.nume, angajat.prenume, angajat.functia, orar.zi, orar.startOrar, orar.sfarsitOrar from angajat inner join angajat_has_orar on angajat.idangajat = angajat_has_orar.angajat_idangajat inner join orar on angajat_has_orar.orar_idorar = orar.idorar";

        try{

            JFrame orarFrame = new JFrame();
            JPanel panel = new JPanel();
            JTable result = new JTable();

            panel.setPreferredSize(new Dimension(900,900));
            result.setPreferredSize(new Dimension(850,850));

            ps = MyConnection.getConnection().prepareStatement(query);
            rs = ps.executeQuery();

            result.setModel(DbUtils.resultSetToTableModel(rs));

            panel.add(result);
            orarFrame.add(panel);
            orarFrame.pack();
            orarFrame.setVisible(true);

            orarFrame.setTitle("ORARUL ANGAJATILOR POLICLINICII BABES MED");
        }
        catch (Exception ex){
            System.out.println("SQL exception");
            JOptionPane.showMessageDialog(null, ex);
            System.exit(0);
        }

    }//GEN-LAST:event_orarBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel babesMedLabel;
    private javax.swing.JLabel cruceIcon;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton orarBtn;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
