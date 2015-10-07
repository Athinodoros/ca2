/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entity.Address;
import entity.Person;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Athinodoros
 */
public class Test {
    public static void main(String[] args) {
        //EntityManagerFactory emf = Persistence.createEntityManagerFactory("CA2PU");
        //Persistence.generateSchema("CA2PU",null);
        //Persistence.generateSchema("CA2TEST",null);
        
        Address adress = new Address("novembervej 13", "nice place", null);
        Person p = new Person( "Nos", "Sgouros", "athino@hotmail.com", adress);
        Person p2 = new Person( "Nos", "Sgouros", "athino@hotmail.com", adress);
        Person p3 = new Person( "Nos", "Sgouros", "athino@hotmail.com", adress);
        
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CA2TEST");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(p);
        em.persist(p2);
        em.persist(p3);
        em.getTransaction().commit();
        
        
    }
}
