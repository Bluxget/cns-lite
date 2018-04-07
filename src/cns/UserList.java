/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cns;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

/**
 *
 * @author john
 */
public class UserList extends JFrame implements ActionListener {

    private JTable table;
    private JButton ajouter, supprimer;
    protected DataBase db = new DataBase();
 
    /*public UserList() {
        super();
 
        this.setTitle("CNS - Administration");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        String[] columnNames = {"Id", "Prénom", "Nom", "Mot de passe", "Status"};
        String[][] data = {
            {"1", "Jo", "Bu", "azerty123", "Apprenti"},
            {"2", "Hey", "Hy", "erzaet45", "Apprenti"},
            {"3", "Oh", "Hi", "bgfdb53", "Apprenti"},
            {"4", "Uh", "Er", "retez23", "Apprenti"}
        };
        
        this.table = new JTable(data, columnNames);
        
        this.table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.table.setRowSelectionInterval(0, 0);
        
        getContentPane().add(new JScrollPane(this.table), BorderLayout.CENTER);
 
        JPanel boutons = new JPanel();
        this.ajouter = new JButton("Ajouter");
        this.supprimer = new JButton("Supprimer");
 
        this.ajouter.addActionListener(this);
        this.supprimer.addActionListener(this);
        
        boutons.add(this.ajouter);
        boutons.add(this.supprimer);
 
        getContentPane().add(boutons, BorderLayout.SOUTH);
 
        pack();
    }*/
    public UserList(){
        
    }
    
    public JTable getTable()
    {
        return this.table;
    }
    
    public void afficher()
    {
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource() == this.ajouter)
        {
            System.out.println("Ajouter");
        }
        else if(ae.getSource() == this.supprimer)
        {
            int row = this.table.getSelectedRow();
            
            JOptionPane warn = new JOptionPane();
            int option = warn.showConfirmDialog(this, "Etes-vous sûr de vouloir supprimer " + this.table.getValueAt(row, 1) + " " + this.table.getValueAt(row, 2).toString().toUpperCase() + " ?", "Suppression", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

            if(option == JOptionPane.OK_OPTION)
            {
                System.out.println("Hey");
                
                // Req suppression
                // Suppression ligne tableau
            }
        }
        else
        {
            System.out.println("Erreur");
        }
    }
    public ArrayList<Integer> getListeIdSections(){
        ArrayList<Integer> listeSections = new ArrayList();
        String request = "SELECT id_section FROM `sections`";
        ResultSet result = this.db.select(request);
        try 
        {
            while(result.next()) 
            {
                listeSections.add(result.getInt("id_section"));
            }
        }
        catch(SQLException ex) 
        {
           ex.printStackTrace();
        }
        return listeSections;
    }
    public ArrayList<String> getListeNomSections(){
        ArrayList<String> listeSections = new ArrayList();
        String request = "SELECT nom FROM `sections`";
        ResultSet result = this.db.select(request);
        try 
        {
            while(result.next()) 
            {
                listeSections.add(result.getString("nom"));
            }
        }
        catch(SQLException ex) 
        {
           ex.printStackTrace();
        }
        return listeSections;
    }
    public String getSectionName(int id_section){
        String request = "SELECT nom FROM `sections` "
                           + "WHERE id_section = '"+id_section+"'";
        ResultSet result = this.db.select(request);
        try 
        {
            while(result.next()) 
            {
                return result.getString("nom");
            }
        }
        catch(SQLException ex) 
        {
           ex.printStackTrace();
        }
        return "";
    }
    public int getSectionId(String sectionName){
        String request = "SELECT id_section FROM `sections` "
                       + "WHERE nom = '"+sectionName+"'";
        ResultSet result = this.db.select(request);
        try 
        {
            while(result.next()) 
            {
                return result.getInt("id_section");
            }
        }
        catch(SQLException ex) 
        {
           ex.printStackTrace();
        }
        return 0;
    }
    /*public ArrayList<String> getListeNomTuteurs(){
        ArrayList<String> listeNomTuteurs = new ArrayList();
        
    }*/
    public ArrayList<Integer> getListeIdtuteurs(){
        ArrayList<Integer> listeIdTuteurs = new ArrayList();
        String request = "SELECT * FROM `tuteurs`";
        ResultSet result = this.db.select(request);
        try 
        {
            while(result.next()) 
            {
                listeIdTuteurs.add(result.getInt("id_utilisateur"));
            }
        }
        catch(SQLException ex) 
        {
           ex.printStackTrace();
        }
        return listeIdTuteurs;
    }
    public String getUserNom(int idUtilisateur){
        String request = "SELECT nom FROM utilisateurs "
                       + "WHERE id_utilisateur = '"+idUtilisateur+"'";
        ResultSet result = this.db.select(request);
        try 
        {
            while(result.next()) 
            {
                return result.getString("nom");
            }
        }
        catch(SQLException ex) 
        {
           ex.printStackTrace();
        }
        return "";
    }
}
