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
        TestAdd testadd = new TestAdd();
        testadd.execute();
    }
    
}
