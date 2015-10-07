
package facade;

import entity.Company;
import entity.Person;
import java.util.List;

/**
 *
 * @author Rihards
 */
public interface PersonInterface {
    
    public Person createPerson(Person p);
    public Person deletePerson(Person p);
    public Person updatePerson(Person p);
    public Person getPerson (int id);
    public List<Person> getPersons ();
 
}
