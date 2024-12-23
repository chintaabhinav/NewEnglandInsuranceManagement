/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Customer;

import Model.New.Customer.Customer;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import UI.Customer.AvailablePolicy;
import javax.mail.Message;
import javax.mail.Session;
import Model.DatabaseConnection.DatabaseConnection;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;


public class AddVehiclePage extends javax.swing.JPanel {

    /**
     * Creates new form AddVehiclePage
     */
    private JPanel workPanel;
    private Customer customer;

    public AddVehiclePage(JPanel workPanel, Customer customer) {
        initComponents();
        this.workPanel = workPanel;
        this.customer = customer;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblFName1 = new javax.swing.JLabel();
        ComboBoxVehType = new javax.swing.JComboBox<>();
        lblVIN = new javax.swing.JLabel();
        txtVIN = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        ComboBoxYear = new javax.swing.JComboBox<>();
        lblZip = new javax.swing.JLabel();
        ComboBoxMake = new javax.swing.JComboBox<>();
        lblModel = new javax.swing.JLabel();
        ComboBoxModel = new javax.swing.JComboBox<>();
        btnNextSelectPackage = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("                                Choose the vehicles to safeguard");

        btnBack.setBackground(new java.awt.Color(204, 204, 204));
        btnBack.setText("<Back");
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblFName1.setText("Vehicle Type:");

        ComboBoxVehType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Car/Van", "Travel Vehicle" }));

        lblVIN.setText("Enter the VIN number");

        txtVIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVINActionPerformed(evt);
            }
        });

        lblCity.setText("Year");

        ComboBoxYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "2015", "2016", "2017", "2018", "2019", "2020" }));
        ComboBoxYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxYearActionPerformed(evt);
            }
        });

        lblZip.setText("Brand:");

        ComboBoxMake.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "Toyota", "Ford", "Nissan", "Rolls Royce" }));

        lblModel.setText("Model:");

        ComboBoxModel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "Toyota Camry", "Toyota Corolla", "Toyota Prius", "Ford Expedition", "Ford Bronco", "Ford Ranger", "Nissan NV200", "Nissan NV Cargo and NV Passenger", "Rolls-Royce Phantom", "Rolls-Royce Ghost", "Rolls-Royce Wraith" }));

        btnNextSelectPackage.setBackground(new java.awt.Color(204, 204, 204));
        btnNextSelectPackage.setText("Next: Select Package");
        btnNextSelectPackage.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNextSelectPackage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextSelectPackageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 691, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(lblFName1)
                        .addGap(179, 179, 179)
                        .addComponent(lblCity))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblZip)
                                    .addComponent(ComboBoxVehType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(117, 117, 117))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(ComboBoxMake, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboBoxYear, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(ComboBoxModel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblModel))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(543, 543, 543)
                        .addComponent(btnNextSelectPackage))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(lblVIN)
                        .addGap(18, 18, 18)
                        .addComponent(txtVIN, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(btnBack)
                        .addGap(50, 50, 50)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFName1)
                    .addComponent(lblCity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboBoxYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxVehType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblZip)
                    .addComponent(lblModel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxMake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVIN)
                    .addComponent(txtVIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(295, 295, 295)
                .addComponent(btnNextSelectPackage)
                .addContainerGap(412, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1264, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        workPanel.remove(this);
        CardLayout layout = (CardLayout) workPanel.getLayout();
        layout.previous(workPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void ComboBoxYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxYearActionPerformed

    private void btnNextSelectPackageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextSelectPackageActionPerformed
         // Get VIN from input
    String vin = txtVIN.getText().trim();

    // Validate VIN input
    if (vin.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter the VIN number.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Get other vehicle data from input fields
    String vehicleType = ComboBoxVehType.getSelectedItem().toString();
    String year = ComboBoxYear.getSelectedItem().toString();
    String brand = ComboBoxMake.getSelectedItem().toString();
    String model = ComboBoxModel.getSelectedItem().toString();

    // Validate inputs
    if (vehicleType.equals("select") || year.equals("select") || brand.equals("select") || model.equals("select")) {
        JOptionPane.showMessageDialog(this, "Please fill in all vehicle details.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Check if VIN exists in database
    String query = "SELECT * FROM VINDatabase WHERE vin_number = ?";
    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(query)) {

        stmt.setString(1, vin);
        ResultSet rs = stmt.executeQuery();

        if (!rs.next()) {
            JOptionPane.showMessageDialog(this, "VIN not found in the database. Please enter a valid VIN.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Pass data to AvailablePolicy
        AvailablePolicy availablePolicy = new AvailablePolicy(workPanel, customer, vehicleType, year, brand, model, vin);
        workPanel.add("AvailablePolicy", availablePolicy);

        // Navigate to AvailablePolicy
        CardLayout layout = (CardLayout) workPanel.getLayout();
        layout.show(workPanel, "AvailablePolicy");

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error connecting to the database: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    


    }//GEN-LAST:event_btnNextSelectPackageActionPerformed

    private void txtVINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVINActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxMake;
    private javax.swing.JComboBox<String> ComboBoxModel;
    private javax.swing.JComboBox<String> ComboBoxVehType;
    private javax.swing.JComboBox<String> ComboBoxYear;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnNextSelectPackage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblFName1;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblVIN;
    private javax.swing.JLabel lblZip;
    private javax.swing.JTextField txtVIN;
    // End of variables declaration//GEN-END:variables

}
