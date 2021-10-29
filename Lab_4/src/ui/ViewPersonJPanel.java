/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Encounter;
import model.PatientDetails;
import model.PatientDirectory;
import model.PersonDetails;
import model.PersonDirectory;
import model.VitalSigns;

/**
 *
 * @author shubhangisrivastava
 */
public class ViewPersonJPanel extends javax.swing.JPanel {

    UUID uniqueKey = UUID.randomUUID();
    
    PersonDirectory history;
   PatientDirectory history1;
   Encounter history2;
    
    /**
     * Creates new form ViewPersonJPanel
     */
    public ViewPersonJPanel(PersonDirectory history,  PatientDirectory history1, Encounter history2) {
        initComponents();
        
        this.history=history;
        
        
        this.history1=history1;
       // populateTable();
        
        this.history2=history2;
        
        populateTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        lblTtile = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPerson = new javax.swing.JTable();
        lblPersonName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        txtPersonName = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblCommunity = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        lblTemperature = new javax.swing.JLabel();
        txtCommunity = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtTemperature = new javax.swing.JTextField();
        lblBloodPressure = new javax.swing.JLabel();
        txtBloodPressure = new javax.swing.JTextField();
        btnPatientsEntry = new javax.swing.JButton();
        txtAddress = new javax.swing.JTextField();
        btnSavePatientDetails = new java.awt.Button();
        lblDateOfVisit = new javax.swing.JLabel();
        txtDateOfVisit = new javax.swing.JTextField();
        lblPatientID = new javax.swing.JLabel();
        txtPatientID = new javax.swing.JTextField();

        lblTtile.setFont(new java.awt.Font("Chalkboard", 1, 18)); // NOI18N
        lblTtile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTtile.setText("View Person Details");

        tblPerson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Person Name", "Age", "Gender", "Address", "Community", "City"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPerson);

        lblPersonName.setText("Patient Name :");

        lblAge.setText("Age :");

        txtPersonName.setEnabled(false);

        lblGender.setText("Gender :");

        lblAddress.setText("Address :");

        lblCommunity.setText("Community :");

        txtGender.setEnabled(false);
        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });

        lblCity.setText("City :");

        lblTemperature.setText("Temperature");

        txtCommunity.setEnabled(false);
        txtCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommunityActionPerformed(evt);
            }
        });

        txtCity.setEnabled(false);
        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        txtAge.setEnabled(false);

        txtTemperature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTemperatureActionPerformed(evt);
            }
        });

        lblBloodPressure.setText("Blood Pressure :");

        txtBloodPressure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBloodPressureActionPerformed(evt);
            }
        });

        btnPatientsEntry.setText("Create Patients ");
        btnPatientsEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientsEntryActionPerformed(evt);
            }
        });

        txtAddress.setEnabled(false);

        btnSavePatientDetails.setLabel("Save Patient Records");
        btnSavePatientDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavePatientDetailsActionPerformed(evt);
            }
        });

        lblDateOfVisit.setText("Date Of Visit :");

        txtDateOfVisit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateOfVisitActionPerformed(evt);
            }
        });

        lblPatientID.setText("Patient ID :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTtile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPatientID)
                                        .addGap(182, 182, 182)
                                        .addComponent(txtPatientID))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCommunity)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtCommunity))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblPersonName)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                                        .addComponent(txtPersonName, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblAge)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtAge, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblGender)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtGender))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblAddress)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtAddress))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblTemperature)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtTemperature))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblCity)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtCity))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblBloodPressure)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                                        .addComponent(txtBloodPressure))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDateOfVisit)
                                        .addGap(160, 160, 160)
                                        .addComponent(txtDateOfVisit, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(btnSavePatientDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(btnPatientsEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtAddress, txtAge, txtBloodPressure, txtCity, txtCommunity, txtDateOfVisit, txtGender, txtPersonName, txtTemperature});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTtile, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPatientsEntry)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPatientID)
                    .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPersonName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPersonName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAge))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAddress)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCommunity)
                    .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTemperature))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBloodPressure))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDateOfVisit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDateOfVisit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSavePatientDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtAddress, txtAge, txtBloodPressure, txtCity, txtCommunity, txtDateOfVisit, txtGender, txtPersonName, txtTemperature});

    }// </editor-fold>//GEN-END:initComponents

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

    private void txtCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommunityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommunityActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtTemperatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTemperatureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTemperatureActionPerformed

    private void txtBloodPressureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBloodPressureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBloodPressureActionPerformed

    private void btnPatientsEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientsEntryActionPerformed

        
        int selectedRowIndex = tblPerson.getSelectedRow();
       
       if(selectedRowIndex<0) {
           JOptionPane.showMessageDialog(this, "Please select a row to view");
           return;
       }
       
       DefaultTableModel model = (DefaultTableModel) tblPerson.getModel();
       PersonDetails personDetails = (PersonDetails) model.getValueAt(selectedRowIndex, 0);
       
 
       txtPersonName.setText(String.valueOf(personDetails.getName()));
       txtAge.setText(String.valueOf(personDetails.getAge()));
       txtGender.setText((String.valueOf(personDetails.getGender())));
       txtAddress.setText(String.valueOf(personDetails.getAddr()));
       txtCommunity.setText(String.valueOf(personDetails.getCommunity()));
       txtCity.setText(String.valueOf(personDetails.getCity()));   
    }//GEN-LAST:event_btnPatientsEntryActionPerformed

    private void btnSavePatientDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavePatientDetailsActionPerformed
        
        int unique_id = Integer.parseInt(txtPatientID.getText());
        String person_name = txtPersonName.getText();
        int age = Integer.parseInt(txtAge.getText().toString());
        String gender = txtGender.getText();
        String address = txtAddress.getText();
        String community = txtCommunity.getText();
        String city = txtCity.getText();
        float temperature = Float.parseFloat(txtTemperature.getText());
        double blood_pressure = Double.parseDouble(txtBloodPressure.getText());
        String date_of_visit = txtDateOfVisit.getText();
        

        
        PatientDetails ps = history1.addNewPatient();

        ps.setName(person_name);
        ps.setAge(age);
        ps.setGender(gender);   
        ps.setAddr(address);  
        ps.setCommunity(community);
        ps.setCity(city);
        ps.setTemperature(temperature);
        ps.setBlood_pressure(blood_pressure);
        ps.setDate_of_visit(date_of_visit);
        ps.setUnique_id(unique_id);

        VitalSigns vs = history2.addNewEncounter();
        
        vs.setBlood_pressure(blood_pressure);
        vs.setDate_of_visit(date_of_visit);
        vs.setTemperature(temperature);
        vs.setUnique_id(unique_id);
  
        JOptionPane.showMessageDialog(this, "Patient Vital Signs Added.");
                
        txtPersonName.setText("");
        txtAge.setText("");
        txtGender.setText("");
        txtAddress.setText("");
        txtCommunity.setText("");
        txtCity.setText("");
        txtTemperature.setText("");
        txtBloodPressure.setText("");
        txtDateOfVisit.setText(""); 
        txtPatientID.setText("");
        
