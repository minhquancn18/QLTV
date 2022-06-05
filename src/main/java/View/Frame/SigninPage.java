/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.Frame;

import Base.DIContainer;
import DTO.AccountDTO;
import Validate.Validator;
import constant.AccountStringConstant;
import constant.AuthenStringConstant;
import constant.GeneralStringConstant;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class SigninPage extends javax.swing.JFrame {

    /**
     * Creates new form SignupPage
     */
    public SigninPage() {
        initComponents();
        initUI();
    }

    private void initUI() {
        txtUsername.setText(AccountStringConstant.ACCOUNT_INPUT_USERNAME);
        txtPassword.setText(AccountStringConstant.ACCOUNT_INPUT_PWD);
        lblUsername.setText(AccountStringConstant.ACCOUNT_USERNAME);
        lblPassword.setText(AccountStringConstant.ACCOUNT_PWD);
        lblSignIn.setText(AuthenStringConstant.SIGN_IN);
        btnSignIn.setText(AuthenStringConstant.SIGN_IN);
        btnSignUp.setText(AuthenStringConstant.SIGN_UP);
    }
    /**
     * This function use for validate input of user
     *
     * @return resutlt of validate
     */
    public boolean validateInput() {
        String username = txtUsername.getText();
        String pwd = txtPassword.getText();

        if (username.equals("")) {
            JOptionPane.showMessageDialog(this, AccountStringConstant.ACCOUNT_ERROR_USERNAME);
            return false;
        }
        if (pwd.equals("")) {
            JOptionPane.showMessageDialog(this, AccountStringConstant.ACCOUNT_ERROR_PWD);
            return false;
        }
        return true;
    }

    public void login() throws SQLException {
        String username = txtUsername.getText();
        String pwd = txtPassword.getText();

        AccountDTO account = DIContainer.getAccountDAO().login(username, pwd);
        if (account != null) {
            JOptionPane.showMessageDialog(this, AuthenStringConstant.SIGN_IN_SUCCESS);
            HomeForm home = new HomeForm(account);
            home.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, AuthenStringConstant.SIGN_IN_FAIL);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnExit = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblSignIn = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        btnSignUp = new javax.swing.JButton();
        btnSignIn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("Advance Library");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setText("Developer");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("UNIQUE");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/library-3.png.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 840, 620));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("Chào mừng ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 830));

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Account_50px.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 50, 50));

        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("X");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });
        jPanel2.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, -1));

        lblUsername.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setText("Tài khoản:");
        jPanel2.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Secure_50px.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 50, 50));

        lblPassword.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Mật khẩu");
        jPanel2.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        lblSignIn.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        lblSignIn.setForeground(new java.awt.Color(255, 255, 255));
        lblSignIn.setText("Đăng nhập");
        jPanel2.add(lblSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        txtUsername.setBackground(new java.awt.Color(102, 102, 255));
        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        txtUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtUsername.setMargin(new java.awt.Insets(3, 6, 3, 6));
        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsernameFocusLost(evt);
            }
        });
        jPanel2.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 350, 40));

        txtPassword.setBackground(new java.awt.Color(102, 102, 255));
        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtPassword.setMargin(new java.awt.Insets(3, 6, 3, 6));
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 350, 40));

        btnSignUp.setBackground(new java.awt.Color(255, 51, 51));
        btnSignUp.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(255, 255, 255));
        btnSignUp.setText("Đăng ký");
        btnSignUp.setBorder(null);
        btnSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        jPanel2.add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 600, 320, 70));

        btnSignIn.setBackground(new java.awt.Color(0, 0, 204));
        btnSignIn.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnSignIn.setForeground(new java.awt.Color(255, 255, 255));
        btnSignIn.setText("Đăng nhập");
        btnSignIn.setBorder(null);
        btnSignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btnSignInActionPerformed(evt);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        jPanel2.add(btnSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, 320, 70));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 0, 530, 830));

        setSize(new java.awt.Dimension(1523, 828));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
        // TODO add your handling code here:
        String username = txtUsername.getText();
        if (username.equals(AccountStringConstant.ACCOUNT_INPUT_USERNAME)) {
            txtUsername.setText(GeneralStringConstant.GENERAL_EMPTY);
        }
    }//GEN-LAST:event_txtUsernameFocusGained

    private void txtUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusLost
        // TODO add your handling code here:
        String username = txtUsername.getText();
        if (username.equals(GeneralStringConstant.GENERAL_EMPTY)) {
            txtUsername.setText(AccountStringConstant.ACCOUNT_INPUT_USERNAME);
        }
    }//GEN-LAST:event_txtUsernameFocusLost

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        // TODO add your handling code here:
        String password = txtPassword.getText();
        if (password.equals(AccountStringConstant.ACCOUNT_INPUT_PWD)) {
            txtPassword.setText(GeneralStringConstant.GENERAL_EMPTY);
        }
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        // TODO add your handling code here:
        String password = txtPassword.getText();
        if (password.equals(GeneralStringConstant.GENERAL_EMPTY)) {
            txtPassword.setText(AccountStringConstant.ACCOUNT_INPUT_PWD);
        }
    }//GEN-LAST:event_txtPasswordFocusLost

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_btnSignInActionPerformed
        // TODO add your handling code here:
        if (validateInput())
            login();
    }//GEN-LAST:event_btnSignInActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // TODO add your handling code here:
        SignupPage signUp = new SignupPage();
        signUp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSignUpActionPerformed

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
            java.util.logging.Logger.getLogger(SigninPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SigninPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SigninPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SigninPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SigninPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnExit;
    private javax.swing.JButton btnSignIn;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSignIn;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    
}
