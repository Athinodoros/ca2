
package facade;

import entity.Company;
import entity.Person;
import java.util.List;

/**
 *
 * @author Rihards
 */
public interface JpaInterface {
    
    public Person createPerson(Person pers);
   
    public String deletePerson(int id);
    
    public String updatePerson(int id);
    
    public Person getPerson (int id);
   
    public List<Person> getPersons ();
    
    public Company createCompany(Company comp);
   
    public String deleteCompany(int cvr);
    
    public String updateCompany(int cvr);
    
    public Company getCompany (int cvr);
   
    public List<Company> getCompanies();
  
    
}
