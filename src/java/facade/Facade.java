/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Athinodoros
 */
public class Facade implements JpaInterface{
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory(deploy.DeploymentConfiguration.PU_NAME);
    
    public String addPerson(String person) {
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        em.getTransaction().commit();
        return "";
    };

    @Override
    public String createPerson(Person pers) {
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        em.getTransaction().commit();
        return "";
    }

    @Override
    public String deletePerson(int id) {
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        em.getTransaction().commit();
        return "";
    }

    @Override
    public String updatePerson(int id) {
       EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        em.getTransaction().commit();
        return "";
    }

    @Override
    public Person getPerson(int id) {
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        em.getTransaction().commit();
        return "";
    }

    @Override
    public List<Person> getPersons() {
       EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        em.getTransaction().commit();
        return "";
    }

    @Override
    public String createCompany(Company comp) {
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        em.getTransaction().commit();
        return "";
    }

    @Override
    public String deleteCompany(int cvr) {
       EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        em.getTransaction().commit();
        return "";
    }

    @Override
    public String updateCompany(int cvr) {
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        em.getTransaction().commit();
        return "";
    }

    @Override
    public Company getCompany(int cvr) {
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        em.getTransaction().commit();
        return "";
    }

    @Override
    public List<Company> getCompanies() {
       EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        em.getTransaction().commit();
        return "";
    }
   
    
}
