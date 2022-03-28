import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the number for which you want a factorial for");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0 || n == 1) {
            System.out.println(1);
        } else {
            int fac = 1;
            while (n != 1) {
                fac = fac * n;
                n = n - 1;
            }
            System.out.println(fac);
        }
    }
}
