/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.Frame;

import Base.DIContainer;
import DTO.AccountDTO;
import Validate.OnlyNum;
import Validate.Validator;
import constant.AccountStringConstant;
import constant.AuthenStringConstant;
import constant.GeneralStringConstant;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.text.PlainDocument;

/**
 * This class is used for render Sign up Page
 *
 * @author Nguyễn Duy Phúc
 */
public class SignupPage extends javax.swing.JFrame {

    /**
     * Creates new form SingupPage
     */
    public SignupPage() {
        initComponents();
        initUI();
    }

    /**
     * Add some first UI
     */
    private void initUI() {
        //Place hoder for input field
        txtUsername.setText(AccountStringConstant.ACCOUNT_INPUT_USERNAME);
        txtEmail.setText(AccountStringConstant.ACCOUNT_INPUT_EMAIL);
        txtName.setText(AccountStringConstant.ACCOUNT_INPUT_NAME);
        txtAnswer.setText(AccountStringConstant.ACCOUNT_INPUT_ANSWER);
        txtPassword.setEchoChar('*');
        txtRePassword.setEchoChar('*');

        //Content of label
        lblUsername.setText(AccountStringConstant.ACCOUNT_USERNAME);
        lblPassword.setText(AccountStringConstant.ACCOUNT_PWD);
        lblRePassword.setText(AccountStringConstant.ACCOUNT_RE_PWD);
        lblName.setText(AccountStringConstant.ACCOUNT_NAME);
        lblContact.setText(AccountStringConstant.ACCOUNT_CONTACT);
        lblEmail.setText(AccountStringConstant.ACCOUNT_EMAIL);
        lblQuestionSecurity.setText(AccountStringConstant.ACCOUNT_QUESTION);
        lblAnswer.setText(AccountStringConstant.ACCOUNT_ANSWER);
        lblSignUp.setText(AuthenStringConstant.SIGN_UP);

        //content of button
        btnSignIn.setText(AuthenStringConstant.SIGN_IN);
        btnSignUp.setText(AuthenStringConstant.SIGN_UP);

        //State of eye
        btnShowPass.setVisible(false);
        btnHidePass.setVisible(true);
        btnShowRePass.setVisible(false);
        btnHideRePass.setVisible(true);

        PlainDocument doc = (PlainDocument) txtContact.getDocument();
        doc.setDocumentFilter(new OnlyNum());
        cmbQuestion.setModel(new DefaultComboBoxModel(AuthenStringConstant.QUESTIONS));
    }

