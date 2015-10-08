package facade;

import entity.CityInfo;
import entity.Company;
import exception.CompanyNotFoundException;
import java.util.List;

/**
 *
 * @author favl
 */
public interface CompanyInterface 
{

    public CityInfo getCityInformation(int zipCode);

    public Company createCompany(Company comp);
<<<<<<< Updated upstream
    public Company getCompany (long cvr)throws CompanyNotFoundException;
    public Company updateCompany(Company comp)throws CompanyNotFoundException;
    public Company deleteCompany(Company comp)throws CompanyNotFoundException;
=======

    public Company getCompany(int cvr);

    public Company updateCompany(Company comp);

    public Company deleteCompany(Company comp);

>>>>>>> Stashed changes
    public List<Company> getCompanies();
}