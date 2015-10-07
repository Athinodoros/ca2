
package JUnit;

import entity.Address;
import entity.CityInfo;
import entity.Company;
import entity.Phone;
import facade.CompanyFacade;
import java.util.ArrayList;
import javax.persistence.Persistence;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Rihards
 */
public class JUnitTest {
    
    CompanyFacade cf;
    
    public JUnitTest() {
        cf = new CompanyFacade(Persistence.createEntityManagerFactory("CA2PU2"));
    }
    
    @Test
    public void testCreateCompany()
    {
        Company c = new Company("testCompany", "testDescription", 12345678, 20, 
                                "testMarketValue", "test@mail.com", new Address("testStreet", 
                                "testAdditionalInfo", new CityInfo(9999, "testCity")), new ArrayList(){

            @Override
            public boolean add(Object e)
            {
                return super.add(new Phone(23728394, "testDescription")); //To change body of generated methods, choose Tools | Templates.
            }
        });
        Company cReturned = cf.createCompany(c);
        Assert.assertEquals("Something went wrong:", c, cReturned);
    }
}
