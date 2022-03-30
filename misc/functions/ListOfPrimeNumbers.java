import java.util.Scanner;

public class ListOfPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int x = sc.nextInt();
        System.out.println("Enter the last number");
        int y = sc.nextInt();
        for (int i = x; i <= y; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    static boolean isPrime(int n) {
        int c = 2;
        if (n < 2) {
            return false;
        }
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}
