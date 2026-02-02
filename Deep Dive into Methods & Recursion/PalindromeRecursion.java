import java.util.Scanner;

class PalindromeRecursion {

    static boolean isPalindrome(String s,int i,int j) {
        // Base case
        if (s.length() <= 1||j<=i) {
            return true;
        }

        // Check first and last character
        if (s.charAt(i) != s.charAt(j)) {
            return false;
        }
        

        // Recursive call
        return isPalindrome(s,i+1,j-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int i=0;
        int j=str.length()-1;

        if (isPalindrome(str,i,j)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        
    }
}
