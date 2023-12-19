package Com.sarthak;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    public static void main(String[] args) {
       
        String email1 = "test01\"gmail.com";
        String email2 = "student01@gmail.com";

      
        validateAndDisplay(email1);
        validateAndDisplay(email2);
    }

    private static void validateAndDisplay(String email) {
        if (isValidEmail(email)) {
            System.out.println("Valid Email Id");
        } else {
            System.out.println("Invalid Email Id");
        }
    }

    private static boolean isValidEmail(String email) {
       
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

      
        Pattern pattern = Pattern.compile(emailRegex);

        
        Matcher matcher = pattern.matcher(email);

        
        return matcher.matches();
    }
}
