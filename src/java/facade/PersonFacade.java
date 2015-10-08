package facade;

import entity.Person;
import exception.PersonNotFoundException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Athinodoros
 */
public class PersonFacade implements PersonInterface {

    EntityManagerFactory emf ;

    public PersonFacade(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    

    @Override
    public Person createPerson(Person p) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
            return p;
        } finally {
            em.close();
        }
    }

    @Override
    public Person deletePerson(Person p) throws PersonNotFoundException {
        EntityManager em = emf.createEntityManager();
        try {
            Person pers = em.find(Person.class, p.getId());
            if (pers == null) {
                throw new PersonNotFoundException("No Person found with provided id");
            }
            em.getTransaction().begin();
            em.remove(pers);
            em.getTransaction().commit();
            return pers;
        } finally {
            em.close();
        }
    }

    @Override
    public Person updatePerson(Person p) throws PersonNotFoundException {
        EntityManager em = emf.createEntityManager();
        try {
            Person edited = em.find(Person.class, p.getId());
                if(edited == null){
                  throw new PersonNotFoundException("No Person found with provided id");
                }
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
    public Person getPerson(long id) throws PersonNotFoundException {
        EntityManager em = emf.createEntityManager();
        try {
            Person p = em.find(Person.class, id);
            if (p == null) {
                throw new PersonNotFoundException("No Person found with provided id");
            }
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
