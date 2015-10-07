package facade;

import entity.InfoEntity;
import entity.Person;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 *
 * @author Athinodoros
 */
public class PersonFacade implements PersonInterface {

    EntityManagerFactory emf;

    public PersonFacade( EntityManagerFactory emf ) {
        this.emf =emf;
    }

    
    
    @Override
    public Person createPerson(Person p) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
            InfoEntity inf = em.find(InfoEntity.class, (long)em.createQuery("select p from InfoEntity p ").getResultList().size());
            System.out.println((long)em.createQuery("select p from InfoEntity p ").getResultList().size()-1 +" sadasdasdasdasddddddddddddddddd"
                    + ""
                    + ""
                    + ""
                    + ""
                    + "asdasdasdasdadasd");
            System.out.println(" ");
            System.out.println(JSONconverter.getJSONFromPerson(p));
            //JOptionPane.showMessageDialog(null,p.toString());
            return (Person) inf;
        } finally {
            em.close();
        }
    }

    @Override
    public Person deletePerson(Person p) {
        EntityManager em = emf.createEntityManager();
        try {
            Person pers = em.find(Person.class, p.getId());
            em.getTransaction().begin();
            em.remove(pers);
            em.getTransaction().commit();
            
            return pers;
        } finally {
            em.close();
        }
    }

    @Override
    public Person updatePerson(Person p) {
        EntityManager em = emf.createEntityManager();
        try {
            Person edited = em.find(Person.class, p.getId());
            edited.setFirstName(p.getFirstName());
            edited.setLastName(p.getLastName());
            edited.setAddress(p.getAddress());
            edited.setEmail(p.getEmail());
            edited.setHobbies(p.getHobbies());
            edited.setPhones(p.getPhones());

            em.getTransaction().begin();
            em.merge(edited);
            em.getTransaction().commit();
            return edited;
        } finally {
            em.close();
        }
    }

    
    @Override
    public Person getPerson(long id) {
        EntityManager em = emf.createEntityManager();
        try {
            Person p = em.find(Person.class, id);
            return p;
        } finally {
            em.close();
        }
    }

    @Override
    public List<Person> getPersons() {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("select p from Person p").getResultList();
        } finally {
            em.close();
        }
    }

}
