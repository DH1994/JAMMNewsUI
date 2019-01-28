/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jammnews.dialogs;

import jammnews.JAMMNewsUI;
import jammnews.tasks.ShellCmd;
import javax.swing.JOptionPane;

/**
 *
 * @author dhergaarden
 */
public class ShellCmdDialog extends javax.swing.JFrame {

    JAMMNewsUI parent;
    
    //for edit
    boolean edit = false;
    int index;
    
    /**
     * Creates new form ShellCmdDialog
     */
    public ShellCmdDialog(JAMMNewsUI p) {
        this.parent = p;
        initComponents();
    }
    
    public ShellCmdDialog(JAMMNewsUI p, ShellCmd s, int index) {
        initComponents();
        this.parent = p;
        edit = true;
        cmdField.setText(s.getCmd());
        this.index = index;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Command");

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdField)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 313, Short.MAX_VALUE)
                        .addComponent(saveBtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        if(cmdField.getText().length() > 0)
        {
            ShellCmd s = new ShellCmd();
            s.setCmd(cmdField.getText());
            
            if(edit)
            {
                parent.editTaskHandler(s, index);
                edit = false;
                clearFields();
                this.dispose();
            }    
            else
            {
                parent.addTaskHandler(s);
                clearFields();
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "No command entered!");
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void clearFields()
    {
        cmdField.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cmdField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables
}