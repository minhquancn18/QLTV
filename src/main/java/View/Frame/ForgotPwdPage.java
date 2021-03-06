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
import javax.swing.JOptionPane;

/**
 * This class is used for render Forgot Password Page
 *
 * @author Nguyễn Duy Phúc
 */
public class ForgotPwdPage extends javax.swing.JFrame {

    AccountDTO account = null;

    /**
     * Creates new form SingupPage
     */
    public ForgotPwdPage() {
        initComponents();
        initUI();
    }

    /**
     * Add some first UI
     */
    private void initUI() {
        //Place hoder for input field
        txtUsername.setText(AccountStringConstant.ACCOUNT_INPUT_USERNAME);
        txtAnswer.setText(AccountStringConstant.ACCOUNT_INPUT_ANSWER);
        txtPassword.setEchoChar('*');
        txtRePassword.setEchoChar('*');

        //Content of label
        lblUsername.setText(AccountStringConstant.ACCOUNT_USERNAME);
        lblPassword.setText(AccountStringConstant.ACCOUNT_NEW_PWD);
        lblRePassword.setText(AccountStringConstant.ACCOUNT_RE_NEW_PWD);
        lblQuestionSecurity.setText(AccountStringConstant.ACCOUNT_QUESTION);
        lblAnswer.setText(AccountStringConstant.ACCOUNT_ANSWER);
        lblRecover.setText(GeneralStringConstant.GENERAL_RECOVERY.toUpperCase());

        //Content of button
        btnSignIn.setText(AuthenStringConstant.SIGN_IN);
        btnRecover.setText(GeneralStringConstant.GENERAL_RECOVERY.toUpperCase());
        btnSearch.setText(GeneralStringConstant.GENERAL_SEARCH);

        //State of eye
        btnShowPass.setVisible(false);
        btnHidePass.setVisible(true);
        btnShowRePass.setVisible(false);
        btnHideRePass.setVisible(true);
    }

