/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import model.PersonDetails;
import model.PersonDirectory;

/**
 *
 * @author shubhangisrivastava
 */
public class CreatePersonJPanel extends javax.swing.JPanel {

    
    
     PersonDirectory history;
    /**
     * Creates new form CreateJPanel
     */
    public CreatePersonJPanel(PersonDirectory history) {
        initComponents();
        this.history=history;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblPersonName = new javax.swing.JLabel();
        lblCommunity = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        txtPersonName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtCommunity = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        btnCreate = new java.awt.Button();
        txtFemale = new java.awt.Checkbox();
        txtMale = new java.awt.Checkbox();
        txtOther = new java.awt.Checkbox();

        lblTitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create Person Details");

        lblAge.setText("Age:");

        lblGender.setText("Gender:");

        lblAddress.setText("Address:");

        lblPersonName.setText("Person Name:");

        lblCommunity.setText("Community:");

        lblCity.setText("City:");

        txtPersonName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPersonNameKeyReleased(evt);
            }
        });

        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAgeKeyReleased(evt);
            }
        });

        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddressKeyReleased(evt);
            }
        });

        txtCommunity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCommunityKeyReleased(evt);
            }
        });

        txtCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCityKeyReleased(evt);
            }
        });

        btnCreate.setEnabled(false);
        btnCreate.setLabel("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        txtFemale.setLabel("Female");

        txtMale.setLabel("Male");

        txtOther.setLabel("Other");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPersonName, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(150, 150, 150)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMale, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtOther, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPersonName)
                            .addComponent(txtAge)
                            .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(93, 93, 93)
                                                        .addComponent(lblPersonName))
                                                    .addComponent(txtPersonName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(lblAge))
                                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(lblGender)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblAddress))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtFemale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtMale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtOther, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(lblCommunity))
                            .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblCity))
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(202, 202, 202))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
// public void btnCreateDisability() {    
//
//         int personName = txtPersonName.getDocument().getLength();
//         int Age = txtAge.getDocument().getLength();
//         int Addr = txtAddress.getDocument().getLength();
//         int community = txtCommunity.getDocument().getLength();
//         int city = txtCity.getDocument().getLength();
//         
//         if(personName == 0 || Age == 0 || Addr == 0 || community ==0 || city == 0 ) {
//             
//             btnCreate.setEnabled(false);
//             
//         }
//         if (personName != 0 || Age != 0 || Addr != 0 || community !=0 || city != 0){
//             btnCreate.setEnabled(true);
//         }
// }  

    
    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
         
        
        

        
        String person_name = txtPersonName.getText();
        int age = Integer.parseInt(txtAge.getText().toString());
       // String gender = txtGender.getText();
        boolean female = txtFemale.getState();
        boolean male = txtMale.getState();
        boolean other = txtOther.getState();
        String address = txtAddress.getText();
        String community = txtCommunity.getText();
        String city = txtCity.getText();

//        btnCreateDisability();
        
        PersonDetails ps = history.addNewPerson();
         
        
        ps.setName(person_name);
        ps.setAge(age);
//        ps.setGender(gender);  
        if(female == true){
           ps.setGender("Female");
        } else if(male ==true) {
            ps.setGender("Male");
        } else {
            ps.setGender("Other");
        }
        ps.setAddr(address);  
        ps.setCommunity(community);
        ps.setCity(city);
        
        JOptionPane.showMessageDialog(this, "New Person Details Added.");
                
        txtPersonName.setText("");
        txtAge.setText("");
//        txtGender.setText("");
        txtFemale.setState(false);
        txtMale.setState(false);
        txtOther.setState(false);
        txtAddress.setText("");
        txtCommunity.setText("");
        txtCity.setText("");
//        txtTemperature.setText("");
//        txtBloodPressure.setText("");
      
    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtPersonNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPersonNameKeyReleased
        
         int personName = txtPersonName.getText().length();
         if(personName > 0) {
             btnCreate.setEnabled(true);
         } else {
             btnCreate.setEnabled(false);
         }
 
    }//GEN-LAST:event_txtPersonNameKeyReleased

    private void txtAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyReleased
        
        int age = txtAge.getText().length();
         if(age > 0) {
             btnCreate.setEnabled(true);
         } else {
             btnCreate.setEnabled(false);
         }
        
    }//GEN-LAST:event_txtAgeKeyReleased

    private void txtAddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyReleased
        
        int address = txtAddress.getText().length();
         if(address > 0) {
             btnCreate.setEnabled(true);
         } else {
             btnCreate.setEnabled(false);
         }   
    }//GEN-LAST:event_txtAddressKeyReleased

    private void txtCommunityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCommunityKeyReleased
            
        int community = txtCommunity.getText().length();
         if(community > 0) {
             btnCreate.setEnabled(true);
         } else {
             btnCreate.setEnabled(false);
         }  
        
    }//GEN-LAST:event_txtCommunityKeyReleased

    private void txtCityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCityKeyReleased
        
        int city = txtCity.getText().length();
         if(city > 0) {
             btnCreate.setEnabled(true);
         } else {
             btnCreate.setEnabled(false);
         }  
    }//GEN-LAST:event_txtCityKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnCreate;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblPersonName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCommunity;
    private java.awt.Checkbox txtFemale;
    private java.awt.Checkbox txtMale;
    private java.awt.Checkbox txtOther;
    private javax.swing.JTextField txtPersonName;
    // End of variables declaration//GEN-END:variables
}
