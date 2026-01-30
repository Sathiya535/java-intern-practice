import java.util.Scanner;

class EmailValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Number of email
        int emailCount = scanner.nextInt();
        scanner.nextLine(); /*Scanner.nextInt() does not consume the newline character, so nextLine() may read an empty string unless the buffer is cleared.*/      

        String[] emails = new String[emailCount];

        for(int i = 0; i < emails.length; i++) {
            System.out.print((i + 1) + " Enter the mail id: ");
            emails[i] = scanner.nextLine();
            System.out.println(emails[i] + " -> " + isValidEmail(emails[i]));
            System.out.println("------*------");
        }
    }

    public static boolean isValidEmail(String email) {
        for(int i = 0; i < email.length(); i++) {
            //Check the empty spaces
            if(email.charAt(i) == ' ')
                return false;
        }
        //track the @ symbol count and index
        int atIndex = 0, count = 0;
        for(int i = 0; i < email.length(); i++) {
            if(email.charAt(i) == '@') {
                atIndex = i;
                count++;
            }
        }
        //In email id have only one @ symbol,and it should not in the front and end of the id.

        if(count != 1 || atIndex == 0 || atIndex == email.length() - 1)
            return false;
        //after @ symbol,the email holds domain
        String domain = email.substring(atIndex + 1);

        if(!domain.contains(".") || domain.endsWith("."))
            return false;

        int dotIndex = domain.lastIndexOf(".");

        //extentions shuold be > =2 
        String extension = domain.substring(dotIndex + 1);

        return extension.length() >= 2;
    }
}
