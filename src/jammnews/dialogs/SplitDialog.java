/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jammnews.dialogs;

import jammnews.JAMMNewsUI;
import jammnews.tasks.Split;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author dhergaarden
 */


public class SplitDialog extends javax.swing.JFrame {

    JAMMNewsUI parent;
    int index;
    boolean edit;
    /**
     * Creates new form SplitDialog
     */
    public SplitDialog(JAMMNewsUI p) {
        initComponents();
        this.parent = p;
    }
    
    public SplitDialog(JAMMNewsUI p, Split s, int index) {     
        this.parent = p;
        this.index = index;
        edit = true;      
        
        initComponents();

        this.inputField.setText(s.getInput());
        this.outputField.setText(s.getOutput());
        this.silenceBorderSlider.setValue(s.getSilenceBorder() * -1);
        this.minSilenceLengthSlider.setValue(s.getMinSilenceLength());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        silenceBorderSlider = new javax.swing.JSlider();
        inputField = new javax.swing.JTextField();
        outputField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dBLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        minSilenceLengthSlider = new javax.swing.JSlider();
        slcLengthLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        silenceBorderSlider.setMaximum(90);
        silenceBorderSlider.setValue(30);
        silenceBorderSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                silenceBorderSliderStateChanged(evt);
            }
        });

        jLabel1.setText("Input File");

        jLabel2.setText("Output Folder");

        jLabel3.setText("Silence Border");

        dBLabel.setText("-30");

        jLabel4.setText("Minimum silence length");

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        minSilenceLengthSlider.setMaximum(1000);
        minSilenceLengthSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                minSilenceLengthSliderStateChanged(evt);
            }
        });

        slcLengthLabel.setText("0.000");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(silenceBorderSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(163, 163, 163)
                                        .addComponent(dBLabel))
                                    .addComponent(jLabel3))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(34, 34, 34)
                                .addComponent(inputField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(outputField)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(minSilenceLengthSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(slcLengthLabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(saveBtn)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(outputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(silenceBorderSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dBLabel)
                        .addGap(34, 34, 34)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(slcLengthLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(saveBtn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(minSilenceLengthSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void silenceBorderSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_silenceBorderSliderStateChanged
        if(silenceBorderSlider.getValue() > 0)
        {
            this.dBLabel.setText("-" + silenceBorderSlider.getValue());
        }
        else
        {
            this.dBLabel.setText("" + silenceBorderSlider.getValue());
        }
    }//GEN-LAST:event_silenceBorderSliderStateChanged

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        if(inputField.getText().length() > 0 && outputField.getText().length() > 0 && minSilenceLengthSlider.getValue() > 0)
        {
            Split s = new Split();
            s.setInput(inputField.getText());
            s.setOutput(outputField.getText());
            s.setMinSilenceLength(minSilenceLengthSlider.getValue());
            s.setSilenceBorder(silenceBorderSlider.getValue() * -1);
            
            if(edit)
            {
                parent.editTaskHandler(s, index);
                clearFields();
                edit = false;
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
            JOptionPane.showMessageDialog(this, "Fill all fields!");
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void clearFields()
    {
        this.inputField.setText("");
        this.outputField.setText("");
        this.minSilenceLengthSlider.setValue(0);
        this.silenceBorderSlider.setValue(0);      
    }
    
    private void minSilenceLengthSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_minSilenceLengthSliderStateChanged
        slcLengthLabel.setText((float)minSilenceLengthSlider.getValue() / 100 + "");
    }//GEN-LAST:event_minSilenceLengthSliderStateChanged




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dBLabel;
    private javax.swing.JTextField inputField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSlider minSilenceLengthSlider;
    private javax.swing.JTextField outputField;
    private javax.swing.JButton saveBtn;
    private javax.swing.JSlider silenceBorderSlider;
    private javax.swing.JLabel slcLengthLabel;
    // End of variables declaration//GEN-END:variables
}
