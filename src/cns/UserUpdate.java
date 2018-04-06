/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cns;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author john
 */
public class UserUpdate {
    
    protected DataBase db = new DataBase();
    private int id;
    
    public UserUpdate(int id){
        this.id = id;
    }
    public void nom(String nvNom) throws SQLException{
        if(this.alreadyInDb()){
            this.utilisateursRequest("nom", nvNom);
        }
    }
    public void prenom(String nvPrenom) throws SQLException{
         if(this.alreadyInDb()){
        this.utilisateursRequest("prenom", nvPrenom);
         }
    }
    public void mdp(String nvMdp) throws SQLException{
        if(this.alreadyInDb()){
        this.utilisateursRequest("mot_de_passe", nvMdp);
        }
    }
    public void apprentiSection(int id_section) throws SQLException{
        if(this.alreadyInDb()){
            this.apprentiRequest("id_section", id_section);
        }
    }
    public void apprentiTuteur(int id_tuteur) throws SQLException{
        if(this.alreadyInDb()){
            this.apprentiRequest("id_tuteur", id_tuteur);
        }
    }
    public void formateurSections(ArrayList<Integer> arraySections) throws SQLException{
        if(this.alreadyInDb()){
            this.sectionsRequest("formateurs", "formateur", arraySections);
        }
    }
    public void responsableSections(ArrayList<Integer> arraySections) throws SQLException{
        if(this.alreadyInDb()){
            this.sectionsRequest("responsables", "responsable", arraySections);
        }
    }
    private void apprentiRequest(String field, int param){
        String request = "UPDATE `apprentis` SET `"+field+"` = '"+param+"' "
                       + "WHERE `apprentis`.`id_utilisateur` = "+this.id+" ";
        this.db.edit(request);
    }
    private void sectionsRequest(String table, String field, ArrayList<Integer> arraySections){
        
        String request = "DELETE FROM "+table+"_sections "
                       + "WHERE id_"+field+" = "+this.id+"";
        
        this.db.edit(request);
        if (arraySections.size()>0){
            
            for (int section:arraySections)
            {

                request = "INSERT INTO "+table+"_sections (id_"+field+", id_section) "
                        + "SELECT utilisateurs.id_utilisateur, sections.id_section "
                        + "FROM utilisateurs, sections "
                        + "WHERE utilisateurs.id_utilisateur = '"+this.id+"' "
                        + "AND sections.id_section = "+section+"";
                this.db.edit(request);
            }
        }   
        
    }
    private void utilisateursRequest(String colonne, String param){
        String request = "UPDATE `utilisateurs` SET `"+colonne+"` = '"+param+"' "
                        + "WHERE `apprentis`.`id_utilisateur` = "+this.id+"";
        this.db.edit(request);
    }
    private boolean alreadyInDb() throws SQLException{
        
        String request = "SELECT id_utilisateur FROM utilisateurs "
                       + "WHERE id_utilisateur = "+this.id+"";
        ResultSet result = this.db.select(request);
        
        return result.next();
    }
    public void annuler() throws Throwable{
        super.finalize();
    }
}
