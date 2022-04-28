import java.util.Scanner;

/**
 * This program is used to check if a given zip code,Password or SSN is valide.
 *
 * @author 
 * @version 
 */
public class ValidationApp
{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        int num;
        do {
            menu();
            while(!input.hasNextInt()){
                System.out.println("Enter a Number from 0 to 4 ");
                input.next();
            }
            num =input.nextInt();

            switch (num){
                case 0:
                System.out.println("Thank you for using my application");
                break;
                case 1:
                verifyZipCode(input);
                break;
                case 2:
                verifySocialSecurityNumber(input);
                break;
                case 3:
                verifyPassword(input);
                break;
                default:
                System.out.println("Enter a Number from 0 to 4 ");

            }


        }while (num!=0);
    }



    /**
     * This method will display a menu starting from 0 to 4 for the client to choose.
     *
     *
     *
     */
    public static void menu(){
        System.out.println("Enter a Number from 0 to 4");
        System.out.println("\t1.validate zip code\n\t2.validate SSN\n\t3.validate Password\n\t4.instructions\n\t0.quit");

    }
    
    public static void verifyPassword(Scanner input) {
        System.out.println("Enter The Password:");
        String password=input.next();
        if (!Validations.validatePassword(password)){
            System.out.println("Invalid Password, please follow the Instructions and Enter a valid Number Make sure the length is 8");
        }
        else{
            System.out.println("The password is valid");

        }
    }
    
    public static void verifyZipCode(Scanner input) {
        System.out.println("Enter the zip code: ");
        String zipCode=input.next();
        if (!Validations.validateZipCode(zipCode)){
            System.out.println("The zip code is invalid! please try again and enter a valid zip code\n");
        }
        else{
            System.out.println("The zip code is valid");
        }
    }
    
     public static void verifySocialSecurityNumber(Scanner input) {
         System.out.println("Enter the SSN:");
        String securityNumber=input.next();
        if (!Validations.validateSocial(securityNumber) ){
            System.out.println("Invalid Social Security Number, please follow the Instructions and Enter a valid Number");
        }
        else{
            System.out.println("The Social Security Number is valid");
        }
        
    }
    
}
