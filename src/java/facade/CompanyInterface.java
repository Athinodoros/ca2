package facade;

import entity.Company;
import exception.CompanyNotFoundException;
import java.util.List;

/**
 *
 * @author favl
 */
public interface CompanyInterface
{
    public Company createCompany(Company comp);
    public Company getCompany (int cvr) throws CompanyNotFoundException;
    public Company updateCompany(Company comp) throws CompanyNotFoundException;
    public Company deleteCompany(Company comp) throws CompanyNotFoundException;
    public List<Company> getCompanies();
}
