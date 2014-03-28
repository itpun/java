/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import gui.types.*;

/**
 *
 * @author Normal
 */
public class SelectActivityMatrix extends MSPanel {

    /**
     * Creates new form SelectActivityMatrix1
     */
    public SelectActivityMatrix() {
	super("Activity Selection");

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

        student_matrix_header = new javax.swing.JPanel();
        cancel_button = new javax.swing.JButton();
        ok_button = new javax.swing.JButton();
        student_select_dropdown = new javax.swing.JComboBox();
        assignment_select_dropdown = new javax.swing.JComboBox();
        student_label = new javax.swing.JLabel();
        assignment_label = new javax.swing.JLabel();

        student_matrix_header.setBorder(javax.swing.BorderFactory.createTitledBorder("Select the Desired Activity:"));
        student_matrix_header.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        student_matrix_header.setName(""); // NOI18N

        cancel_button.setText("Cancel");

        ok_button.setText("OK");
        ok_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok_buttonActionPerformed(evt);
            }
        });

        student_select_dropdown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Student A", "Student B", "Student C" }));

        assignment_select_dropdown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Assignment 1", "Assignment 2", "Assignment 3" }));

        student_label.setText("Student:");

        assignment_label.setText("Assignment");

        javax.swing.GroupLayout student_matrix_headerLayout = new javax.swing.GroupLayout(student_matrix_header);
        student_matrix_header.setLayout(student_matrix_headerLayout);
        student_matrix_headerLayout.setHorizontalGroup(
            student_matrix_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(student_matrix_headerLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(student_matrix_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(student_matrix_headerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ok_button, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancel_button))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, student_matrix_headerLayout.createSequentialGroup()
                        .addComponent(assignment_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                        .addComponent(assignment_select_dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(student_matrix_headerLayout.createSequentialGroup()
                        .addComponent(student_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(student_select_dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        student_matrix_headerLayout.setVerticalGroup(
            student_matrix_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(student_matrix_headerLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(student_matrix_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(student_matrix_headerLayout.createSequentialGroup()
                        .addGroup(student_matrix_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(student_select_dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(student_label))
                        .addGap(78, 78, 78))
                    .addGroup(student_matrix_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(assignment_label)
                        .addComponent(assignment_select_dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(student_matrix_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ok_button)
                    .addComponent(cancel_button)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(student_matrix_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(student_matrix_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ok_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ok_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel assignment_label;
    private javax.swing.JComboBox assignment_select_dropdown;
    private javax.swing.JButton cancel_button;
    private javax.swing.JButton ok_button;
    private javax.swing.JLabel student_label;
    private javax.swing.JPanel student_matrix_header;
    private javax.swing.JComboBox student_select_dropdown;
    // End of variables declaration//GEN-END:variables
}
