/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cns;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

/**
 *
 * @author Matthias
 */
public class GuiUserUpdate extends javax.swing.JFrame {

    /**
     * Creates new form GuiUserUpdate
     */
    private String userType;
    private int idUser;
    private UserList userList = new UserList();
    private UserUpdate userUpdate;
    
    public GuiUserUpdate(int idUser, String userType) {
        this.userType = userType;
        this.idUser = idUser;
        this.userUpdate = new UserUpdate(idUser);
        
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        userNom = new javax.swing.JTextField();
        userPrenom = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        listeTuteurs = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        sectionsList = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        valider = new javax.swing.JButton();
        annuler = new javax.swing.JButton();
        userMdp = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CNS - User Edit");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("nom");

        jLabel2.setText("prénom");

        jLabel3.setText("mot_de_passe");

        this.userNom.setText(this.userList.getUserNom(this.idUser));

        this.userPrenom.setText(this.userList.getUserPrenom(this.idUser));

        ArrayList<Integer> listeIdTuteurs = userList.getListeIdtuteurs();
        ArrayList<String> listeNomTuteurs = new ArrayList();

        for(int idTuteur:listeIdTuteurs){listeNomTuteurs.add(userList.getUserNom(idTuteur)
            +":"+userList.getUserPrenom(idTuteur));}
    listeTuteurs.setModel(new javax.swing.AbstractListModel<String>(){
        public int getSize() { return listeNomTuteurs.size(); }
        public String getElementAt(int i) { return listeNomTuteurs.get(i); }
    });
    if(this.userType.equals("formateurs")||this.userType.equals("responsables")){this.listeTuteurs.setEnabled(false);}
    jScrollPane2.setViewportView(listeTuteurs);

    ArrayList<String> listeNomSections = this.userList.getListeNomSections();
    sectionsList.setModel(new javax.swing.AbstractListModel<String>() {
        public int getSize() { return listeNomSections.size(); }
        public String getElementAt(int i) { return listeNomSections.get(i); }
    });
    if(this.userType.equals("tuteurs")){this.sectionsList.setEnabled(false);}
    jScrollPane3.setViewportView(sectionsList);

    jLabel4.setText("tuteurs");

    jLabel5.setText("sections");

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

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(userPrenom, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                        .addComponent(userNom)
                        .addComponent(userMdp)))
                .addComponent(valider)
                .addComponent(annuler))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addContainerGap())
                .addGroup(layout.createSequentialGroup()
                    .addGap(67, 67, 67)
                    .addComponent(jLabel4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(68, 68, 68))))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(userNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel4)
                .addComponent(jLabel5))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane3)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(userPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(userMdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(valider)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(annuler)
                    .addGap(0, 440, Short.MAX_VALUE))
                .addComponent(jScrollPane2))
            .addContainerGap())
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void validerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_validerActionPerformed

    private void annulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerActionPerformed
        Cns.MainGui.setVisible(true);
    }//GEN-LAST:event_annulerActionPerformed

    /**
     * @param args the command line arguments
     */
    public void execute() {
        
        this.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton annuler;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> listeTuteurs;
    private javax.swing.JList<String> sectionsList;
    private javax.swing.JPasswordField userMdp;
    private javax.swing.JTextField userNom;
    private javax.swing.JTextField userPrenom;
    private javax.swing.JButton valider;
    // End of variables declaration//GEN-END:variables
}
