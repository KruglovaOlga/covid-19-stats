/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.toedter.calendar.JTextFieldDateEditor;
import controllers.CountryController;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Calendar;
import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.table.TableModel;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.RefineryUtilities;
import view.ArxikoMenu;
import java.util.Date;
import javax.swing.JOptionPane;
import models.Country;
import service.AppQueries;
import service.DeleteCovidData;

/**
 *
 * @author olia
 */
public class showCountryUI extends javax.swing.JFrame {

    private String countryName = "";
    private Date startDate = null;
    private Date endDate = null;
    
    /**
     * Creates new form ArxikoMenu
     */
    public showCountryUI() {
        initComponents();
        
        // Country Selection
        choice1.add(countryName);
        String[] countryNames = CountryController.getCountryNames();
        for (String name : countryNames) {
            choice1.add(name);
        }

        // Date range selection
        Calendar calendar = Calendar.getInstance();
        
        // Start date
        JTextFieldDateEditor editor1 = (JTextFieldDateEditor)jDateChooser1.getDateEditor();
        editor1.setEditable(false);
        calendar.add(Calendar.YEAR, -1);
        startDate = calendar.getTime();
        jDateChooser1.setDate(startDate);
        jDateChooser1.getDateEditor().addPropertyChangeListener((PropertyChangeEvent e) -> {
            if (e.getPropertyName().equals("date")) {
                startDate = (Date) e.getNewValue();
                if (startDate.after(endDate)) {
                    jDateChooser2.setDate(startDate);
                }
                updateTables();
            }
        });
        
        // End date
        JTextFieldDateEditor editor2 = (JTextFieldDateEditor)jDateChooser2.getDateEditor();
        editor2.setEditable(false);
        calendar.add(Calendar.YEAR, 1);
        endDate = calendar.getTime();
        jDateChooser2.setDate(endDate);
        jDateChooser2.getDateEditor().addPropertyChangeListener((PropertyChangeEvent e) -> {
            if (e.getPropertyName().equals("date")) {
                endDate = (Date) e.getNewValue();
                if (endDate.before(startDate)) {
                    jDateChooser1.setDate(endDate);
                }
                updateTables();
            }
        });
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
        jPanel2 = new javax.swing.JPanel();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jDialog3 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        showDiagramBtn = new javax.swing.JButton();
        showMapBtn = new javax.swing.JButton();
        deleteDataBtn = new javax.swing.JButton();
        returnBtn = new javax.swing.JButton();
        chooseDateLabel = new java.awt.Label();
        choice1 = new java.awt.Choice();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        dataTab = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        deathsTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        recoveredTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        confirmedTable = new javax.swing.JTable();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        confirmed_cb = new javax.swing.JCheckBox();
        deaths_cb = new javax.swing.JCheckBox();
        recovered_cb = new javax.swing.JCheckBox();
        cumulative_cb = new javax.swing.JCheckBox();

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Covid-19-Stats");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        showDiagramBtn.setBackground(new java.awt.Color(0, 204, 204));
        showDiagramBtn.setText("Προβολή σε διάγραμμα");
        showDiagramBtn.setToolTipText("Επιλέξτε την χώρα που σας ενδιαφέρει καθώς και το είδος των δεδομένων");
        showDiagramBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showDiagramBtnActionPerformed(evt);
            }
        });

        showMapBtn.setBackground(new java.awt.Color(0, 204, 204));
        showMapBtn.setText("Προβολή σε χάρτη");
        showMapBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showMapBtnActionPerformed(evt);
            }
        });

        deleteDataBtn.setBackground(new java.awt.Color(0, 204, 204));
        deleteDataBtn.setText("Διαγραφή δεδομένων");
        deleteDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDataBtnActionPerformed(evt);
            }
        });

        returnBtn.setBackground(new java.awt.Color(0, 204, 204));
        returnBtn.setText("Επιστροφή στο αρχικό Menu");
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });

        chooseDateLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        chooseDateLabel.setForeground(new java.awt.Color(102, 255, 255));
        chooseDateLabel.setText("Επιλεξτε ημερομηνια");

        choice1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choice1ItemStateChanged(evt);
            }
        });

        label2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label2.setForeground(new java.awt.Color(102, 255, 255));
        label2.setText("Επιλεξτε χωρα");

        label3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label3.setForeground(new java.awt.Color(102, 255, 255));
        label3.setText("Εως");

        label4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label4.setForeground(new java.awt.Color(102, 255, 255));
        label4.setText("Απο");

        deathsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data Kind", "QTY", "PROODQTY", "TRNDATE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(deathsTable);

        dataTab.addTab("DEATHS", jScrollPane1);

        recoveredTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DATAKIND", "QTY", "PROODQTY", "TRNDATE"
            }
        ));
        jScrollPane2.setViewportView(recoveredTable);

        dataTab.addTab("RECOVERED", jScrollPane2);

        confirmedTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DATAKIND", "QTY", "PROODQTY", "TRNDATE"
            }
        ));
        jScrollPane3.setViewportView(confirmedTable);

        dataTab.addTab("CONFIRMED", jScrollPane3);

        jDateChooser1.setDateFormatString("dd-MM-yyyy");

        jDateChooser2.setDateFormatString("dd-MM-yyyy");

        confirmed_cb.setText("CONFIRMED");
        confirmed_cb.setToolTipText("Επιβεβαιωμένα κρούσματα");

        deaths_cb.setText("DEATHS");
        deaths_cb.setToolTipText("Θάνατοι");

        recovered_cb.setText("RECOVERED");
        recovered_cb.setToolTipText("Ασθενείς που έχουν ανακάμψει");

        cumulative_cb.setText("Accumulated Data");
        cumulative_cb.setToolTipText("Επιλέξτε για σωρευτικά δεδομένα");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(choice1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chooseDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(showDiagramBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showMapBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(128, 128, 128)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(returnBtn)
                                    .addComponent(deleteDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 46, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(confirmed_cb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deaths_cb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(recovered_cb)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dataTab, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(cumulative_cb)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(598, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(choice1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chooseDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmed_cb)
                    .addComponent(deaths_cb)
                    .addComponent(recovered_cb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cumulative_cb)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showDiagramBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showMapBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(dataTab, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(759, Short.MAX_VALUE)))
        );

        chooseDateLabel.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu1ActionPerformed

    
    private void showDiagramBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showDiagramBtnActionPerformed
        String selectedCountry = choice1.getSelectedItem().toString();  
        Boolean confirmedDataNeeded = confirmed_cb.isSelected();
        Boolean deathsDataNeeded = deaths_cb.isSelected();
        Boolean recoveredDataNeeded = recovered_cb.isSelected();
        Boolean cumulativeDataNeeded = cumulative_cb.isSelected();
                
        if(!selectedCountry.equals("") 
                && ( confirmedDataNeeded || deathsDataNeeded || recoveredDataNeeded)){
            final CovidChart chart = new CovidChart("Covid-19 Data Chart", selectedCountry, confirmedDataNeeded, deathsDataNeeded, recoveredDataNeeded, cumulativeDataNeeded, startDate, endDate);
            chart.pack();
            RefineryUtilities.centerFrameOnScreen(chart);
            chart.setVisible(true);
        } else {
            System.out.println("Please select Country and/or the kind of data you would like to plot!");
        }
    }//GEN-LAST:event_showDiagramBtnActionPerformed

    private void showMapBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showMapBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showMapBtnActionPerformed

    private void returnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtnActionPerformed

        new ArxikoMenu().setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_returnBtnActionPerformed

    private void deleteDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDataBtnActionPerformed
        if (countryName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Δεν έχετε επιλέξει χώρα!",
                "ΔΙΑΓΡΑΦΗ", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Object[] options = {"Ναι", "Όχι"};
        int answer = JOptionPane.showOptionDialog(null, "Πρόκειται να διαγραφούν τα δεδομένα της χώρας '" + countryName + "'. Θέλετε να προχωρήσετε;",
                "ΔΙΑΓΡΑΦΗ", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (answer == JOptionPane.YES_OPTION) {

            Country country = AppQueries.fetchCountryByName(countryName);
            if (country != null) {
                DeleteCovidData deleteCovidData = new DeleteCovidData();
                // TODO: Delete covid data for the specified date range
                //deleteCovidData.truncateCovidData(country);
                JOptionPane.showMessageDialog(null, "Η διαγραφή των δεδομένων ήταν επιτυχής!",
                "ΔΙΑΓΡΑΦΗ", JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(null, "Η επιλεγμένη χώρα δε βρέθηκε στη βάση!",
                "ΔΙΑΓΡΑΦΗ", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_deleteDataBtnActionPerformed

    private void choice1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_choice1ItemStateChanged
        countryName = evt.getItem().toString();
        updateTables();
    }//GEN-LAST:event_choice1ItemStateChanged

    private void updateTables() {
        CountryController.clearTables(deathsTable, confirmedTable, recoveredTable);
        if (countryName.isEmpty()) {
            return;
        }
        
        CountryController.fillTables(deathsTable, confirmedTable, recoveredTable, countryName, startDate, endDate);
    }
    
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
            java.util.logging.Logger.getLogger(showCountryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(showCountryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(showCountryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(showCountryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                showCountryUI view = new showCountryUI();
                view.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Choice choice1;
    private java.awt.Label chooseDateLabel;
    private javax.swing.JTable confirmedTable;
    private javax.swing.JCheckBox confirmed_cb;
    private javax.swing.JCheckBox cumulative_cb;
    private javax.swing.JTabbedPane dataTab;
    private javax.swing.JTable deathsTable;
    private javax.swing.JCheckBox deaths_cb;
    private javax.swing.JButton deleteDataBtn;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JTable recoveredTable;
    private javax.swing.JCheckBox recovered_cb;
    private javax.swing.JButton returnBtn;
    private javax.swing.JButton showDiagramBtn;
    private javax.swing.JButton showMapBtn;
    // End of variables declaration//GEN-END:variables
}
