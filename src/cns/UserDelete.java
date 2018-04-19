/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cns;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;

/**
 *
 * @author john
 */
public class UserDelete {
    
    private JButton oui, non;
    protected DataBase db = new DataBase();
    private final String typeUserT;
    private final String typeUserC;
    private final int id;
    public UserDelete(int id, String typeUser)
    {   
        this.id = id;
        this.typeUserC = typeUser;
        this.typeUserT = typeUser+"s";
        
        
    }
    public boolean confirm() throws Throwable{
        switch (this.typeUserC)
        {
            case "apprenti":
                if(this.alreadyInDb()){
                    this.user();
                }
                return true;
            case "formateur":
                if(this.alreadyInDb()){
                    this.userSections();
                    this.user();
                }
                return true;
            case "responsable":
                if(this.alreadyInDb()){
                    this.userSections();
                    this.user();
                }
                return true;
            case "tuteur":
                if(this.alreadyInDb()){
                    this.user();
                }
                return true;
            default:
                return false;             
        }
    }
    private void user(){
        
        String request = "DELETE FROM "+this.typeUserT+" "
                       + "WHERE id_utilisateur = "+this.id+"";
        this.db.edit(request);
        
        request = "DELETE FROM utilisateurs "
                + "WHERE id_utilisateur = "+this.id+"";
        this.db.edit(request);
        
    }
    private void userSections(){
        
        String request = "DELETE FROM "+this.typeUserT+"_sections "
                       + "WHERE id_"+this.typeUserC+" = "+this.id+"";
        this.db.edit(request);
    }
    private boolean alreadyInDb(){
        
        String request = "SELECT id_utilisateur FROM utilisateurs "
                       + "WHERE id_utilisateur = "+this.id+"";
        ResultSet result = this.db.select(request);
        
        try 
        {
            return result.next();
        }
        catch(SQLException ex) 
        {
           ex.printStackTrace();
        }
        return false;
    }
    
    
}
