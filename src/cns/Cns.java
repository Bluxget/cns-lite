/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cns;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author john
 */
public class Cns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Throwable {
        
        //UserList users = new UserList();
        //users.afficher();
        //ArrayList<String> listeNomSections = users.getListeNomSections();
        
        //for(int section:listeSections){System.out.println(section);}
        //System.out.println(users.getSectionId("SLAM"));
        //System.out.println(users.getSectionName(1));
        
        ///////////////////////////////////////////////////////////////////////
        //  LA PARTIE USERADD EST FONCTIONNELLE !!!                          //
        ///////////////////////////////////////////////////////////////////////
        
        //UserAdd userAdd = new UserAdd();
        //userAdd.apprenti("test", "test", "test", 1, 10);
        //ArrayList<Integer> sections = new ArrayList();
        //sections.add(1);
        //sections.add(2);
        //userAdd.formateur("test", "test", "testo",sections);
        //userAdd.responsable("test", "test", "testo", sections);
        ///////////////////////////////////////////////////////////////////////
        //  PARTIE USERDELETE FONCTIONNEL                                       //
        ///////////////////////////////////////////////////////////////////////
        //UserDelete usrDlt = new UserDelete(30,"formateur");
        //usrDlt.confirm();
        //GuiUserAdd guiAdd = new GuiUserAdd();
        //guiAdd.execute();
        //String test = "testA:testB";
        //String[] arr = test.split(":");
        //System.out.println(arr[0]+" "+arr[1]);
        //for(String str:arr){System.out.println(str);}
        //TestMainGui testMainGui = new TestMainGui();
        //testMainGui.execute();
        GuiUserUpdate guiUsrUp = new GuiUserUpdate(1,"formateurs");
        guiUsrUp.execute();
        //UserList usrList = new UserList();
        //String [][] tab = usrList.getApprentisTab();
        
        //System.out.println(tab[3][2]);
        
    }
    
}