//        
//        VitalSigns vs = history2.addNewEncounter();
//        
//        vs.setTemperature(temperature);
//        vs.setBlood_pressure(blood_pressure);
//        vs.setDate_of_visit(date_of_visit);
//        vs.setUnique_id(unique_id);

    }//GEN-LAST:event_btnSavePatientDetailsActionPerformed

    private void txtDateOfVisitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateOfVisitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateOfVisitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPatientsEntry;
    private java.awt.Button btnSavePatientDetails;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblBloodPressure;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblDateOfVisit;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblPatientID;
    private javax.swing.JLabel lblPersonName;
    private javax.swing.JLabel lblTemperature;
    private javax.swing.JLabel lblTtile;
    private javax.swing.JTable tblPerson;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCommunity;
    private javax.swing.JTextField txtDateOfVisit;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtPatientID;
    private javax.swing.JTextField txtPersonName;
    private javax.swing.JTextField txtTemperature;
    // End of variables declaration//GEN-END:variables

private void populateTable() {
    
    DefaultTableModel model = (DefaultTableModel) tblPerson.getModel();
    model.setRowCount(0);
    
    for(PersonDetails cd : history.getHistory()) {
        
        Object[] row = new Object[8];
        row[0] = cd;
        row[1] = cd.getAge();
        row[2] = cd.getGender();
        row[3] = cd.getAddr();
        row[4] = cd.getCommunity();
        row[5] = cd.getCity();
        
        
        model.addRow(row);
    }
    }
}
