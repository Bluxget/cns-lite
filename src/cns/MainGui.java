/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cns;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Matthias
 */
public class MainGui extends javax.swing.JFrame {

    private UserList usrList = new UserList();
    
    /**
     * Creates new form MainGui
     */
    public MainGui() {
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

        ajoutUtilisateur = new javax.swing.JButton();
        supprUser = new javax.swing.JButton();
        modifUser = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        appPanel = new javax.swing.JPanel();
        jScrollPaneApp = new javax.swing.JScrollPane();
        appTable = new javax.swing.JTable();
        formPanel = new javax.swing.JPanel();
        jScrollPaneForm = new javax.swing.JScrollPane();
        formTable = new javax.swing.JTable();
        resPanel = new javax.swing.JPanel();
        jScrollPaneRes = new javax.swing.JScrollPane();
        respTable = new javax.swing.JTable();
        tutPanel = new javax.swing.JPanel();
        jScrollPaneTut = new javax.swing.JScrollPane();
        tuTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CNS - ADMINISTRATEUR");
        setResizable(false);

        ajoutUtilisateur.setText("Ajout Utilisateur");
        ajoutUtilisateur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutUtilisateurActionPerformed(evt);
            }
        });

        supprUser.setText("Supprimer Utilisateur");
        supprUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprUserActionPerformed(evt);
            }
        });

        modifUser.setText("Modifier Utilisateur");
        modifUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifUserActionPerformed(evt);
            }
        });

        String[][] appTab = this.usrList.getApprentisTab();
        appTable.setModel(new javax.swing.table.DefaultTableModel(
            appTab,
            new String [] {
                "nom", "prenom", "mot_de_passe"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneApp.setViewportView(appTable);

        javax.swing.GroupLayout appPanelLayout = new javax.swing.GroupLayout(appPanel);
        appPanel.setLayout(appPanelLayout);
        appPanelLayout.setHorizontalGroup(
            appPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneApp, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
        );
        appPanelLayout.setVerticalGroup(
            appPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneApp, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("apprentis", appPanel);

        String[][] formTab = this.usrList.getFormateursTab();
        formTable.setModel(new javax.swing.table.DefaultTableModel(
            formTab,
            new String [] {
                "nom", "prenom", "mot_de_passe"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneForm.setViewportView(formTable);

        javax.swing.GroupLayout formPanelLayout = new javax.swing.GroupLayout(formPanel);
        formPanel.setLayout(formPanelLayout);
        formPanelLayout.setHorizontalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneForm, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
        );
        formPanelLayout.setVerticalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneForm, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("formateurs", formPanel);

        String[][] respTab = this.usrList.getResponsablesTab();
        respTable.setModel(new javax.swing.table.DefaultTableModel(
            respTab,
            new String [] {
                "nom", "prenom", "mot_de_passe"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneRes.setViewportView(respTable);

        javax.swing.GroupLayout resPanelLayout = new javax.swing.GroupLayout(resPanel);
        resPanel.setLayout(resPanelLayout);
        resPanelLayout.setHorizontalGroup(
            resPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneRes, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
        );
        resPanelLayout.setVerticalGroup(
            resPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneRes, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("responsables", resPanel);

        String[][] tuTab = this.usrList.getTuteursTab();
        tuTable.setModel(new javax.swing.table.DefaultTableModel(
            tuTab,
            new String [] {
                "nom", "prenom", "mot_de_passe"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneTut.setViewportView(tuTable);

        javax.swing.GroupLayout tutPanelLayout = new javax.swing.GroupLayout(tutPanel);
        tutPanel.setLayout(tutPanelLayout);
        tutPanelLayout.setHorizontalGroup(
            tutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneTut, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
        );
        tutPanelLayout.setVerticalGroup(
            tutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneTut, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tuteurs", tutPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(supprUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ajoutUtilisateur, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modifUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(ajoutUtilisateur)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(supprUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modifUser)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ajoutUtilisateurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutUtilisateurActionPerformed
        GuiUserAdd guiAdd = new GuiUserAdd();
        
        guiAdd.execute();
    }//GEN-LAST:event_ajoutUtilisateurActionPerformed

    private void modifUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifUserActionPerformed
        
        switch(this.jTabbedPane1.getTitleAt(this.jTabbedPane1.getSelectedIndex()))
        {
            case"apprentis":
                if(this.appTable.getSelectedRow() != -1)
                {
                    this.userUpdate(
                        this.usrList.getUserId(
                            (String)this.appTable.getValueAt(this.appTable.getSelectedRow(),0), 
                            (String)this.appTable.getValueAt(this.appTable.getSelectedRow(),1)
                        ),
                        this.jTabbedPane1.getTitleAt(this.jTabbedPane1.getSelectedIndex())
                    );
                }
                else 
                {
                    this.tableSelectionError();
                }
            break;
            case"formateurs":
                if(this.formTable.getSelectedRow() != -1)
                {
                    this.userUpdate(
                        this.usrList.getUserId(
                            (String)this.formTable.getValueAt(this.formTable.getSelectedRow(),0), 
                            (String)this.formTable.getValueAt(this.formTable.getSelectedRow(),1)
                        ),
                        this.jTabbedPane1.getTitleAt(this.jTabbedPane1.getSelectedIndex())
                    );
                }
                else 
                {
                    this.tableSelectionError();
                }
            break;
            case"responsables":
                if(this.respTable.getSelectedRow() != -1)
                {
                    this.userUpdate(
                        this.usrList.getUserId(
                            (String)this.respTable.getValueAt(this.respTable.getSelectedRow(),0), 
                            (String)this.respTable.getValueAt(this.respTable.getSelectedRow(),1)
                        ),
                        this.jTabbedPane1.getTitleAt(this.jTabbedPane1.getSelectedIndex())
                    );
                }
                else 
                {
                    this.tableSelectionError();
                }
            break;
            case"tuteurs":
                if(this.tuTable.getSelectedRow() != -1) 
                {
                    this.userUpdate(
                        this.usrList.getUserId(
                            (String)this.tuTable.getValueAt(this.tuTable.getSelectedRow(),0), 
                            (String)this.tuTable.getValueAt(this.tuTable.getSelectedRow(),1)
                        ),
                        this.jTabbedPane1.getTitleAt(this.jTabbedPane1.getSelectedIndex())
                    );
                }
                else 
                {
                    this.tableSelectionError();
                }
            break;
            default:
            break;
        }
    }//GEN-LAST:event_modifUserActionPerformed

    private void supprUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprUserActionPerformed
        
        switch(this.jTabbedPane1.getTitleAt(this.jTabbedPane1.getSelectedIndex()))
        {
            case"apprentis":
                if(this.appTable.getSelectedRow()!= -1)
                {
                    if(this.userDelConfirm())
                    {
                        try {
                            this.userDelete(
                                this.usrList.getUserId(
                                    (String)this.appTable.getValueAt(this.appTable.getSelectedRow(),0), 
                                    (String)this.appTable.getValueAt(this.appTable.getSelectedRow(),1)
                                ),
                                "apprenti"
                            );
                        } 
                        catch(Throwable ex) 
                        {
                            Logger.getLogger(MainGui.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        JOptionPane.showMessageDialog(this.supprUser, "Apprenti supprimé avec succès");
                    }
                }
                else 
                {
                    this.tableSelectionError();
                }
            break;
            case"formateurs":
                if(this.formTable.getSelectedRow()!= -1)
                {
                    if(this.userDelConfirm())
                    {
                        try 
                        {
                            this.userDelete(
                                this.usrList.getUserId(
                                    (String)this.formTable.getValueAt(this.formTable.getSelectedRow(),0), 
                                    (String)this.formTable.getValueAt(this.formTable.getSelectedRow(),1)
                                ), 
                                "formateur"
                            );
                        } 
                        catch(Throwable ex) 
                        {
                            Logger.getLogger(MainGui.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        JOptionPane.showMessageDialog(this.supprUser, "Formateur Supprimé avec succès");
                    }
                }
                else 
                {
                    this.tableSelectionError();
                }
            break;
            case"responsables":
                if(this.respTable.getSelectedRow()!= -1)
                {
                    if(this.userDelConfirm())
                    {
                        try 
                        {
                            this.userDelete(
                                this.usrList.getUserId(
                                    (String)this.respTable.getValueAt(this.respTable.getSelectedRow(),0), 
                                    (String)this.respTable.getValueAt(this.respTable.getSelectedRow(),1)
                                ), 
                                "responsable"
                            );
                        } 
                        catch(Throwable ex) 
                        {
                            Logger.getLogger(MainGui.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        JOptionPane.showMessageDialog(this.supprUser, "Responsable Supprimé avec succès");
                    }
                }
                else 
                {
                    this.tableSelectionError();
                }
            break;
            case"tuteurs":
                if(this.respTable.getSelectedRow()!= -1)
                {
                    if(this.userDelConfirm())
                    {
                        try 
                        {
                            this.userDelete(
                                this.usrList.getUserId(
                                    (String)this.tuTable.getValueAt(this.tuTable.getSelectedRow(),0), 
                                    (String)this.tuTable.getValueAt(this.tuTable.getSelectedRow(),1)
                                ), 
                                "tuteur"
                            );
                        } 
                        catch(Throwable ex) 
                        {
                            Logger.getLogger(MainGui.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        JOptionPane.showMessageDialog(this.supprUser, "Tuteur Supprimé avec succès");
                    }
                }
                else 
                {
                    this.tableSelectionError();
                }
            break;
            default:
            break;
        }
    }//GEN-LAST:event_supprUserActionPerformed
    
    public boolean userDelConfirm(){
        JOptionPane delConfirmationPane = new JOptionPane();
        int choix = delConfirmationPane.showConfirmDialog(this, "Voulez-vous Supprimer l'utilisateur sélectionné ?", "Confirmation suppression", JOptionPane.YES_NO_OPTION);
        // choix = 0 pour 'oui' et choix = 1 pour 'non'
        if(choix == 0)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    
    public void userUpdate(int id, String userType){
        GuiUserUpdate guiUserUpdate = new GuiUserUpdate(id, userType);
        guiUserUpdate.execute();
        
        this.reloadTable();
    }
    
    public void userDelete(int id, String userType) throws Throwable{
        UserDelete userDelete = new UserDelete(id, userType);
        userDelete.confirm();
        
        this.reloadTable();
    }
    
    public void tableSelectionError(){
        JOptionPane.showMessageDialog(
            this,
            "veuillez sélectionner UN utilisateur",
            "SELECTION INVALIDE",
            JOptionPane.ERROR_MESSAGE
        );
    }
    
    @Override
    public void setVisible(boolean visible)
    {
        this.reloadTable();
        
        super.setVisible(visible);
    }
    
    public void reloadTable()
    {
        String[][] appTab = this.usrList.getApprentisTab();
        appTable.setModel(new javax.swing.table.DefaultTableModel(
            appTab,
            new String [] {
                "nom", "prenom", "mot_de_passe"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneApp.setViewportView(appTable);
        
        String[][] formTab = this.usrList.getFormateursTab();
        formTable.setModel(new javax.swing.table.DefaultTableModel(
            formTab,
            new String [] {
                "nom", "prenom", "mot_de_passe"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneForm.setViewportView(formTable);
        
        String[][] tuTab = this.usrList.getTuteursTab();
        tuTable.setModel(new javax.swing.table.DefaultTableModel(
            tuTab,
            new String [] {
                "nom", "prenom", "mot_de_passe"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneTut.setViewportView(tuTable);
        
        String[][] respTab = this.usrList.getResponsablesTab();
        respTable.setModel(new javax.swing.table.DefaultTableModel(
            respTab,
            new String [] {
                "nom", "prenom", "mot_de_passe"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneRes.setViewportView(respTable);
    }
    
    public void execute() {
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
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Cns.MainGui = new MainGui();
                Cns.MainGui.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajoutUtilisateur;
    private javax.swing.JPanel appPanel;
    private javax.swing.JTable appTable;
    private javax.swing.JPanel formPanel;
    private javax.swing.JTable formTable;
    private javax.swing.JScrollPane jScrollPaneApp;
    private javax.swing.JScrollPane jScrollPaneForm;
    private javax.swing.JScrollPane jScrollPaneRes;
    private javax.swing.JScrollPane jScrollPaneTut;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton modifUser;
    private javax.swing.JPanel resPanel;
    private javax.swing.JTable respTable;
    private javax.swing.JButton supprUser;
    private javax.swing.JTable tuTable;
    private javax.swing.JPanel tutPanel;
    // End of variables declaration//GEN-END:variables

}
