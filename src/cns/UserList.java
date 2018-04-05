/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cns;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
 
    public UserList() {
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
}
