package facade;

import entity.Company;
import java.util.List;

/**
 *
 * @author favl
 */
public interface CompanyInterface
{
    public Company createCompany(Company comp);
    public Company getCompany (long cvr);
    public Company updateCompany(Company comp);
    public Company deleteCompany(Company comp);
    public List<Company> getCompanies();
}
