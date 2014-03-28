/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import gui.utils.GUIUtils;
import gui.types.*;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import types.*;
import database.AccountAccess;
import java.awt.event.ActionEvent;

/**
 *
 * @author Normal
 */
public class CreateAccount extends MSPanel {

    /**
     * Creates new form CreateAccount
     */
    public CreateAccount() {
	super("Account Management");

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

        account_creation_header = new javax.swing.JPanel();
        first_name_field = new javax.swing.JTextField();
        last_name_field = new javax.swing.JTextField();
        account_type_dropdown = new javax.swing.JComboBox();
        username_field = new javax.swing.JTextField();
        password_generate_button = new javax.swing.JButton();
        first_name_label = new javax.swing.JLabel();
        last_name_label = new javax.swing.JLabel();
        id_label = new javax.swing.JLabel();
        account_type_label = new javax.swing.JLabel();
        username_label = new javax.swing.JLabel();
        password_label = new javax.swing.JLabel();
        modify_existing_checkbox = new javax.swing.JCheckBox();
        existing_account_dropdown = new javax.swing.JComboBox();
        existing_account_separator = new javax.swing.JSeparator();
        ok_button = new javax.swing.JButton();
        cancel_button = new javax.swing.JButton();
        password_field = new javax.swing.JTextField();
        id_field = new javax.swing.JFormattedTextField();

        account_creation_header.setBorder(javax.swing.BorderFactory.createTitledBorder("Create/Modify an Account:"));
        account_creation_header.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        account_creation_header.setName(""); // NOI18N

        first_name_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                first_name_fieldActionPerformed(evt);
            }
        });

        account_type_dropdown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "System Admin", "Administrator", "Assistant Admin", "Instructor", "TA" }));
        account_type_dropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                account_type_dropdownActionPerformed(evt);
            }
        });

        password_generate_button.setText("Generate");
        password_generate_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_generate_buttonActionPerformed(evt);
            }
        });

        first_name_label.setText("First Name");

        last_name_label.setText("Last Name");

        id_label.setText("Employee ID");

        account_type_label.setText("Account Type");

        username_label.setText("Username");

        password_label.setText("Password");

        modify_existing_checkbox.setText("Modify Existing Account");
        modify_existing_checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modify_existing_checkboxActionPerformed(evt);
            }
        });

        existing_account_dropdown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "jtoering", "cyoung", "gsmith", "cwoodbury", "mbalaski", "ipun", "slaboucane" }));
        existing_account_dropdown.setEnabled(false);

        existing_account_separator.setForeground(new java.awt.Color(0, 0, 0));

        ok_button.setText("OK");
        ok_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok_buttonActionPerformed(evt);
            }
        });

        cancel_button.setText("Cancel");
        cancel_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_buttonActionPerformed(evt);
            }
        });

        password_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_fieldActionPerformed(evt);
            }
        });

        id_field.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#######################"))));

        javax.swing.GroupLayout account_creation_headerLayout = new javax.swing.GroupLayout(account_creation_header);
        account_creation_header.setLayout(account_creation_headerLayout);
        account_creation_headerLayout.setHorizontalGroup(
            account_creation_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(account_creation_headerLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(account_creation_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(account_creation_headerLayout.createSequentialGroup()
                        .addComponent(modify_existing_checkbox, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(existing_account_dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addComponent(existing_account_separator, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, account_creation_headerLayout.createSequentialGroup()
                        .addGroup(account_creation_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(account_creation_headerLayout.createSequentialGroup()
                                .addGroup(account_creation_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(account_creation_headerLayout.createSequentialGroup()
                                        .addComponent(password_label)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(password_generate_button))
                                    .addGroup(account_creation_headerLayout.createSequentialGroup()
                                        .addGroup(account_creation_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(last_name_label)
                                            .addComponent(account_type_label)
                                            .addComponent(username_label)
                                            .addComponent(first_name_label))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(account_creation_headerLayout.createSequentialGroup()
                                .addComponent(id_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(account_creation_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(password_field, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(first_name_field, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(last_name_field, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(account_type_dropdown, javax.swing.GroupLayout.Alignment.LEADING, 0, 118, Short.MAX_VALUE)
                            .addComponent(username_field, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id_field, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(account_creation_headerLayout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(ok_button, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancel_button)))
                .addGap(18, 18, 18))
        );
        account_creation_headerLayout.setVerticalGroup(
            account_creation_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, account_creation_headerLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(account_creation_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modify_existing_checkbox)
                    .addComponent(existing_account_dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(existing_account_separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(account_creation_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(first_name_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(first_name_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(account_creation_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(last_name_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(last_name_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(account_creation_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_label)
                    .addComponent(id_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(account_creation_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(account_type_dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(account_type_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(account_creation_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(account_creation_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password_generate_button)
                    .addComponent(password_label)
                    .addComponent(password_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(account_creation_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ok_button)
                    .addComponent(cancel_button))
                .addGap(4, 4, 4))
        );

        ok_button.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(account_creation_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(account_creation_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void first_name_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_first_name_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_first_name_fieldActionPerformed

    private void account_type_dropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_account_type_dropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_account_type_dropdownActionPerformed

    private void password_generate_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_generate_buttonActionPerformed
        password_field.setText(GUIUtils.generatePassword());
    }//GEN-LAST:event_password_generate_buttonActionPerformed

    private void modify_existing_checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modify_existing_checkboxActionPerformed
        if (modify_existing_checkbox.isSelected())
        existing_account_dropdown.setEnabled(true);
        else
        existing_account_dropdown.setEnabled(false);      
    }//GEN-LAST:event_modify_existing_checkboxActionPerformed

    private void ok_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok_buttonActionPerformed
        //Add modify if case later
        
       String account_select = account_type_dropdown.getSelectedItem().toString();
       System.out.println("Creating " + account_select + " type account.");
        
       String first = first_name_field.getText();
       String last = last_name_field.getText();
       int id = Integer.parseInt(id_field.getText());
       String username = username_field.getText();
       String pass = password_field.getText();
       
       Account creation;
       
        if (account_select.equalsIgnoreCase("System Admin"))
            creation = new SystemAdmin(first, last, id, username, pass);
        
        else if(account_select.equalsIgnoreCase("Administrator"))
            creation = new AcademicAdmin(first, last, id, username, pass);
        
        else if(account_select.equalsIgnoreCase("Assistant Admin"))
            creation = new AssistantAdmin(first, last, id, username, pass);
        
        else if(account_select.equalsIgnoreCase("Instructor"))
            creation = new Instructor(first, last, id, username, pass);
        
        else if(account_select.equalsIgnoreCase("TA"))
            creation = new TATM(first, last, id, username, pass);
       
        else //Incorrect account type, this should never happen
        {
            creation = null;
            System.out.println("Is it Christmas right now?  Because you have an error message to unwrap.");
        }
        
        System.out.println(creation.toString());
        
        //Put the created account in the database
        AccountAccess.createAccount(creation);
        
        GUIUtils.getMasterFrame(this).goBackAction(new ActionEvent(this, 5, null));
        
    }//GEN-LAST:event_ok_buttonActionPerformed

    private void cancel_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_buttonActionPerformed
        String first_name=first_name_field.getText();
        String last_name=last_name_field.getText();
        
    }//GEN-LAST:event_cancel_buttonActionPerformed

    private void password_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_fieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel account_creation_header;
    private javax.swing.JComboBox account_type_dropdown;
    private javax.swing.JLabel account_type_label;
    private javax.swing.JButton cancel_button;
    private javax.swing.JComboBox existing_account_dropdown;
    private javax.swing.JSeparator existing_account_separator;
    private javax.swing.JTextField first_name_field;
    private javax.swing.JLabel first_name_label;
    private javax.swing.JFormattedTextField id_field;
    private javax.swing.JLabel id_label;
    private javax.swing.JTextField last_name_field;
    private javax.swing.JLabel last_name_label;
    private javax.swing.JCheckBox modify_existing_checkbox;
    private javax.swing.JButton ok_button;
    private javax.swing.JTextField password_field;
    private javax.swing.JButton password_generate_button;
    private javax.swing.JLabel password_label;
    private javax.swing.JTextField username_field;
    private javax.swing.JLabel username_label;
    // End of variables declaration//GEN-END:variables
}
