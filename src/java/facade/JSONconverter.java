package facade;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entity.Company;
import java.util.List;

/**
 *
 * @author favl
 */
public class JSONconverter
{
    private static Gson gson = new GsonBuilder().setPrettyPrinting().setFieldNamingPolicy(FieldNamingPolicy.IDENTITY).create();
    
    public static Company getCompanyFromJSON(String json) //CREATING, EDITING COMPANY
    {
        return gson.fromJson(json, Company.class);
    }
    
    public static String getJSONFromCompany(Company co) //READING, DELETING COMPANY
    {
        return gson.toJson(co);
    }
    
    public static String getJSONFromCompany(List<Company> companies) //GET LIST
    {
        return gson.toJson(companies);
    }
}