    /**
     * method to insert values into account table
     */
    public void changePwd() {
        //Declare variables
        String username = txtUsername.getText();
        String pwd = new String(txtPassword.getPassword());

        //Update new password and move to page Sign in
        boolean result = DIContainer.getAccountDAO().changePass(username, pwd);
        if (result) {
            JOptionPane.showMessageDialog(this, AccountStringConstant.ACCOUNT_UPDATE_SUCCESS);
            SigninPage signIn = new SigninPage();
            signIn.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, AccountStringConstant.ACCOUNT_UPDATE_FAIL);
        }
    }

    /**
     * This function use for validate input of user
     *
     * @return resutlt of validate
     */
    public boolean validateInput() {
        //Get string of UI
        String username = txtUsername.getText();
        String pwd = new String(txtPassword.getPassword());
        String repwd = new String(txtRePassword.getPassword());
        String answer = txtAnswer.getText();

        //Validate input
        if (Validator.inputString("[a-zA-Z0-9!@#$%^&*\\.<>?\\-_+/]+", username)
                || username.equals(AccountStringConstant.ACCOUNT_INPUT_USERNAME)) {
            JOptionPane.showMessageDialog(this, AccountStringConstant.ACCOUNT_ERROR_USERNAME);
            return false;
        }
        if (Validator.inputString("[a-zA-Z0-9!@#$%^&*\\.<>?\\-_+/]+", pwd)) {
            JOptionPane.showMessageDialog(this, AccountStringConstant.ACCOUNT_ERROR_PWD);
            return false;
        }
        if (!pwd.equals(repwd)) {
            JOptionPane.showMessageDialog(this, AccountStringConstant.ACCOUNT_ERROR_NOT_MATCH);
            return false;
        }
        if (answer.equals("") || answer.equals(AccountStringConstant.ACCOUNT_INPUT_ANSWER)) {
            JOptionPane.showMessageDialog(this, AccountStringConstant.ACCOUNT_ERROR_ANSWER);
            return false;
        }
        if (account == null || !answer.equals(account.getAnswer())) {
            JOptionPane.showMessageDialog(this, AuthenStringConstant.ANSWER_NOT_MATCH);
            return false;
        }
        return true;
    }

    /**
     * Search account to change password
     */
    private void searchAccount() {
        //Get username from UI
        String username = txtUsername.getText();

        //Validate inout
        if (Validator.inputString("[a-zA-Z0-9!@#$%^&*\\.]+", username)
                || username.equals(AccountStringConstant.ACCOUNT_INPUT_USERNAME)) {
            JOptionPane.showMessageDialog(this, AccountStringConstant.ACCOUNT_ERROR_USERNAME);
            return;
        }

        //Get account
        account = DIContainer.getAccountDAO().getAttribute("username", username);
        if (account == null) {
            JOptionPane.showMessageDialog(this, AuthenStringConstant.ACCOUNT_NOT_FOUND);
            return;
        }
        txtQuestion.setText(account.getQuestion());
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
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnExit = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblRePassword = new javax.swing.JLabel();
        lblQuestionSecurity = new javax.swing.JLabel();
        lblAnswer = new javax.swing.JLabel();
        lblRecover = new javax.swing.JLabel();
        btnHidePass = new javax.swing.JLabel();
        btnShowPass = new javax.swing.JLabel();
        btnShowRePass = new javax.swing.JLabel();
        btnHideRePass = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtAnswer = new javax.swing.JTextField();
        txtRePassword = new javax.swing.JPasswordField();
        txtPassword = new javax.swing.JPasswordField();
        btnSearch = new javax.swing.JButton();
        btnRecover = new javax.swing.JButton();
        btnSignIn = new javax.swing.JButton();
        txtQuestion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("Advance Library");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("Chào mừng ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/signup-library-icon.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 730, 580));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 750));

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("X");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });
        jPanel2.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Account_50px.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 50, 50));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Secure_50px.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 50, 50));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Secure_50px.png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 50, 50));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Secure_50px.png"))); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 50, 50));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Secure_50px.png"))); // NOI18N
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 50, 50));

        lblUsername.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setText("Tài khoản:");
        jPanel2.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        lblPassword.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Mật khẩu");
        jPanel2.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        lblRePassword.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblRePassword.setForeground(new java.awt.Color(255, 255, 255));
        lblRePassword.setText("Mật khẩu");
        jPanel2.add(lblRePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        lblQuestionSecurity.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblQuestionSecurity.setForeground(new java.awt.Color(255, 255, 255));
        lblQuestionSecurity.setText("Câu hỏi bảo mật");
        jPanel2.add(lblQuestionSecurity, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, -1, -1));

        lblAnswer.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblAnswer.setForeground(new java.awt.Color(255, 255, 255));
        lblAnswer.setText("Đáp án");
        jPanel2.add(lblAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, -1, -1));

        lblRecover.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        lblRecover.setForeground(new java.awt.Color(255, 255, 255));
        lblRecover.setText("Đăng ký");
        jPanel2.add(lblRecover, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, -1));

        btnHidePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-closed-eye-32.png"))); // NOI18N
        btnHidePass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHidePass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHidePassMouseClicked(evt);
            }
        });
        jPanel2.add(btnHidePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, -1, -1));

        btnShowPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-eye-32.png"))); // NOI18N
        btnShowPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnShowPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnShowPassMouseClicked(evt);
            }
        });
        jPanel2.add(btnShowPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, -1, -1));

        btnShowRePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-eye-32.png"))); // NOI18N
        btnShowRePass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnShowRePass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnShowRePassMouseClicked(evt);
            }
        });
        jPanel2.add(btnShowRePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, -1, -1));

        btnHideRePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-closed-eye-32.png"))); // NOI18N
        btnHideRePass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHideRePass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHideRePassMouseClicked(evt);
            }
        });
        jPanel2.add(btnHideRePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, -1, -1));

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
        jPanel2.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 490, 40));

        txtAnswer.setBackground(new java.awt.Color(102, 102, 255));
        txtAnswer.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        txtAnswer.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtAnswer.setMargin(new java.awt.Insets(3, 6, 3, 6));
        txtAnswer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAnswerFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAnswerFocusLost(evt);
            }
        });
        jPanel2.add(txtAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 570, 490, 40));

        txtRePassword.setBackground(new java.awt.Color(102, 102, 255));
        txtRePassword.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        txtRePassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(txtRePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 490, 40));

        txtPassword.setBackground(new java.awt.Color(102, 102, 255));
        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 490, 40));

        btnSearch.setBackground(new java.awt.Color(255, 51, 51));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Đăng ký");
        btnSearch.setBorder(null);
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });
        jPanel2.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 100, 40));

        btnRecover.setBackground(new java.awt.Color(255, 51, 51));
        btnRecover.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnRecover.setForeground(new java.awt.Color(255, 255, 255));
        btnRecover.setText("Đăng ký");
        btnRecover.setBorder(null);
        btnRecover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRecover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRecoverMouseClicked(evt);
            }
        });
        jPanel2.add(btnRecover, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 660, 320, 70));

        btnSignIn.setBackground(new java.awt.Color(0, 0, 204));
        btnSignIn.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnSignIn.setForeground(new java.awt.Color(255, 255, 255));
        btnSignIn.setText("Đăng nhập");
        btnSignIn.setBorder(null);
        btnSignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSignInMouseClicked(evt);
            }
        });
        jPanel2.add(btnSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 660, 320, 70));

        txtQuestion.setEditable(false);
        txtQuestion.setBackground(new java.awt.Color(102, 102, 255));
        txtQuestion.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        txtQuestion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtQuestion.setMargin(new java.awt.Insets(3, 6, 3, 6));
        jPanel2.add(txtQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 490, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 750, 750));

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

    private void txtAnswerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAnswerFocusGained
        String answer = txtAnswer.getText();
        if (answer.equals(AccountStringConstant.ACCOUNT_INPUT_ANSWER)) {
            txtAnswer.setText(GeneralStringConstant.GENERAL_EMPTY);
        }
    }//GEN-LAST:event_txtAnswerFocusGained

    private void txtAnswerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAnswerFocusLost
        String answer = txtAnswer.getText();
        if (answer.equals(GeneralStringConstant.GENERAL_EMPTY)) {
            txtAnswer.setText(AccountStringConstant.ACCOUNT_INPUT_ANSWER);
        }
    }//GEN-LAST:event_txtAnswerFocusLost

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

    private void btnShowRePassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShowRePassMouseClicked
        // TODO add your handling code here:
        btnShowRePass.setVisible(false);
        btnHideRePass.setVisible(true);

        txtRePassword.setEchoChar('*');
    }//GEN-LAST:event_btnShowRePassMouseClicked

    private void btnHideRePassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHideRePassMouseClicked
        // TODO add your handling code here:
        btnShowRePass.setVisible(true);
        btnHideRePass.setVisible(false);

        txtRePassword.setEchoChar((char) 0);
    }//GEN-LAST:event_btnHideRePassMouseClicked

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        // TODO add your handling code here:
        searchAccount();

    }//GEN-LAST:event_btnSearchMouseClicked

    private void btnRecoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRecoverMouseClicked
        // TODO add your handling code here:
        if (validateInput()) {
            changePwd();
        }
    }//GEN-LAST:event_btnRecoverMouseClicked

    private void btnSignInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignInMouseClicked
        // TODO add your handling code here:
        SigninPage signIn = new SigninPage();
        signIn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSignInMouseClicked

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
            java.util.logging.Logger.getLogger(ForgotPwdPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPwdPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPwdPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPwdPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPwdPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnHidePass;
    private javax.swing.JLabel btnHideRePass;
    private javax.swing.JButton btnRecover;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel btnShowPass;
    private javax.swing.JLabel btnShowRePass;
    private javax.swing.JButton btnSignIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAnswer;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblQuestionSecurity;
    private javax.swing.JLabel lblRePassword;
    private javax.swing.JLabel lblRecover;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtAnswer;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtQuestion;
    private javax.swing.JPasswordField txtRePassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

}
