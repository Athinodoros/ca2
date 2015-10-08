package facade;

<<<<<<< Updated upstream
=======
import entity.CityInfo;
>>>>>>> Stashed changes
import entity.Person;
import exception.PersonNotFoundException;
import java.util.List;

/**
 *
 * @author Rihards
 */
public interface PersonInterface
{

    public CityInfo getCityInformation(int zipCode);

    public Person createPerson(Person p);
<<<<<<< Updated upstream
    public Person deletePerson(Person p)throws PersonNotFoundException;;
    public Person updatePerson(Person p)throws PersonNotFoundException;;
    public Person getPerson (long id)throws PersonNotFoundException;;
    public List<Person> getPersons ();
 
=======

    public Person deletePerson(Person p);

    public Person updatePerson(Person p);

    public Person getPerson(long id);

    public List<Person> getPersons();

>>>>>>> Stashed changes
}
