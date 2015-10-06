/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Athinodoros
 */
public class Facade {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory(deploy.DeploymentConfiguration.PU_NAME);
    
    public String addPerson(String person) {
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        em.getTransaction().commit();
        return "";
    };
   
    
}
