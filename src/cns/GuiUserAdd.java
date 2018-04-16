/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cns;

import java.awt.List;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Matthias
 */
public class GuiUserAdd extends javax.swing.JDialog {

    /**
     * Creates new form testAdd
     */
    private UserAdd userAdd = new UserAdd();
    private UserList userList = new UserList();
    
    public GuiUserAdd() {
        Cns.MainGui.setVisible(false);
        
        this.addWindowListener(new WindowAdapter() {
 
            @Override
            public void windowClosing(WindowEvent e) {
                Cns.MainGui.setVisible(true);
            }
          });
         
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

        userNom = new javax.swing.JTextField();
        userPrenom = new javax.swing.JTextField();
        userMdp = new javax.swing.JPasswordField();
        typeUser = new java.awt.Choice();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        valider = new javax.swing.JButton();
        annuler = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        sectionsList = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listeTuteurs = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ajout utilisateur");

        userNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNomActionPerformed(evt);
            }
        });

        userPrenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userPrenomActionPerformed(evt);
            }
        });

        typeUser.add("apprenti");
        typeUser.add("formateur");
        typeUser.add("responsable");
        typeUser.add("tuteur");

        jLabel1.setText("nom");

        jLabel2.setText("prénom");

        jLabel3.setText("mot de passe");

        jLabel4.setText("type utilisateur");

        valider.setText("valider");
        valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validerActionPerformed(evt);
            }
        });

        annuler.setText("annuler");
        annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerActionPerformed(evt);
            }
        });

        ArrayList<String> listeNomSections = this.userList.getListeNomSections();
        sectionsList.setModel(new javax.swing.AbstractListModel<String>() {
            public int getSize() { return listeNomSections.size(); }
            public String getElementAt(int i) { return listeNomSections.get(i); }
        });
        jScrollPane1.setViewportView(sectionsList);

        jLabel5.setText("liste sections");

        jLabel7.setText("tuteur (apprenti)");

        ArrayList<Integer> listeIdTuteurs = userList.getListeIdtuteurs();
        ArrayList<String> listeNomTuteurs = new ArrayList();

        for(int idTuteur:listeIdTuteurs){listeNomTuteurs.add(userList.getUserNom(idTuteur)
            +":"+userList.getUserPrenom(idTuteur));}
    listeTuteurs.setModel(new javax.swing.AbstractListModel<String>() {
        public int getSize() { return listeNomTuteurs.size(); }
        public String getElementAt(int i) { return listeNomTuteurs.get(i); }
    });
    jScrollPane2.setViewportView(listeTuteurs);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(userMdp)
                                .addComponent(userPrenom, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(userNom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(valider)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(annuler)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(typeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel4))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(userNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(userPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(userMdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(48, 48, 48)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(valider)
                        .addComponent(annuler)))
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(62, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                        .addComponent(jScrollPane1)
                        .addComponent(typeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addContainerGap())
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNomActionPerformed

    private void userPrenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userPrenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userPrenomActionPerformed

    private void validerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validerActionPerformed
        if(!this.userNom.getText().equals("")&&!this.userPrenom.getText().equals("")&&!this.userMdp.getText().equals("")){
            switch (typeUser.getSelectedItem())
            {
                case "apprenti":
                    
                    if(!this.listeTuteurs.isSelectionEmpty()&&!this.sectionsList.isSelectionEmpty()){
                        
                        String sectionSelected = (String) this.sectionsList.getSelectedValue();
                        String tuteurNp = (String) this.listeTuteurs.getSelectedValue();
                        String[] nomPrenom = tuteurNp.split(":");
                        userAdd.apprenti(this.userNom.getText(), this.userPrenom.getText(), 
                                         this.userMdp.getText(), this.userList.getSectionId(sectionSelected), 
                                         this.userList.getUserId(nomPrenom[0],nomPrenom[1]));
                        
                        JOptionPane.showMessageDialog(this.valider,
                        "Apprenti ajouté avec succès");
                        
                        this.userNom.setText("");
                        this.userPrenom.setText("");
                        this.userMdp.setText("");
                    }
                    else{
                        JOptionPane.showMessageDialog(this.valider,
                        "veuillez sélectionner UN tuteur et UNE section",
                        "SAISIE INVALIDE",
                        JOptionPane.ERROR_MESSAGE);

                    }
                    break;
                    
                case "formateur":
                    
                    if(!this.sectionsList.isSelectionEmpty()){
                        
                        ArrayList<Integer> listeIdSections = new ArrayList();
                        ArrayList<String> listeNomSections = (ArrayList<String>) this.sectionsList.getSelectedValuesList();
                        
                        for(String nomSection:listeNomSections){listeIdSections.add(this.userList.getSectionId(nomSection)); }
                        
                        userAdd.formateur(this.userNom.getText(), this.userPrenom.getText(), 
                                          this.userMdp.getText(),  listeIdSections);
                        
                        JOptionPane.showMessageDialog(this.valider,
                        "Formateur ajouté avec succès");
                        
                        this.userNom.setText("");
                        this.userPrenom.setText("");
                        this.userMdp.setText("");
                        
                    }
                    
                    else{
                        
                        JOptionPane.showMessageDialog(this.valider,
                        "veuillez sélectionner AU MOINS UNE Section",
                        "SAISIE INVALIDE",
                        JOptionPane.ERROR_MESSAGE);
                        
                    }
                    break;
                    
                case "responsable":
                    
                    if(!this.sectionsList.isSelectionEmpty()){
                        
                        ArrayList<Integer> listeIdSections = new ArrayList();
                        ArrayList<String> listeNomSections = (ArrayList<String>) this.sectionsList.getSelectedValuesList();
                        
                        for(String nomSection:listeNomSections){listeIdSections.add(this.userList.getSectionId(nomSection)); }
                        
                        userAdd.responsable(this.userNom.getText(), this.userPrenom.getText(), 
                                          this.userMdp.getText(),  listeIdSections);
                        
                        JOptionPane.showMessageDialog(this.valider,
                        "Responsable ajouté avec succès");
                        
                        this.userNom.setText("");
                        this.userPrenom.setText("");
                        this.userMdp.setText("");
                        
                    }
                    
                    else{
                        
                        JOptionPane.showMessageDialog(this.valider,
                        "veuillez sélectionner AU MOINS UNE Section",
                        "SAISIE INVALIDE",
                        JOptionPane.ERROR_MESSAGE);
                        
                    }
                    break;
                    
                case "tuteur":

                    this.userAdd.tuteur(this.userNom.getText(), this.userPrenom.getText(), this.userMdp.getText());
                    JOptionPane.showMessageDialog(this.valider,
                    "Tuteur ajouté avec succès");
                    this.userNom.setText("");
                    this.userPrenom.setText("");
                    this.userMdp.setText("");

                    break;
                    
                default:
                    
                    JOptionPane.showMessageDialog(this.valider,
                    "ERROR",
                    "UNCATCHED ERROR",
                    JOptionPane.ERROR_MESSAGE);
            }
        }
        
        else{
            
            JOptionPane.showMessageDialog(this.valider,
            "veuillez renseigner les champs 'nom', 'prénom', et 'mot de passe'",
            "SAISIE INVALIDE",
            JOptionPane.ERROR_MESSAGE);
            
        }
    }//GEN-LAST:event_validerActionPerformed

    private void annulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerActionPerformed
        this.dispose();
        try {
            this.finalize();
        } catch (Throwable ex) {
            Logger.getLogger(GuiUserAdd.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Cns.MainGui.setVisible(true);
    }//GEN-LAST:event_annulerActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(GuiUserAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiUserAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiUserAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiUserAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GuiUserAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton annuler;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listeTuteurs;
    private javax.swing.JList<String> sectionsList;
    private java.awt.Choice typeUser;
    private javax.swing.JPasswordField userMdp;
    private javax.swing.JTextField userNom;
    private javax.swing.JTextField userPrenom;
    private javax.swing.JButton valider;
    // End of variables declaration//GEN-END:variables

    

    
}
