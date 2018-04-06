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
    private String typeUserT, typeUserC;
    private int id;
    public UserDelete(int id, String typeUser)
    {   
        this.id = id;
        this.typeUserC = typeUser;
        this.typeUserT = typeUser+"s";
        
        
    }
    public void confirm() throws Throwable{
        switch (this.typeUserC)
        {
            case "apprenti":
                if(this.alreadyInDb()){
                    this.user();
                }
                break;  
            case "formateur":
                if(this.alreadyInDb()){
                    this.userSections();
                    this.user();
                }
                break;
            case "responsable":
                if(this.alreadyInDb()){
                    this.userSections();
                    this.user();
                }
                break;
            case "tuteur":
                if(this.alreadyInDb()){
                    this.user();
                }
                break;
            default:
                this.finalize();             
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
    private boolean alreadyInDb() throws SQLException{
        
        String request = "SELECT id_utilisateur FROM utilisateurs "
                       + "WHERE id_utilisateur = "+this.id+"";
        ResultSet result = this.db.select(request);
        
        return result.next();
    }
    @Override
    public void finalize() throws Throwable{
        super.finalize();
    }
}
