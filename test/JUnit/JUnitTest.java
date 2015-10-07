
package JUnit;

import entity.Address;
import entity.CityInfo;
import entity.Company;
import entity.Phone;
import facade.CompanyFacade;
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
        Phone p1 = new Phone(23728394, "Freddy's Phone");
        Phone p2 = new Phone(20962783, "Line's Phone");
        Phone p3 = new Phone(48484848, "Taxi Nordsjl");
        Company c = new Company("testCompany", "testDescription", 12345678, 20, 
                                "testMarketValue", "test@mail.com", new Address("testStreet", 
                                "testAdditionalInfo", new CityInfo(9999, "testCity")));
        c.addPhoneToEntity(p1);
        c.addPhoneToEntity(p2);
        c.addPhoneToEntity(p3);
        cf.createCompany(c);
        Assert.assertNotNull(c.getId());
    }
    
//    @Test
//    public void testGetCompany()
//    {
//        List<String> c = cf.getCompanyTest(23355673);
//        System.out.println("what aeiohfskz" + c.toString());
//    }
}
