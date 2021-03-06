/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import service.DeleteCovidData;
import service.LoadCovidData;
import utils.Constants;

/**
 *
 * @author olia
 */
public class manageDataUI extends javax.swing.JFrame {

    /**
     * Creates new form ArxikoMenu
     */
    public manageDataUI() {
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

        jFrame1 = new javax.swing.JFrame();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jPanel1 = new javax.swing.JPanel();
        insertCountryBtn = new javax.swing.JButton();
        insertDataBtn = new javax.swing.JButton();
        deleteCountryBtn = new javax.swing.JButton();
        deleteDataBtn = new javax.swing.JButton();
        astheneisCheckBox = new javax.swing.JCheckBox();
        krousmataCheckBox = new javax.swing.JCheckBox();
        thanatoiCheckBox = new javax.swing.JCheckBox();
        label1 = new java.awt.Label();
        showCountryMenuBtn = new javax.swing.JButton();
        returnBtn = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        menu1.setLabel("File");
        menu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu1ActionPerformed(evt);
            }
        });
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Επιλογή δεδομένων Covid-19 ανά χώρα");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        insertCountryBtn.setBackground(new java.awt.Color(0, 204, 204));
        insertCountryBtn.setText("Εισαγωγή χωρών");
        insertCountryBtn.setMaximumSize(new java.awt.Dimension(135, 23));
        insertCountryBtn.setMinimumSize(new java.awt.Dimension(135, 23));
        insertCountryBtn.setPreferredSize(new java.awt.Dimension(135, 23));
        insertCountryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertCountryBtnActionPerformed(evt);
            }
        });

        insertDataBtn.setBackground(new java.awt.Color(0, 204, 204));
        insertDataBtn.setText("Εισαγωγή δεδομένων");
        insertDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertDataBtnActionPerformed(evt);
            }
        });

        deleteCountryBtn.setBackground(new java.awt.Color(0, 204, 204));
        deleteCountryBtn.setText("Διαγραφή χωρών");
        deleteCountryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCountryBtnActionPerformed(evt);
            }
        });

        deleteDataBtn.setBackground(new java.awt.Color(0, 204, 204));
        deleteDataBtn.setText("Διαγραφή δεδομένων");
        deleteDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDataBtnActionPerformed(evt);
            }
        });

        astheneisCheckBox.setForeground(new java.awt.Color(102, 255, 255));
        astheneisCheckBox.setText("Ασθενείς που έχούν ανακάμψει");
        astheneisCheckBox.setOpaque(false);
        astheneisCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                astheneisCheckBoxActionPerformed(evt);
            }
        });

        krousmataCheckBox.setForeground(new java.awt.Color(102, 255, 255));
        krousmataCheckBox.setText("Επιβεβαιωμένα κρούσματα");
        krousmataCheckBox.setOpaque(false);
        krousmataCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                krousmataCheckBoxActionPerformed(evt);
            }
        });

        thanatoiCheckBox.setForeground(new java.awt.Color(102, 255, 255));
        thanatoiCheckBox.setText("Θάνατοι");
        thanatoiCheckBox.setOpaque(false);

        label1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label1.setForeground(new java.awt.Color(102, 255, 255));
        label1.setText("ΕΠΙΛΕΞΤΕ ΤΟ ΕΙΔΟΣ ΔΕΔΟΜΕΝΩΝ ΠΟΥ ΣΑΣ ΕΝΔΙΑΦΕΡΟΥΝ");

        showCountryMenuBtn.setBackground(new java.awt.Color(0, 204, 204));
        showCountryMenuBtn.setText("Προβολή των δεδομένων ");
        showCountryMenuBtn.setMaximumSize(new java.awt.Dimension(137, 23));
        showCountryMenuBtn.setMinimumSize(new java.awt.Dimension(137, 23));
        showCountryMenuBtn.setName(""); // NOI18N
        showCountryMenuBtn.setPreferredSize(new java.awt.Dimension(137, 23));
        showCountryMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showCountryMenuBtnActionPerformed(evt);
            }
        });

        returnBtn.setBackground(new java.awt.Color(0, 204, 204));
        returnBtn.setText("Επιστροφή στο αρχικό Menu");
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showCountryMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(astheneisCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(krousmataCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(thanatoiCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(insertDataBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(insertCountryBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(98, 98, 98)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(deleteCountryBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(deleteDataBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(returnBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGap(8, 8, 8))))
                .addGap(0, 27, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {deleteCountryBtn, deleteDataBtn, insertCountryBtn, insertDataBtn, returnBtn, showCountryMenuBtn});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(astheneisCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(krousmataCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thanatoiCheckBox)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteCountryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertCountryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showCountryMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu1ActionPerformed

    private void insertCountryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertCountryBtnActionPerformed

        LoadCovidData loadData = new LoadCovidData(
                thanatoiCheckBox.isSelected(),
                astheneisCheckBox.isSelected(),
                krousmataCheckBox.isSelected(),
                Constants.COUTRIES_ONLY);
        loadData.startLoadData();
    }//GEN-LAST:event_insertCountryBtnActionPerformed

    private void insertDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertDataBtnActionPerformed
        // TODO add your handling code here:
        LoadCovidData loadData = new LoadCovidData(
                thanatoiCheckBox.isSelected(),
                astheneisCheckBox.isSelected(),
                krousmataCheckBox.isSelected(),
                !Constants.COUTRIES_ONLY);
        loadData.startLoadData();
    }//GEN-LAST:event_insertDataBtnActionPerformed

    private void deleteDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDataBtnActionPerformed

        Object[] options = {"Ναι", "Όχι"};
        int answer = JOptionPane.showOptionDialog(null, "Πρόκειται να διαγραφούν τα δεδομένα των χωρών. Θέλετε να προχωρήσετε;",
                "ΔΙΑΓΡΑΦΗ", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (answer == JOptionPane.YES_OPTION) {

            DeleteCovidData deleteCovidData = new DeleteCovidData();
            deleteCovidData.truncateCovidData();
        }
    }//GEN-LAST:event_deleteDataBtnActionPerformed

    private void deleteCountryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCountryBtnActionPerformed
        Object[] options = {"Ναι", "Όχι"};
        int answer = JOptionPane.showOptionDialog(null, "Πρόκειται να διαγραφούν όλες οι χώρες. Θέλετε να προχωρήσετε;",
                "ΔΙΑΓΡΑΦΗ", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (answer == JOptionPane.YES_OPTION) {

            DeleteCovidData deleteCovidData = new DeleteCovidData();
            deleteCovidData.truncateCountries();
        }
    }//GEN-LAST:event_deleteCountryBtnActionPerformed

    private void showCountryMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showCountryMenuBtnActionPerformed
        // TODO add your handling code here:
        new showCountryUI().setVisible(true);
        dispose();
    }//GEN-LAST:event_showCountryMenuBtnActionPerformed

    private void krousmataCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_krousmataCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_krousmataCheckBoxActionPerformed

    private void astheneisCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_astheneisCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_astheneisCheckBoxActionPerformed

    private void returnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtnActionPerformed

        new ArxikoMenu().setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_returnBtnActionPerformed

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
            java.util.logging.Logger.getLogger(manageDataUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manageDataUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manageDataUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manageDataUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manageDataUI().setVisible(true);

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox astheneisCheckBox;
    private javax.swing.JButton deleteCountryBtn;
    private javax.swing.JButton deleteDataBtn;
    private javax.swing.JButton insertCountryBtn;
    private javax.swing.JButton insertDataBtn;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox krousmataCheckBox;
    private java.awt.Label label1;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JButton returnBtn;
    private javax.swing.JButton showCountryMenuBtn;
    private javax.swing.JCheckBox thanatoiCheckBox;
    // End of variables declaration//GEN-END:variables
}
