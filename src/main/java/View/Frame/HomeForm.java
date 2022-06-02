/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.Frame;

import Adapter.PanelButtonMouseAdapter;
import View.Panel.HomePanel;
import View.Panel.ManageBinPanel;
import View.Panel.ManageBooksPanel;
import View.Panel.ManagePublisherPanel;
import View.Panel.ManageReaderPanel;
import constant.GeneralStringConstant;
import constant.TitleStringConstant;
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
        jPanelLMSDashBoard = new javax.swing.JPanel();
        jLabelLMSDashBoard = new javax.swing.JLabel();
        jPanelManageBook = new javax.swing.JPanel();
        jLabelManageBook = new javax.swing.JLabel();
        jPanelManageReader = new javax.swing.JPanel();
        jLabelManageReader = new javax.swing.JLabel();
        jPanelIsueBook = new javax.swing.JPanel();
        jLabelIsueBook = new javax.swing.JLabel();
        jPanelReturnBook = new javax.swing.JPanel();
        jLabelReturnBook = new javax.swing.JLabel();
        jPanelViewRecord = new javax.swing.JPanel();
        jLabelViewRecord = new javax.swing.JLabel();
        jPanelPublisherList = new javax.swing.JPanel();
        jLabelPublisherList = new javax.swing.JLabel();
        jPanelBin = new javax.swing.JPanel();
        jLabelBin = new javax.swing.JLabel();
        jPanelViewIssuedBook = new javax.swing.JPanel();
        jLabelViewIssuedBook = new javax.swing.JLabel();
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
        setPreferredSize(new java.awt.Dimension(1420, 680));
        setResizable(false);

        jPanelMenuBar.setBackground(new java.awt.Color(51, 51, 51));
        jPanelMenuBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelLogout.setBackground(new java.awt.Color(102, 102, 255));
        jPanelLogout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogOut.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        jLabelLogOut.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLogOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogOut.setText("   Logout");
        jLabelLogOut.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabelLogOut.setIconTextGap(5);
        jPanelLogout.add(jLabelLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 140, 60));

        jPanelMenuBar.add(jPanelLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 260, 70));

        jPanelLMSDashBoard.setBackground(new java.awt.Color(51, 51, 51));
        jPanelLMSDashBoard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLMSDashBoard.setBackground(new java.awt.Color(153, 153, 255));
        jLabelLMSDashBoard.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabelLMSDashBoard.setForeground(new java.awt.Color(153, 153, 153));
        jLabelLMSDashBoard.setText("   LMS Dashboard");
        jPanelLMSDashBoard.add(jLabelLMSDashBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 60));

        jPanelMenuBar.add(jPanelLMSDashBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 60));

        jPanelManageBook.setBackground(new java.awt.Color(51, 51, 51));
        jPanelManageBook.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelManageBook.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabelManageBook.setForeground(new java.awt.Color(153, 153, 153));
        jLabelManageBook.setText("Danh sách sách");
        jLabelManageBook.setToolTipText("");
        jPanelManageBook.add(jLabelManageBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 40));

        jPanelMenuBar.add(jPanelManageBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 260, 60));

        jPanelManageReader.setBackground(new java.awt.Color(51, 51, 51));
        jPanelManageReader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelManageReader.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabelManageReader.setForeground(new java.awt.Color(153, 153, 153));
        jLabelManageReader.setText("   Manage Reader");
        jPanelManageReader.add(jLabelManageReader, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 210, 60));

        jPanelMenuBar.add(jPanelManageReader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 260, 60));

        jPanelIsueBook.setBackground(new java.awt.Color(51, 51, 51));
        jPanelIsueBook.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelIsueBook.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabelIsueBook.setForeground(new java.awt.Color(153, 153, 153));
        jLabelIsueBook.setText("   Issue Book");
        jPanelIsueBook.add(jLabelIsueBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 210, 60));

        jPanelMenuBar.add(jPanelIsueBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 260, 60));

        jPanelReturnBook.setBackground(new java.awt.Color(51, 51, 51));
        jPanelReturnBook.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelReturnBook.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabelReturnBook.setForeground(new java.awt.Color(153, 153, 153));
        jLabelReturnBook.setText("   Return book");
        jPanelReturnBook.add(jLabelReturnBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 210, 60));

        jPanelMenuBar.add(jPanelReturnBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 260, 60));

        jPanelViewRecord.setBackground(new java.awt.Color(51, 51, 51));
        jPanelViewRecord.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelViewRecord.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabelViewRecord.setForeground(new java.awt.Color(153, 153, 153));
        jLabelViewRecord.setText("   View Records");
        jPanelViewRecord.add(jLabelViewRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 210, 60));

        jPanelMenuBar.add(jPanelViewRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 260, 60));

        jPanelPublisherList.setBackground(new java.awt.Color(51, 51, 51));
        jPanelPublisherList.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelPublisherList.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabelPublisherList.setForeground(new java.awt.Color(153, 153, 153));
        jLabelPublisherList.setText("Danh sách nhà xuất bản");
        jPanelPublisherList.add(jLabelPublisherList, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, 60));

        jPanelMenuBar.add(jPanelPublisherList, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 260, 60));

        jPanelBin.setBackground(new java.awt.Color(51, 51, 51));
        jPanelBin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelBin.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabelBin.setForeground(new java.awt.Color(153, 153, 153));
        jLabelBin.setText("Thùng rác");
        jPanelBin.add(jLabelBin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, 60));

        jPanelMenuBar.add(jPanelBin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 260, 60));

        jPanelViewIssuedBook.setBackground(new java.awt.Color(51, 51, 51));
        jPanelViewIssuedBook.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelViewIssuedBook.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabelViewIssuedBook.setForeground(new java.awt.Color(153, 153, 153));
        jLabelViewIssuedBook.setText("   View Issued Books ");
        jPanelViewIssuedBook.add(jLabelViewIssuedBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, 60));

        jPanelMenuBar.add(jPanelViewIssuedBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 260, 60));

        jPanelTitle.setBackground(new java.awt.Color(102, 102, 255));
        jPanelTitle.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 20)); // NOI18N
        jPanelTitle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelTitle.add(jLabelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

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

        jPanelTitle.add(jPanelIndication, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 40));

        jLabelProjectName.setBackground(new java.awt.Color(255, 255, 255));
        jLabelProjectName.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 25)); // NOI18N
        jLabelProjectName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelProjectName.setText("Library Management System");
        jPanelTitle.add(jLabelProjectName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 300, -1));

        jLabelGreeting.setBackground(new java.awt.Color(255, 255, 255));
        jLabelGreeting.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 20)); // NOI18N
        jLabelGreeting.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGreeting.setText("Welcome, Admin");
        jPanelTitle.add(jLabelGreeting, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 10, 160, 30));

        jPanelExit.setBackground(new java.awt.Color(102, 102, 255));

        jLabelExit.setBackground(new java.awt.Color(255, 255, 255));
        jLabelExit.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 48)); // NOI18N
        jLabelExit.setForeground(new java.awt.Color(255, 255, 255));
        jLabelExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelExit.setText("X");
        jLabelExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelExitLayout = new javax.swing.GroupLayout(jPanelExit);
        jPanelExit.setLayout(jPanelExitLayout);
        jPanelExitLayout.setHorizontalGroup(
            jPanelExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelExitLayout.setVerticalGroup(
            jPanelExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );

        jPanelTitle.add(jPanelExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 0, 40, 50));

        jPanelMainContent.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMainContent.setPreferredSize(new java.awt.Dimension(1170, 630));

        javax.swing.GroupLayout jPanelMainContentLayout = new javax.swing.GroupLayout(jPanelMainContent);
        jPanelMainContent.setLayout(jPanelMainContentLayout);
        jPanelMainContentLayout.setHorizontalGroup(
            jPanelMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1177, Short.MAX_VALUE)
        );
        jPanelMainContentLayout.setVerticalGroup(
            jPanelMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 1430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelMenuBar, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelMainContent, javax.swing.GroupLayout.PREFERRED_SIZE, 1177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelMenuBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelMainContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
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
    
    private void setNavigationTitle(){
        jLabelManageBook.setText(TitleStringConstant.MANAGE_BOOK);
        jLabelPublisherList.setText(TitleStringConstant.MANAGE_PUBLISHER);
    }

    private void myInitComponents() {
        setNavigationTitle();
        
        jPanelExit.addMouseListener(new PanelButtonMouseAdapter(jPanelExit, -1) {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (JOptionPane.showConfirmDialog(null, GeneralStringConstant.GENERAL_EXIT, GeneralStringConstant.GENERAL_CONFIRMATION, JOptionPane.YES_NO_OPTION) == 0) {
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
                panelManageBooks.resetData();
                clickedMenu(panelManageBooks);
            }
        });

        jPanelManageReader.addMouseListener(new PanelButtonMouseAdapter(jPanelManageReader, 0) {
            @Override
            public void mouseClicked(MouseEvent e) {
                clickedMenu(panelManageReader);
            }
        });
        
        jPanelPublisherList.addMouseListener(new PanelButtonMouseAdapter(jPanelPublisherList, 0) {
             @Override
            public void mouseClicked(MouseEvent e) {
                panelManagePublishers.resetData();
                clickedMenu(panelManagePublishers);
            }
        });

        jPanelIsueBook.addMouseListener(new PanelButtonMouseAdapter(jPanelIsueBook, 0));

        jPanelReturnBook.addMouseListener(new PanelButtonMouseAdapter(jPanelReturnBook, 0));

        jPanelViewRecord.addMouseListener(new PanelButtonMouseAdapter(jPanelViewRecord, 0));

        jPanelViewIssuedBook.addMouseListener(new PanelButtonMouseAdapter(jPanelViewIssuedBook, 0));

        jPanelBin.addMouseListener(new PanelButtonMouseAdapter(jPanelBin, 0) {
            @Override
            public void mouseClicked(MouseEvent e) {
                panelManageBin.myInitUI();
                clickedMenu(panelManageBin);
            }
        });


        jPanelLogout.addMouseListener(new PanelButtonMouseAdapter(jPanelLogout, -1));

    }

    private void addPanelToHomePage() {

        panelHome = new HomePanel();
        panelManageBooks = new ManageBooksPanel();
        panelManagePublishers = new ManagePublisherPanel();
        panelManageReader = new ManageReaderPanel();
        panelManageBin = new ManageBinPanel();

        jPanelMainContent.add(panelHome);
        jPanelMainContent.add(panelManageBooks);
        jPanelMainContent.add(panelManagePublishers);
        jPanelMainContent.add(panelManageReader);
        jPanelMainContent.add(panelManageBin);

        clickedMenu(panelHome);
    }

    private void clickedMenu(JPanel panel) {
        panelHome.setVisible(false);
        panelManageBooks.setVisible(false);
        panelManagePublishers.setVisible(false);
        panelManageReader.setVisible(false);
        panelManageBin.setVisible(false);

        panel.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelBin;
    private javax.swing.JLabel jLabelExit;
    private javax.swing.JLabel jLabelGreeting;
    private javax.swing.JLabel jLabelIsueBook;
    private javax.swing.JLabel jLabelLMSDashBoard;
    private javax.swing.JLabel jLabelLogOut;
    private javax.swing.JLabel jLabelManageBook;
    private javax.swing.JLabel jLabelManageReader;
    private javax.swing.JLabel jLabelMenu;
    private javax.swing.JLabel jLabelProjectName;
    private javax.swing.JLabel jLabelPublisherList;
    private javax.swing.JLabel jLabelReturnBook;
    private javax.swing.JLabel jLabelViewIssuedBook;
    private javax.swing.JLabel jLabelViewRecord;
    private javax.swing.JPanel jPanelBin;
    private javax.swing.JPanel jPanelExit;
    private javax.swing.JPanel jPanelIndication;
    private javax.swing.JPanel jPanelIsueBook;
    private javax.swing.JPanel jPanelLMSDashBoard;
    private javax.swing.JPanel jPanelLogout;
    private javax.swing.JPanel jPanelMainContent;
    private javax.swing.JPanel jPanelManageBook;
    private javax.swing.JPanel jPanelManageReader;
    private javax.swing.JPanel jPanelMenuBar;
    private javax.swing.JPanel jPanelPublisherList;
    private javax.swing.JPanel jPanelReturnBook;
    private javax.swing.JPanel jPanelTitle;
    private javax.swing.JPanel jPanelViewIssuedBook;
    private javax.swing.JPanel jPanelViewRecord;
    // End of variables declaration//GEN-END:variables

    private HomePanel panelHome;
    private ManageBooksPanel panelManageBooks;
    private ManagePublisherPanel panelManagePublishers;
    private ManageReaderPanel panelManageReader;
    private ManageBinPanel panelManageBin;
}
