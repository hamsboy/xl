
/**
 * This program is used to check if a given zip code,Password or SSN is valide.
 *
 * @author 
 * @version 
 */
public class Validations
{
    /**
     * 
     *
     * @param  
     * @return a boolean type
     */


    public static boolean validateZipCode(String zip){
        return zip.matches("[0-9]{5}");
    }


    /**
     *
     *
     * @param  
     *@return boolean type
     */
    public static boolean validateSocial(String social)
    {
        return social.matches("\\d{3}-\\d{2}-\\d{4}");
    }


    /**
     * 
     *
     * @param
     * @return  a boolean type
     */
    public static boolean validatePassword(String password)
    {

        return password.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

     }
}
