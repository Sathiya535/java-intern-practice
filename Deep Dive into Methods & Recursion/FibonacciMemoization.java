import java.util.Scanner;

class FibonacciMemoization {

    static int[] memo = new int[100]; // to store calculated values

    static int fib(int n) {
        // Base cases
        if (n <= 1) {
            return n;
        }

        // If already calculated, return it
        if (memo[n] != 0) {
            return memo[n];
        }

        // Calculate, store, and return
        memo[n] = fib(n - 1) + fib(n - 2);
        return memo[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci of " + n + " is: " + fib(n));

        
    }
}
