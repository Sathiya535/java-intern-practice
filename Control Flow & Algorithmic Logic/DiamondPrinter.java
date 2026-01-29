import java.util.Scanner;
 class DiamondPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // example: 7

        int mid = n / 2;
        for (int i = 0; i <= mid; i++) {
            for (int s = 0; s < mid - i; s++)
                System.out.print(" ");
            for (int star = 0; star < 2 * i + 1; star++)
                System.out.print("*");
            System.out.println();
        }

        for (int i = mid - 1; i >= 0; i--) {
            for (int s = 0; s < mid - i; s++)
                System.out.print(" ");
            for (int star = 0; star < 2 * i + 1; star++)
                System.out.print("*");
            System.out.println();
        }
    }
}
