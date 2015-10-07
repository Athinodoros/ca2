package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author favl
 */
@Entity
public class CityInfo implements Serializable
{
//    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int zipCode;
    private String city;
    @OneToMany(mappedBy = "cityInfo", cascade = CascadeType.ALL)
    private List<Address> addresses = new ArrayList();

    public CityInfo()
    {
    }

    public CityInfo(int zipcodeCode, String city)
    {
        this.zipCode = zipcodeCode;
        this.city = city;
    }
    
    public void addAddressToCityInfo(Address address)
    {
        addresses.add(address);
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public int getzipcodeCode()
    {
        return zipCode;
    }

    public void setzipcodeCode(int zipcodeCode)
    {
        this.zipCode = zipcodeCode;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public List<Address> getAddresses()
    {
        return addresses;
    }

    public void setAddresses(List<Address> addresses)
    {
        this.addresses = addresses;
    }
    
    
}
