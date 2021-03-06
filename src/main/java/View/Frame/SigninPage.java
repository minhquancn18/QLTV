/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.Frame;

import Base.DIContainer;
import DTO.AccountDTO;
import constant.AccountStringConstant;
import constant.AuthenStringConstant;
import constant.GeneralStringConstant;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;

/**
 * This class is used for render Sign in Page
 *
 * @author Nguyễn Duy Phúc
 */
public class SigninPage extends javax.swing.JFrame {

    /**
     * Creates new form SignupPage
     */
    public SigninPage() {
        initComponents();
        initUI();
    }

    /**
     * Add some first UI
     */
    private void initUI() {
        //Place hoder for input field
        txtUsername.setText(AccountStringConstant.ACCOUNT_INPUT_USERNAME);
        txtPassword.setEchoChar('*');

        //Content of label
        lblUsername.setText(AccountStringConstant.ACCOUNT_USERNAME);
        lblPassword.setText(AccountStringConstant.ACCOUNT_PWD);
        lblSignIn.setText(AuthenStringConstant.SIGN_IN);

        //content of button
        btnSignIn.setText(AuthenStringConstant.SIGN_IN);
        btnSignUp.setText(AuthenStringConstant.SIGN_UP);

        //State of eye
        btnShowPass.setVisible(false);
        btnHidePass.setVisible(true);

        //Set default button (Sign in button)
        JRootPane rootPane = SwingUtilities.getRootPane(btnSignIn);
        rootPane.setDefaultButton(btnSignIn);
    }

    /**
     * This function use for validate input of user
     *
     * @return resutlt of validate
     */
    public boolean validateInput() {
        //Get string from UI
        String username = txtUsername.getText();
        String pwd = new String(txtPassword.getPassword());

        //Validate input
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

    /**
     * Login with username and password
     */
    public void login() {
        //Get string from UI
        String username = txtUsername.getText();
        String pwd = new String(txtPassword.getPassword());

        //Get account and move to Home page
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
        btnSignUp = new javax.swing.JButton();
        btnSignIn = new javax.swing.JButton();
        btnHidePass = new javax.swing.JLabel();
        btnShowPass = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("Advance Library");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/library-3.png.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 840, 620));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("Chào mừng ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 750));

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

        btnSignUp.setBackground(new java.awt.Color(255, 51, 51));
        btnSignUp.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(255, 255, 255));
        btnSignUp.setText("Đăng ký");
        btnSignUp.setBorder(null);
        btnSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSignUpMouseClicked(evt);
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
                btnSignInActionPerformed(evt);
            }
        });
        jPanel2.add(btnSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, 320, 70));

        btnHidePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-closed-eye-32.png"))); // NOI18N
        btnHidePass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHidePass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHidePassMouseClicked(evt);
            }
        });
        jPanel2.add(btnHidePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, -1, -1));

        btnShowPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-eye-32.png"))); // NOI18N
        btnShowPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnShowPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnShowPassMouseClicked(evt);
            }
        });
        jPanel2.add(btnShowPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, -1, -1));

        txtPassword.setBackground(new java.awt.Color(102, 102, 255));
        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 350, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Quên mật khẩu");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 0, 530, 750));

        setSize(new java.awt.Dimension(1523, 751));
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

    private void btnShowPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShowPassMouseClicked
        // TODO add your handling code here:
        btnShowPass.setVisible(false);
        btnHidePass.setVisible(true);

        txtPassword.setEchoChar('*');
    }//GEN-LAST:event_btnShowPassMouseClicked

    private void btnHidePassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHidePassMouseClicked
        btnShowPass.setVisible(true);
        btnHidePass.setVisible(false);

        txtPassword.setEchoChar((char) 0);
    }//GEN-LAST:event_btnHidePassMouseClicked

    private void btnSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignUpMouseClicked
        // TODO add your handling code here:
        SignupPage signUp = new SignupPage();
        signUp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSignUpMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        ForgotPwdPage forgotPage = new ForgotPwdPage();
        forgotPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        // TODO add your handling code here:
        if (validateInput()) {
            login();
        }
    }//GEN-LAST:event_btnSignInActionPerformed

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
    private javax.swing.JLabel btnHidePass;
    private javax.swing.JLabel btnShowPass;
    private javax.swing.JButton btnSignIn;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSignIn;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

}
