/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

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
        Persistence.generateSchema("CA2TEST",null);
    }
}
