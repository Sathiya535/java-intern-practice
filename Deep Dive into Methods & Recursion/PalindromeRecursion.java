import java.util.Scanner;

class PalindromeRecursion {

    static boolean isPalindrome(String s) {
        // Base case
        if (s.length() <= 1) {
            return true;
        }

        // Check first and last character
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }

        // Recursive call
        return isPalindrome(s.substring(1, s.length() - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (isPalindrome(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        
    }
}
