/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cns;

/**
 *
 * @author john
 */
public class UserAdd {
    
    private String nom, prenom, mdp, typeUser;
    private DataBase db;
    public UserAdd(String nom, String prenom, String mdp, String typeUser){
        this.nom = nom;
        this.prenom = prenom;
        this.mdp = mdp;
        this.typeUser = typeUser;
        this.db = new DataBase();
        this.addUser();
    }
    private void addUser(){
        switch (typeUser)
        {
            case "Apprenti":
            this.apprenti();
            break;  
            
            case "Formateur":
            this.formateur();
            break;
            
            case "Responsable":
            this.responsable();
            break;
            
            case "Tuteur":
            this.tuteur();
            break;
            
            default:
            /*Action*/;             
        }
    }
    private void apprenti(){
        
    }
    private void formateur(){
        
    }
    private void responsable(){
        
    }
    private void tuteur(){
        
    }
}
