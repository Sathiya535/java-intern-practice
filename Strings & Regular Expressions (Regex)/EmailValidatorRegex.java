import java.util.Scanner;

public class EmailValidatorRegex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Regex pattern for email validation
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        System.out.print("Enter email id: ");
        String email = sc.nextLine();

        // Validate email using regex
        if (email.matches(regex)) {
            System.out.println(email + " -> true (Valid Email)");
        } else {
            System.out.println(email + " -> false (Invalid Email)");
        }

        
    }
}
