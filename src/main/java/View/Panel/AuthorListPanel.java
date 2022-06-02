/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.Panel;

/**
 *
 * @author Admin
 */
public class AuthorListPanel extends javax.swing.JPanel {

    /**
     * Creates new form AuthorListPanel
     */
    public AuthorListPanel() {
        initComponents();
        setBounds(0, 0,1170, 630);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAuthor = new javax.swing.JPanel();
        jLabelAuthorTitle = new javax.swing.JLabel();
        jPanelAuthorID = new javax.swing.JPanel();
        jLabelAuthorID = new javax.swing.JLabel();
        jTextFieldAuthorID = new javax.swing.JTextField();
        jPanelAuthorName = new javax.swing.JPanel();
        jLabelAuthorName = new javax.swing.JLabel();
        jTextFieldAuthorName = new javax.swing.JTextField();
        jPanelAuthorPlace = new javax.swing.JPanel();
        jLabelAuthorPlace = new javax.swing.JLabel();
        jTextFieldAuthorPlace = new javax.swing.JTextField();
        jPanelAuthorButton = new javax.swing.JPanel();
        jButtonSave = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jScrollPaneAuthortable = new javax.swing.JScrollPane();
        jTableAuthor = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1170, 630));

        jPanelAuthor.setBackground(new java.awt.Color(255, 255, 255));

        jLabelAuthorTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelAuthorTitle.setText("Author List");

        jPanelAuthorID.setBackground(new java.awt.Color(255, 255, 204));

        jLabelAuthorID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelAuthorID.setText("Author ID");

        jTextFieldAuthorID.setText("Author ID");

        javax.swing.GroupLayout jPanelAuthorIDLayout = new javax.swing.GroupLayout(jPanelAuthorID);
        jPanelAuthorID.setLayout(jPanelAuthorIDLayout);
        jPanelAuthorIDLayout.setHorizontalGroup(
            jPanelAuthorIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAuthorIDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAuthorIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldAuthorID, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAuthorID))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelAuthorIDLayout.setVerticalGroup(
            jPanelAuthorIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAuthorIDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAuthorID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldAuthorID, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelAuthorName.setBackground(new java.awt.Color(255, 255, 204));

        jLabelAuthorName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelAuthorName.setText("Author Name");

        jTextFieldAuthorName.setText("Author Name");

        javax.swing.GroupLayout jPanelAuthorNameLayout = new javax.swing.GroupLayout(jPanelAuthorName);
        jPanelAuthorName.setLayout(jPanelAuthorNameLayout);
        jPanelAuthorNameLayout.setHorizontalGroup(
            jPanelAuthorNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAuthorNameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAuthorNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAuthorName)
                    .addComponent(jTextFieldAuthorName, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelAuthorNameLayout.setVerticalGroup(
            jPanelAuthorNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAuthorNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAuthorName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldAuthorName, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelAuthorPlace.setBackground(new java.awt.Color(255, 255, 204));

        jLabelAuthorPlace.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelAuthorPlace.setText("Author Place");

        jTextFieldAuthorPlace.setText("Author Place");

        javax.swing.GroupLayout jPanelAuthorPlaceLayout = new javax.swing.GroupLayout(jPanelAuthorPlace);
        jPanelAuthorPlace.setLayout(jPanelAuthorPlaceLayout);
        jPanelAuthorPlaceLayout.setHorizontalGroup(
            jPanelAuthorPlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAuthorPlaceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAuthorPlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAuthorPlace)
                    .addComponent(jTextFieldAuthorPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelAuthorPlaceLayout.setVerticalGroup(
            jPanelAuthorPlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAuthorPlaceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAuthorPlace)
                .addGap(6, 6, 6)
                .addComponent(jTextFieldAuthorPlace, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButtonSave.setText("Save");

        jButtonCancel.setText("Cancel");

        javax.swing.GroupLayout jPanelAuthorButtonLayout = new javax.swing.GroupLayout(jPanelAuthorButton);
        jPanelAuthorButton.setLayout(jPanelAuthorButtonLayout);
        jPanelAuthorButtonLayout.setHorizontalGroup(
            jPanelAuthorButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAuthorButtonLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jButtonSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(59, 59, 59)
                .addComponent(jButtonCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(50, 50, 50))
        );
        jPanelAuthorButtonLayout.setVerticalGroup(
            jPanelAuthorButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAuthorButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanelAuthorLayout = new javax.swing.GroupLayout(jPanelAuthor);
        jPanelAuthor.setLayout(jPanelAuthorLayout);
        jPanelAuthorLayout.setHorizontalGroup(
            jPanelAuthorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAuthorLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabelAuthorTitle)
                .addGap(0, 142, Short.MAX_VALUE))
            .addGroup(jPanelAuthorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAuthorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelAuthorButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelAuthorPlace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelAuthorName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelAuthorID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanelAuthorLayout.setVerticalGroup(
            jPanelAuthorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAuthorLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabelAuthorTitle)
                .addGap(18, 18, 18)
                .addComponent(jPanelAuthorID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelAuthorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelAuthorPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelAuthorButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(323, Short.MAX_VALUE))
        );

        jTableAuthor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPaneAuthortable.setViewportView(jTableAuthor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPaneAuthortable, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPaneAuthortable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabelAuthorID;
    private javax.swing.JLabel jLabelAuthorName;
    private javax.swing.JLabel jLabelAuthorPlace;
    private javax.swing.JLabel jLabelAuthorTitle;
    private javax.swing.JPanel jPanelAuthor;
    private javax.swing.JPanel jPanelAuthorButton;
    private javax.swing.JPanel jPanelAuthorID;
    private javax.swing.JPanel jPanelAuthorName;
    private javax.swing.JPanel jPanelAuthorPlace;
    private javax.swing.JScrollPane jScrollPaneAuthortable;
    private javax.swing.JTable jTableAuthor;
    private javax.swing.JTextField jTextFieldAuthorID;
    private javax.swing.JTextField jTextFieldAuthorName;
    private javax.swing.JTextField jTextFieldAuthorPlace;
    // End of variables declaration//GEN-END:variables
}