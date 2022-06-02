/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.Frame;

import Adapter.PanelButtonMouseAdapter;
import DTO.AccountDTO;
import View.Panel.AuthorListPanel;
import View.Panel.HomePanel;
import View.Panel.ManageAccount;
import View.Panel.ManageBooksPanel;
import View.Panel.ManageReaderPanel;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class HomeForm extends javax.swing.JFrame {

    /**
     * Creates new form HomeForm
     */
    public HomeForm() {
        initComponents();
        myInitComponents();
        addPanelToHomePage();
        this.setLocationRelativeTo(null);
    }

    public HomeForm(AccountDTO account) {
        initComponents();
        myInitComponents();
        addPanelToHomePage();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMenuBar = new javax.swing.JPanel();
        jPanelLogout = new javax.swing.JPanel();
        jLabelLogOut = new javax.swing.JLabel();
        jPanelManageReader = new javax.swing.JPanel();
        jLabelManageReader = new javax.swing.JLabel();
        jPanelManageReader1 = new javax.swing.JPanel();
        jLabelManageReader1 = new javax.swing.JLabel();
        jPanelIsueBook = new javax.swing.JPanel();
        jLabelIsueBook = new javax.swing.JLabel();
        jPanelReturnBook = new javax.swing.JPanel();
        jLabelReturnBook = new javax.swing.JLabel();
        jPanelViewRecord = new javax.swing.JPanel();
        jLabelViewRecord = new javax.swing.JLabel();
        jPanelViewIssuedBook = new javax.swing.JPanel();
        jLabelViewIssuedBook = new javax.swing.JLabel();
        jPanelAuthorList = new javax.swing.JPanel();
        jLabelAuthorList = new javax.swing.JLabel();
        jPanelDefauledList = new javax.swing.JPanel();
        jLabelDefauledList = new javax.swing.JLabel();
        jPanelManageAccount = new javax.swing.JPanel();
        jLabelManageReader2 = new javax.swing.JLabel();
        jPanelManageReader3 = new javax.swing.JPanel();
        jLabelManageReader3 = new javax.swing.JLabel();
        jPanelLMSDashBoard = new javax.swing.JPanel();
        jLabelLMSDashBoard = new javax.swing.JLabel();
        jPanelManageBook = new javax.swing.JPanel();
        jLabelManageBook1 = new javax.swing.JLabel();
        jLabelManageBook = new javax.swing.JLabel();
        jPanelTitle = new javax.swing.JPanel();
        jLabelMenu = new javax.swing.JLabel();
        jPanelIndication = new javax.swing.JPanel();
        jLabelProjectName = new javax.swing.JLabel();
        jLabelGreeting = new javax.swing.JLabel();
        jPanelExit = new javax.swing.JPanel();
        jLabelExit = new javax.swing.JLabel();
        jPanelMainContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMenuBar.setBackground(new java.awt.Color(51, 51, 51));
        jPanelMenuBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelLogout.setBackground(new java.awt.Color(102, 102, 255));
        jPanelLogout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogOut.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabelLogOut.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLogOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Exit_26px_2.png"))); // NOI18N
        jLabelLogOut.setText("   Logout");
        jLabelLogOut.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabelLogOut.setIconTextGap(5);
        jPanelLogout.add(jLabelLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 140, 60));

        jPanelMenuBar.add(jPanelLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 710, 280, 60));

        jPanelManageReader.setBackground(new java.awt.Color(51, 51, 51));
        jPanelManageReader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelManageReader.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabelManageReader.setForeground(new java.awt.Color(255, 255, 255));
        jLabelManageReader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Read_Online_26px.png"))); // NOI18N
        jLabelManageReader.setText("   Manage Reader");
        jPanelManageReader.add(jLabelManageReader, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 210, 60));

        jPanelManageReader1.setBackground(new java.awt.Color(51, 51, 51));
        jPanelManageReader1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelManageReader1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabelManageReader1.setForeground(new java.awt.Color(153, 153, 153));
        jLabelManageReader1.setText("   Manage Reader");
        jPanelManageReader1.add(jLabelManageReader1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 210, 60));

        jPanelManageReader.add(jPanelManageReader1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 250, 60));

        jPanelMenuBar.add(jPanelManageReader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 280, 60));

        jPanelIsueBook.setBackground(new java.awt.Color(51, 51, 51));
        jPanelIsueBook.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelIsueBook.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabelIsueBook.setForeground(new java.awt.Color(255, 255, 255));
        jLabelIsueBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Sell_26px.png"))); // NOI18N
        jLabelIsueBook.setText("   Issue Book");
        jPanelIsueBook.add(jLabelIsueBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 210, 60));

        jPanelMenuBar.add(jPanelIsueBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 280, 60));

        jPanelReturnBook.setBackground(new java.awt.Color(51, 51, 51));
        jPanelReturnBook.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelReturnBook.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabelReturnBook.setForeground(new java.awt.Color(255, 255, 255));
        jLabelReturnBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Return_Purchase_26px.png"))); // NOI18N
        jLabelReturnBook.setText("   Return book");
        jPanelReturnBook.add(jLabelReturnBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 210, 60));

        jPanelMenuBar.add(jPanelReturnBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 280, 60));

        jPanelViewRecord.setBackground(new java.awt.Color(51, 51, 51));
        jPanelViewRecord.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelViewRecord.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabelViewRecord.setForeground(new java.awt.Color(255, 255, 255));
        jLabelViewRecord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_View_Details_26px.png"))); // NOI18N
        jLabelViewRecord.setText("   View Records");
        jPanelViewRecord.add(jLabelViewRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 210, 60));

        jPanelMenuBar.add(jPanelViewRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 280, 60));

        jPanelViewIssuedBook.setBackground(new java.awt.Color(51, 51, 51));
        jPanelViewIssuedBook.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelViewIssuedBook.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabelViewIssuedBook.setForeground(new java.awt.Color(255, 255, 255));
        jLabelViewIssuedBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Books_26px.png"))); // NOI18N
        jLabelViewIssuedBook.setText("   View Issued Books ");
        jPanelViewIssuedBook.add(jLabelViewIssuedBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 220, 60));

        jPanelMenuBar.add(jPanelViewIssuedBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 280, 60));

        jPanelAuthorList.setBackground(new java.awt.Color(51, 51, 51));
        jPanelAuthorList.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelAuthorList.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabelAuthorList.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAuthorList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Book_26px.png"))); // NOI18N
        jLabelAuthorList.setText("   Author list");
        jPanelAuthorList.add(jLabelAuthorList, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 220, 60));

        jPanelMenuBar.add(jPanelAuthorList, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 280, 60));

        jPanelDefauledList.setBackground(new java.awt.Color(51, 51, 51));
        jPanelDefauledList.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelDefauledList.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabelDefauledList.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDefauledList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Conference_26px.png"))); // NOI18N
        jLabelDefauledList.setText("   Defaulter list");
        jPanelDefauledList.add(jLabelDefauledList, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 220, 60));

        jPanelMenuBar.add(jPanelDefauledList, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 280, 60));

        jPanelManageAccount.setBackground(new java.awt.Color(51, 51, 51));
        jPanelManageAccount.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelManageReader2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabelManageReader2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelManageReader2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Read_Online_26px.png"))); // NOI18N
        jLabelManageReader2.setText("   Manage Account");
        jPanelManageAccount.add(jLabelManageReader2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 210, 60));

        jPanelManageReader3.setBackground(new java.awt.Color(51, 51, 51));
        jPanelManageReader3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelManageReader3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabelManageReader3.setForeground(new java.awt.Color(153, 153, 153));
        jLabelManageReader3.setText("   Manage Reader");
        jPanelManageReader3.add(jLabelManageReader3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 210, 60));

        jPanelManageAccount.add(jPanelManageReader3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 250, 60));

        jPanelMenuBar.add(jPanelManageAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 280, 60));

        jPanelLMSDashBoard.setBackground(new java.awt.Color(255, 51, 51));
        jPanelLMSDashBoard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLMSDashBoard.setBackground(new java.awt.Color(153, 153, 255));
        jLabelLMSDashBoard.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabelLMSDashBoard.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLMSDashBoard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Library_26px_1.png"))); // NOI18N
        jLabelLMSDashBoard.setText("   LMS Dashboard");
        jPanelLMSDashBoard.add(jLabelLMSDashBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 240, 60));

        jPanelMenuBar.add(jPanelLMSDashBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 280, 60));

        jPanelManageBook.setBackground(new java.awt.Color(51, 51, 51));
        jPanelManageBook.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelManageBook1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabelManageBook1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelManageBook1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Book_26px.png"))); // NOI18N
        jLabelManageBook1.setText("   Manage Books");
        jPanelManageBook.add(jLabelManageBook1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 200, 60));

        jPanelMenuBar.add(jPanelManageBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 280, 60));

        jLabelManageBook.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabelManageBook.setForeground(new java.awt.Color(255, 255, 255));
        jLabelManageBook.setText("Tính năng");
        jPanelMenuBar.add(jLabelManageBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 200, 60));

        getContentPane().add(jPanelMenuBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 52, -1, 970));

        jPanelTitle.setBackground(new java.awt.Color(102, 102, 255));
        jPanelTitle.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 20)); // NOI18N
        jPanelTitle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_menu_48px_1.png"))); // NOI18N
        jPanelTitle.add(jLabelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jPanelIndication.setBackground(new java.awt.Color(51, 51, 51));
        jPanelIndication.setPreferredSize(new java.awt.Dimension(5, 0));

        javax.swing.GroupLayout jPanelIndicationLayout = new javax.swing.GroupLayout(jPanelIndication);
        jPanelIndication.setLayout(jPanelIndicationLayout);
        jPanelIndicationLayout.setHorizontalGroup(
            jPanelIndicationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        jPanelIndicationLayout.setVerticalGroup(
            jPanelIndicationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanelTitle.add(jPanelIndication, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 50));

        jLabelProjectName.setBackground(new java.awt.Color(255, 255, 255));
        jLabelProjectName.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 25)); // NOI18N
        jLabelProjectName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelProjectName.setText("Library Management System");
        jPanelTitle.add(jLabelProjectName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 300, -1));

        jLabelGreeting.setBackground(new java.awt.Color(255, 255, 255));
        jLabelGreeting.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 20)); // NOI18N
        jLabelGreeting.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGreeting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/male_user_50px.png"))); // NOI18N
        jLabelGreeting.setText("Welcome, Admin");
        jPanelTitle.add(jLabelGreeting, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 0, 220, 50));

        jPanelExit.setBackground(new java.awt.Color(102, 102, 255));
        jPanelExit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelExit.setBackground(new java.awt.Color(255, 255, 255));
        jLabelExit.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 30)); // NOI18N
        jLabelExit.setForeground(new java.awt.Color(255, 255, 255));
        jLabelExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelExit.setText("X");
        jLabelExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelExit.add(jLabelExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 36));

        jPanelTitle.add(jPanelExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 0, 40, 50));

        getContentPane().add(jPanelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1530, 50));

        jPanelMainContent.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMainContent.setPreferredSize(new java.awt.Dimension(1170, 630));

        javax.swing.GroupLayout jPanelMainContentLayout = new javax.swing.GroupLayout(jPanelMainContent);
        jPanelMainContent.setLayout(jPanelMainContentLayout);
        jPanelMainContentLayout.setHorizontalGroup(
            jPanelMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1240, Short.MAX_VALUE)
        );
        jPanelMainContentLayout.setVerticalGroup(
            jPanelMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelMainContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 1240, 780));

        setSize(new java.awt.Dimension(1523, 828));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new HomeForm().setVisible(true);
        });
    }

    private void myInitComponents() {
        jPanelExit.addMouseListener(new PanelButtonMouseAdapter(jPanelExit, -1) {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (JOptionPane.showConfirmDialog(null, "Are you want to close this application?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
                    HomeForm.this.dispose();
                }
            }
        });

        jPanelLMSDashBoard.addMouseListener(new PanelButtonMouseAdapter(jPanelLMSDashBoard, 0) {
            @Override
            public void mouseClicked(MouseEvent e) {
                clickedMenu(panelHome);
            }
        });

        jPanelManageBook.addMouseListener(new PanelButtonMouseAdapter(jPanelManageBook, 0) {
            @Override
            public void mouseClicked(MouseEvent e) {
                clickedMenu(panelManageBooks);
            }
        });

        jPanelManageReader.addMouseListener(new PanelButtonMouseAdapter(jPanelManageReader, 0) {
            @Override
            public void mouseClicked(MouseEvent e) {
                clickedMenu(panelManageReader);
            }
        });
        
        jPanelManageAccount.addMouseListener(new PanelButtonMouseAdapter(jPanelManageAccount, 0) {
            @Override
            public void mouseClicked(MouseEvent e) {
                clickedMenu(panelManageAccount);
            }
        });

        jPanelIsueBook.addMouseListener(new PanelButtonMouseAdapter(jPanelIsueBook, 0));

        jPanelReturnBook.addMouseListener(new PanelButtonMouseAdapter(jPanelReturnBook, 0));

        jPanelViewRecord.addMouseListener(new PanelButtonMouseAdapter(jPanelViewRecord, 0));

        jPanelViewIssuedBook.addMouseListener(new PanelButtonMouseAdapter(jPanelViewIssuedBook, 0));

        jPanelDefauledList.addMouseListener(new PanelButtonMouseAdapter(jPanelDefauledList, 0));

        jPanelAuthorList.addMouseListener(new PanelButtonMouseAdapter(jPanelAuthorList, 0) {
            @Override
            public void mouseClicked(MouseEvent e) {
                clickedMenu(panelAuthorList);
            }
        });

        jPanelLogout.addMouseListener(new PanelButtonMouseAdapter(jPanelLogout, -1));

    }

    private void addPanelToHomePage() {

        panelHome = new HomePanel();
        panelManageBooks = new ManageBooksPanel();
        panelManageReader = new ManageReaderPanel();
        panelAuthorList = new AuthorListPanel();
        panelManageAccount = new ManageAccount();

        jPanelMainContent.add(panelHome);
        jPanelMainContent.add(panelManageBooks);
        jPanelMainContent.add(panelManageReader);
        jPanelMainContent.add(panelAuthorList);
        jPanelMainContent.add(panelManageAccount);

        clickedMenu(panelHome);
    }

    private void clickedMenu(JPanel panel) {
        panelHome.setVisible(false);
        panelManageBooks.setVisible(false);
        panelManageReader.setVisible(false);
        panelAuthorList.setVisible(false);
        panelManageAccount.setVisible(false);

        panel.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelAuthorList;
    private javax.swing.JLabel jLabelDefauledList;
    private javax.swing.JLabel jLabelExit;
    private javax.swing.JLabel jLabelGreeting;
    private javax.swing.JLabel jLabelIsueBook;
    private javax.swing.JLabel jLabelLMSDashBoard;
    private javax.swing.JLabel jLabelLogOut;
    private javax.swing.JLabel jLabelManageBook;
    private javax.swing.JLabel jLabelManageBook1;
    private javax.swing.JLabel jLabelManageReader;
    private javax.swing.JLabel jLabelManageReader1;
    private javax.swing.JLabel jLabelManageReader2;
    private javax.swing.JLabel jLabelManageReader3;
    private javax.swing.JLabel jLabelMenu;
    private javax.swing.JLabel jLabelProjectName;
    private javax.swing.JLabel jLabelReturnBook;
    private javax.swing.JLabel jLabelViewIssuedBook;
    private javax.swing.JLabel jLabelViewRecord;
    private javax.swing.JPanel jPanelAuthorList;
    private javax.swing.JPanel jPanelDefauledList;
    private javax.swing.JPanel jPanelExit;
    private javax.swing.JPanel jPanelIndication;
    private javax.swing.JPanel jPanelIsueBook;
    private javax.swing.JPanel jPanelLMSDashBoard;
    private javax.swing.JPanel jPanelLogout;
    private javax.swing.JPanel jPanelMainContent;
    private javax.swing.JPanel jPanelManageAccount;
    private javax.swing.JPanel jPanelManageBook;
    private javax.swing.JPanel jPanelManageReader;
    private javax.swing.JPanel jPanelManageReader1;
    private javax.swing.JPanel jPanelManageReader3;
    private javax.swing.JPanel jPanelMenuBar;
    private javax.swing.JPanel jPanelReturnBook;
    private javax.swing.JPanel jPanelTitle;
    private javax.swing.JPanel jPanelViewIssuedBook;
    private javax.swing.JPanel jPanelViewRecord;
    // End of variables declaration//GEN-END:variables

    private HomePanel panelHome;
    private ManageBooksPanel panelManageBooks;
    private ManageReaderPanel panelManageReader;
    private ManageAccount panelManageAccount;
    private AuthorListPanel panelAuthorList;
}