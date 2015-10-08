package facade;

import entity.CityInfo;
import entity.Person;
import exception.PersonNotFoundException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Athinodoros
 */
public class PersonFacade implements PersonInterface {

<<<<<<< Updated upstream
    EntityManagerFactory emf ;

    public PersonFacade(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    

    @Override
    public Person createPerson(Person p) {
        EntityManager em = emf.createEntityManager();
=======
    private EntityManagerFactory emf;
    
    public PersonFacade(EntityManagerFactory e)
    {
        this.emf = e;
    }
    
    public EntityManager getEntityManager()
    {
        return emf.createEntityManager();
    }
    
    @Override
    public CityInfo getCityInformation(int zipCode)
    {
        EntityManager em = getEntityManager();
        return em.find(CityInfo.class, zipCode);
    }
    
    @Override
    public Person createPerson(Person p)    {
        EntityManager em = getEntityManager();
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
    public Person deletePerson(Person p) throws PersonNotFoundException {
        EntityManager em = emf.createEntityManager();
=======
    public Person deletePerson(Person p) {
        EntityManager em = getEntityManager();
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
    public Person updatePerson(Person p) throws PersonNotFoundException {
        EntityManager em = emf.createEntityManager();
=======
    public Person updatePerson(Person p) {
        EntityManager em = getEntityManager();
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
    public Person getPerson(long id) throws PersonNotFoundException {
        EntityManager em = emf.createEntityManager();
=======
    public Person getPerson(long id) {
        EntityManager em = getEntityManager();
>>>>>>> Stashed changes
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
        EntityManager em = getEntityManager();
        try {
            return em.createQuery("select p from Person p").getResultList();
        } finally {
            em.close();
        }
    }

}
