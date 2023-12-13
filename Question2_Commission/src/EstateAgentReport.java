
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ntokozoshinga
 */
public class EstateAgentReport extends javax.swing.JFrame {

    String[] locations = {"Cape Town", "Durban", "Pretoria"};

   int repairCost = 5000;
    double rate = 10;
    double calculatedPay;
    String technicianName;

    public int getPropertyPrice() {
        return repairCost;
    }

    public void setPropertyPrice(int repairCost) {
        this.repairCost = 5000;
    }

    public double getCommissionPercentage() {
        return rate;
    }

    public void setCommissionPercentage(double calculatedPay) {
        this.rate = 0.10 ;
    }

    public String getTechnicianName() {
        return "Joe Bloggs";
    }

    public void setTechnicianName(String technicianName) {
        this.technicianName = "Joe Bloggs";
    }
    
    /**
     * Creates new form EstateAgentReport
     */
    public EstateAgentReport() {
        initComponents();
        populateLocations();
        calculateCommission();
    }
    
    private void calculateCommission( ) {
        calculatedPay = repairCost * 0.10;
    }
    
    private void populateLocations() {
        for (int i = 0; i < locations.length; i++) {
            this.cmbLocations.addItem(locations[i]);
            //this.TFname.addInputMethodListener(l);
        }
    }
    
