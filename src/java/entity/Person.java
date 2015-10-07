package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

/**
 *
 * @author favl
 */
@Entity
public class Person extends InfoEntity implements Serializable
{
//    private static final long serialVersionUID = 1L;
   
    private String firstName;
    private String lastName;
    
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Hobby> hobbies = new ArrayList();

    public Person()
    {
    }

    public Person(String firstName, String lastName, String email, Address address, List<Phone> phones)
    {
        super(email, address, phones);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public List<Hobby> getHobbies()
    {
        return hobbies;
    }

    public void setHobbies(List<Hobby> hobbies)
    {
        this.hobbies = hobbies;
    }

    
    
}
