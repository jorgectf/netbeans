/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
/*
 * Contributor(s): theanuradha@netbeans.org
 */
package org.netbeans.modules.maven.hints.ui.customizers;

import java.util.prefs.Preferences;
import org.netbeans.modules.maven.hints.errors.SearchClassDependencyHint;

/**
 *
 * @author  Anuradha G
 */
public class SearchDependencyCustomizer extends javax.swing.JPanel {

    private final Preferences p;

    /** Creates new form SearchDependencyCustomizer */
    public SearchDependencyCustomizer(Preferences p) {
        this.p = p;
        initComponents();
        boolean b = p.getBoolean(SearchClassDependencyHint.OPTION_DIALOG, true);
        if (b) {
            jrOptionDialog.setSelected(true);
        }else{
            jrOptionInplace.setSelected(true);
        }
        p.putBoolean(SearchClassDependencyHint.OPTION_DIALOG, jrOptionDialog.isSelected());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblHeader = new javax.swing.JLabel();
        jrOptionDialog = new javax.swing.JRadioButton();
        jrOptionInplace = new javax.swing.JRadioButton();

        setOpaque(false);

        lblHeader.setText(org.openide.util.NbBundle.getMessage(SearchDependencyCustomizer.class, "LBL_Header")); // NOI18N

        buttonGroup1.add(jrOptionDialog);
        jrOptionDialog.setText(org.openide.util.NbBundle.getMessage(SearchDependencyCustomizer.class, "LBL_Option_Dialog")); // NOI18N
        jrOptionDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrOptionDialogActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrOptionInplace);
        jrOptionInplace.setText(org.openide.util.NbBundle.getMessage(SearchDependencyCustomizer.class, "LBL_Option_InPlace")); // NOI18N
        jrOptionInplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrOptionInplaceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHeader)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrOptionInplace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jrOptionDialog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrOptionDialog)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrOptionInplace)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void jrOptionDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrOptionDialogActionPerformed
    p.putBoolean(SearchClassDependencyHint.OPTION_DIALOG, jrOptionDialog.isSelected());
}//GEN-LAST:event_jrOptionDialogActionPerformed

private void jrOptionInplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrOptionInplaceActionPerformed
    p.putBoolean(SearchClassDependencyHint.OPTION_DIALOG, !jrOptionInplace.isSelected());
}//GEN-LAST:event_jrOptionInplaceActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton jrOptionDialog;
    private javax.swing.JRadioButton jrOptionInplace;
    private javax.swing.JLabel lblHeader;
    // End of variables declaration//GEN-END:variables
}