    /**
     * method to insert values into account table
     */
    public void signUp() {
        //Get string from UI
        String name = txtName.getText();
        String username = txtUsername.getText();
        String pwd = new String(txtPassword.getPassword());
        String email = txtEmail.getText();
        String contact = txtContact.getText();
        String question = (String) cmbQuestion.getSelectedItem();
        String answer = txtAnswer.getText();

        //Get account and move to Sign in page
        AccountDTO account = new AccountDTO(name, username, pwd, email, contact, question, answer);
        boolean result = DIContainer.getAccountDAO().insert(account);
        if (result) {
            JOptionPane.showMessageDialog(this, AuthenStringConstant.SIGN_UP_SUCCESS);
            SigninPage signIn = new SigninPage();
            signIn.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, AuthenStringConstant.SIGN_UP_FAIL);
        }
    }

    /**
     * This function use for validate input of user
     *
     * @return resutlt of validate
     */
    public boolean validateInput() {
        //Get string from UI
        String name = txtName.getText();
        String username = txtUsername.getText();
        String pwd = new String(txtPassword.getPassword());
        String repwd = new String(txtRePassword.getPassword());
        String email = txtEmail.getText();
        String contact = txtContact.getText();
        String answer = txtAnswer.getText();
        int idxQuestion = cmbQuestion.getSelectedIndex();

        //Validate input
        if (Validator.inputString("[a-zA-Z]+([ '-][a-zA-Z]+)*", name) || name.equals(AccountStringConstant.ACCOUNT_INPUT_NAME)) {
            JOptionPane.showMessageDialog(this, AccountStringConstant.ACCOUNT_ERROR_NAME);
            return false;
        }
        if (Validator.inputString("[a-zA-Z0-9!@#$%^&*\\.<>?\\-_+/]+", username) || username.equals(AccountStringConstant.ACCOUNT_INPUT_USERNAME)) {
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
        if (Validator.inputString("^[a-zA-Z0-9\\.]+@.+\\..+$", email) || email.equals(AccountStringConstant.ACCOUNT_INPUT_EMAIL)) {
            JOptionPane.showMessageDialog(this, AccountStringConstant.ACCOUNT_ERROR_EMAIL);
            return false;
        }
        if (Validator.inputString("^[0-9]{10}$", contact)) {
            JOptionPane.showMessageDialog(this, AccountStringConstant.ACCOUNT_ERROR_CONTACT);
            return false;
        }
        if (idxQuestion < 0) {
            JOptionPane.showMessageDialog(this, AccountStringConstant.ACCOUNT_ERROR_QUESTION);
            return false;
        }
        if (answer.equals("") || answer.equals(AccountStringConstant.ACCOUNT_INPUT_ANSWER)) {
            JOptionPane.showMessageDialog(this, AccountStringConstant.ACCOUNT_ERROR_ANSWER);
            return false;
        }
        return true;
    }

    /**
     * Check this username is exist or not
     *
     * @return Result of validate
     */
    public boolean checkExistUsername() {
        String username = txtUsername.getText();
        boolean isExist;

        //Validate usename
        if (!username.equals("") && DIContainer.getAccountDAO().isExistUsername(username)) {
            JOptionPane.showMessageDialog(this, AccountStringConstant.ACCOUNT_EXIST_USERNAME);
            isExist = true;
        } else {
            isExist = false;
        }
        return isExist;
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
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblContact = new javax.swing.JLabel();
        lblRePassword = new javax.swing.JLabel();
        lblQuestionSecurity = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblAnswer = new javax.swing.JLabel();
        lblSignUp = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        txtAnswer = new javax.swing.JTextField();
        cmbQuestion = new javax.swing.JComboBox<>();
        txtRePassword = new javax.swing.JPasswordField();
        txtPassword = new javax.swing.JPasswordField();
        btnHidePass = new javax.swing.JLabel();
        btnShowPass = new javax.swing.JLabel();
        btnShowRePass = new javax.swing.JLabel();
        btnHideRePass = new javax.swing.JLabel();
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

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tạo tài khoản mới");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Secure_50px.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 50, 50));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Secured_Letter_50px.png"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 50, 50));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Google_Mobile_50px.png"))); // NOI18N
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 50, 50));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Account_50px.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 50, 50));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Secure_50px.png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 50, 50));

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

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email");
        jPanel2.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        lblContact.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblContact.setForeground(new java.awt.Color(255, 255, 255));
        lblContact.setText("Số điện thoại");
        jPanel2.add(lblContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, -1));

        lblRePassword.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblRePassword.setForeground(new java.awt.Color(255, 255, 255));
        lblRePassword.setText("Mật khẩu");
        jPanel2.add(lblRePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, -1, -1));

        lblQuestionSecurity.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblQuestionSecurity.setForeground(new java.awt.Color(255, 255, 255));
        lblQuestionSecurity.setText("Câu hỏi bảo mật");
        jPanel2.add(lblQuestionSecurity, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, -1, -1));

        lblName.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Chủ tài khoản");
        jPanel2.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, -1, -1));

        lblAnswer.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblAnswer.setForeground(new java.awt.Color(255, 255, 255));
        lblAnswer.setText("Đáp án");
        jPanel2.add(lblAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, -1, -1));

        lblSignUp.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        lblSignUp.setForeground(new java.awt.Color(255, 255, 255));
        lblSignUp.setText("Đăng ký");
        jPanel2.add(lblSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

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
        jPanel2.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 230, 40));

        txtName.setBackground(new java.awt.Color(102, 102, 255));
        txtName.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        txtName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtName.setMargin(new java.awt.Insets(3, 6, 3, 6));
        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameFocusLost(evt);
            }
        });
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 230, 40));

        txtEmail.setBackground(new java.awt.Color(102, 102, 255));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtEmail.setMargin(new java.awt.Insets(3, 6, 3, 6));
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 230, 40));

        txtContact.setBackground(new java.awt.Color(102, 102, 255));
        txtContact.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        txtContact.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtContact.setMargin(new java.awt.Insets(3, 6, 3, 6));
        jPanel2.add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 230, 40));

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
        jPanel2.add(txtAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 570, 590, 40));

        cmbQuestion.setBackground(new java.awt.Color(102, 102, 255));
        cmbQuestion.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        cmbQuestion.setBorder(null);
        jPanel2.add(cmbQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 590, 40));

        txtRePassword.setBackground(new java.awt.Color(102, 102, 255));
        txtRePassword.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        txtRePassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(txtRePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 230, 40));

        txtPassword.setBackground(new java.awt.Color(102, 102, 255));
        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 230, 40));

        btnHidePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-closed-eye-32.png"))); // NOI18N
        btnHidePass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHidePass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHidePassMouseClicked(evt);
            }
        });
        jPanel2.add(btnHidePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, -1));

        btnShowPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-eye-32.png"))); // NOI18N
        btnShowPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnShowPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnShowPassMouseClicked(evt);
            }
        });
        jPanel2.add(btnShowPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, -1));

        btnShowRePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-eye-32.png"))); // NOI18N
        btnShowRePass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnShowRePass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnShowRePassMouseClicked(evt);
            }
        });
        jPanel2.add(btnShowRePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, -1, -1));

        btnHideRePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-closed-eye-32.png"))); // NOI18N
        btnHideRePass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHideRePass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHideRePassMouseClicked(evt);
            }
        });
        jPanel2.add(btnHideRePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, -1, -1));

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
        jPanel2.add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 660, 320, 70));

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
        checkExistUsername();
    }//GEN-LAST:event_txtUsernameFocusLost

    private void txtNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusGained
        // TODO add your handling code here:
        String name = txtName.getText();
        if (name.equals(AccountStringConstant.ACCOUNT_INPUT_NAME)) {
            txtName.setText(GeneralStringConstant.GENERAL_EMPTY);
        }
    }//GEN-LAST:event_txtNameFocusGained

    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost
        // TODO add your handling code here:
        String name = txtName.getText();
        if (name.equals(GeneralStringConstant.GENERAL_EMPTY)) {
            txtName.setText(AccountStringConstant.ACCOUNT_INPUT_NAME);
        }
    }//GEN-LAST:event_txtNameFocusLost

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        // TODO add your handling code here:
        String email = txtEmail.getText();
        if (email.equals(AccountStringConstant.ACCOUNT_INPUT_EMAIL)) {
            txtEmail.setText(GeneralStringConstant.GENERAL_EMPTY);
        }
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        // TODO add your handling code here:
//        String email = txtEmail.getText();
//        if (email.equals(GeneralStringConstant.GENERAL_EMPTY)) {
//            txtEmail.setText(AccountStringConstant.ACCOUNT_INPUT_EMAIL);
//        }
    }//GEN-LAST:event_txtEmailFocusLost

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

    private void btnSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignUpMouseClicked
        // TODO add your handling code here:
        if (validateInput() && !checkExistUsername()) {
            signUp();
        }
    }//GEN-LAST:event_btnSignUpMouseClicked

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
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignupPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnHidePass;
    private javax.swing.JLabel btnHideRePass;
    private javax.swing.JLabel btnShowPass;
    private javax.swing.JLabel btnShowRePass;
    private javax.swing.JButton btnSignIn;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JComboBox<String> cmbQuestion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAnswer;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblQuestionSecurity;
    private javax.swing.JLabel lblRePassword;
    private javax.swing.JLabel lblSignUp;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtAnswer;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtRePassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