    private void saveReportToFile() {
        try (FileWriter writer = new FileWriter("report.txt")) {
            writer.write(jTextAreaReport.getText());
            JOptionPane.showMessageDialog(this, "Report saved to report.txt", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error saving report to file", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void clearFields() {
        cmbLocations.setSelectedIndex(0);
        TFname.setText("");
        FTprice.setText("");
        TFcommission.setText("");
        jTextAreaReport.setText("");
    }
  
    
    private void processReport() {
        // Get input values
        String location = (String) cmbLocations.getSelectedItem();
        String agentName = TFname.getText();
        String propertyPrice = FTprice.getText();
        String commissionPercentage = TFcommission.getText();
        
//  FileWriter myWriter;
//     
//        try {
//            myWriter = new FileWriter("report.txt");
//            
//            myWriter.append("AGENT LOCATION: " + cmbLocations.getSelectedItem() + "\n");
//            myWriter.append("AGENT NAME: " + TFname.getText() + "\n");
//            myWriter.append("PROPERTY PRICE: "+ FTprice.getText() + "\n");
//            myWriter.append("COMMISSION PERCENTAGE: " + TFcommission.getText() + "\n");
//            myWriter.append("CALCULATED COMMISSION:");
//            myWriter.close();
//            saveReportToFile();
//            
//        } catch (IOException e) {
//            JOptionPane.showMessageDialog(rootPane, e.getMessage());
//        }

        // Validate data
//        EstateAgentReport estateAgent = new EstateAgentReport();
//        Data dataToValidate = new Data(location, agentName, propertyPrice, commissionPercentage);
//        if (estateAgent.ValidateData(dataToValidate)) {
            // Data is valid, calculate commission and display report
        //double commission = estateAgent.calculateCommission(propertyPrice, commissionPercentage);
//        TFname.setText("Joe Bloggs");
//        FTprice.setText("800000");
//        TFcommission.setText("10");
            String report = "Location: " + location + "\nTechnician Name: " + getTechnicianName() +
                    "\nRepair Cost: " +"R"+ getPropertyPrice() + "\nTECHNICIAN RATE: " + getCommissionPercentage() +"%"+
                    "\nCalculated Pay: " +"R"+ calculatedPay;
            jTextAreaReport.setText(report);
//        } else {
//            // Display an error message
//            JOptionPane.showMessageDialog(this, "Invalid input. Please check the data and try again.",
//                    "Error", JOptionPane.ERROR_MESSAGE);
//        }



    }
    
    
    
    
  
    
    
    
    
    
    
    
    
    
//        // Validate data
//        EstateAgentReport estateAgent = new EstateAgentReport();
//        Data dataToValidate = new Data(location, agentName, propertyPrice, commissionPercentage);
//        if (estateAgent.ValidateData(dataToValidate)) {
//            // Data is valid, calculate commission and display report
//            double commission = estateAgent.CalculateCommission(propertyPrice, commissionPercentage);
//            String report = "Location: " + location + "\nAgent Name: " + agentName +
//                    "\nProperty Price: " + propertyPrice + "\nCommission Percentage: " + commissionPercentage +
//                    "\nCommission Earned: " + commission;
//            jTextAreaReport.setText(report);
//        } else {
//            // Display an error message
//            JOptionPane.showMessageDialog(this, "Invalid input. Please check the data and try again.",
//                    "Error", JOptionPane.ERROR_MESSAGE);
//        }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LocationLb = new javax.swing.JLabel();
        nameLb = new javax.swing.JLabel();
        pPriceLb = new javax.swing.JLabel();
        commissionLb = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbLocations = new javax.swing.JComboBox<>();
        TFname = new javax.swing.JTextField();
        FTprice = new javax.swing.JTextField();
        TFcommission = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaReport = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Exit = new javax.swing.JMenuItem();
        ProcessReport = new javax.swing.JMenu();
        clear = new javax.swing.JMenuItem();
        Save = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LocationLb.setText("TECHNICIAN LOCATION: ");

        nameLb.setText("TECHNICIAN  NAME:");

        pPriceLb.setText("REPAIR COST:");

        commissionLb.setText(" TECHNICIAN RATE:");

        jLabel5.setText("TECHNICIAN  REPORT:");

        cmbLocations.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cape Town", "Durban", "Pretoria" }));
        cmbLocations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLocationsActionPerformed(evt);
            }
        });

        TFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFnameActionPerformed(evt);
            }
        });

        jTextAreaReport.setColumns(20);
        jTextAreaReport.setRows(5);
        jScrollPane1.setViewportView(jTextAreaReport);

        jMenu1.setText("File");

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jMenu1.add(Exit);

        jMenuBar1.add(jMenu1);

        ProcessReport.setText("Tools");

        clear.setText("Process Report");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        ProcessReport.add(clear);

        Save.setText("Clear");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        ProcessReport.add(Save);

        jMenuItem4.setText("Save Report");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        ProcessReport.add(jMenuItem4);

        jMenuBar1.add(ProcessReport);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(commissionLb)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TFcommission, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LocationLb)
                                            .addComponent(nameLb)
                                            .addComponent(pPriceLb))
                                        .addGap(50, 50, 50)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(FTprice)
                                            .addComponent(TFname)
                                            .addComponent(cmbLocations, 0, 169, Short.MAX_VALUE))))))
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LocationLb)
                    .addComponent(cmbLocations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLb)
                    .addComponent(TFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pPriceLb)
                    .addComponent(FTprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(commissionLb)
                    .addComponent(TFcommission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFnameActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
        
    }//GEN-LAST:event_ExitActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
//clearFields();
processReport();
    }//GEN-LAST:event_clearActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        saveReportToFile();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        clearFields();
    }//GEN-LAST:event_SaveActionPerformed

    private void cmbLocationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLocationsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbLocationsActionPerformed

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
            java.util.logging.Logger.getLogger(EstateAgentReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstateAgentReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstateAgentReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstateAgentReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstateAgentReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Exit;
    private javax.swing.JTextField FTprice;
    private javax.swing.JLabel LocationLb;
    private javax.swing.JMenu ProcessReport;
    private javax.swing.JMenuItem Save;
    private javax.swing.JTextField TFcommission;
    private javax.swing.JTextField TFname;
    private javax.swing.JMenuItem clear;
    private javax.swing.JComboBox<String> cmbLocations;
    private javax.swing.JLabel commissionLb;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaReport;
    private javax.swing.JLabel nameLb;
    private javax.swing.JLabel pPriceLb;
    // End of variables declaration//GEN-END:variables

    

//    private double CalculateCommission(String propertyPrice, String commissionPercentage) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
}
