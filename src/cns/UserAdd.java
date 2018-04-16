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
public class UserAdd {
    
    protected DataBase db = new DataBase();
    
    
    public void apprenti(String nom, String prenom, String mdp, int idSection, int idTuteur){
        
        if(!this.alreadyInDb(nom, prenom, mdp)){
            
            this.user(nom, prenom, mdp, "apprentis");
            String request = "INSERT INTO `apprentis` (`id_utilisateur`, `id_section`, `id_tuteur`) "
                           + "SELECT utilisateurs.id_utilisateur, sections.id_section, tuteurs.id_utilisateur "
                           + "FROM utilisateurs, sections, tuteurs "
                           + "WHERE utilisateurs.nom = '"+nom+"' "
                           + "AND utilisateurs.prenom = '"+prenom+"' "
                           + "AND utilisateurs.mot_de_passe = '"+mdp+"' "
                           + "AND sections.id_section = "+idSection+" "
                           + "AND tuteurs.id_utilisateur = "+idTuteur+"";
            this.db.edit(request);
        }
    }
    
    public void formateur(String nom, String prenom, String mdp, ArrayList<Integer> arraySections){
        if(!this.alreadyInDb(nom, prenom, mdp)){
            this.user(nom, prenom, mdp, "formateurs");
            this.userSections(nom, prenom, mdp, "formateurs", "formateur", arraySections);
        }
    }
    public void responsable(String nom, String prenom, String mdp, ArrayList<Integer> arraySections){
        if(!this.alreadyInDb(nom, prenom, mdp)){
            this.user(nom, prenom, mdp, "responsables");
            this.userSections(nom, prenom, mdp, "responsables", "responsable", arraySections);
        }
    }
    public void tuteur(String nom, String prenom, String mdp){
        if(!this.alreadyInDb(nom, prenom, mdp)){
            this.user(nom, prenom, mdp, "tuteurs");
        }
    }
    private void user(String nom, String prenom, String mdp, String type){
        
        String request = "INSERT INTO `utilisateurs` (`id_utilisateur`, `nom`, `prenom`, `mot_de_passe`) "
                        +"VALUES (NULL, '"+nom+"', '"+prenom+"', '"+mdp+"');";
        this.db.edit(request);
        
        if (type != "apprentis"){
            
            request = "INSERT INTO "+type+" (id_utilisateur) "
                + "SELECT id_utilisateur FROM utilisateurs "
                + "WHERE utilisateurs.nom = '"+nom+"' "
                + "AND utilisateurs.prenom = '"+prenom+"' "
                + "AND utilisateurs.mot_de_passe = '"+mdp+"' ";
            this.db.edit(request);
        }
    }
    private void userSections(String nom, String prenom, String mdp, String typeT, String typeC, ArrayList<Integer> arraySections){
            
        if (arraySections.size()>0){
            
            for (int section:arraySections)
            {

                String request = "INSERT INTO "+typeT+"_sections (id_"+typeC+", id_section) "
                        + "SELECT utilisateurs.id_utilisateur, sections.id_section "
                        + "FROM utilisateurs, sections "
                        + "WHERE utilisateurs.nom = '"+nom+"' "
                        + "AND utilisateurs.prenom = '"+prenom+"' "
                        + "AND utilisateurs.mot_de_passe = '"+mdp+"' "
                        + "AND sections.id_section = "+section+"";
                this.db.edit(request);
            }
        }   
    }
    private boolean alreadyInDb(String nom, String prenom, String mdp){
        
        String request = "SELECT id_utilisateur FROM utilisateurs "
                        + "WHERE nom = '"+nom+"' "
                        + "AND prenom = '"+prenom+"' "
                        + "AND mot_de_passe = '"+mdp+"'";
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

