/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package penselink.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 *
 * @author Geovan
 */
public class dbSingleton {
    static EntityManagerFactory entityManagerFactory = null;
    
    public static EntityManager getEntityManager (){
        if (entityManagerFactory==null){
            try{
                entityManagerFactory = Persistence.createEntityManagerFactory("managed_site_PU");
                
            }catch(Exception e ){
                JOptionPane.showMessageDialog(null, "Erro " +e);
            }
        }
        return entityManagerFactory.createEntityManager();
    }
}
