import java.util.Scanner;

// Square root approach (Optimal solution)

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = in.nextInt();
        String ans = p(n);
        System.out.println(ans);
    }

    static String p(int n) {
        if (n < 2) {
            return ("Not Prime");
        }
        int i = 2;
        while (i * i <= n) {
            if (n % i == 0) {
                return ("Not Prime");
            }
            i++;
        }
        return ("Prime");
    }

}
