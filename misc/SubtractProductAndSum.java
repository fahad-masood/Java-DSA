import java.util.Scanner;

public class SubtractProductAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int length = String.valueOf(n).length();
        int sum = 0;
        int product = 1;
        for (int i = 0; i <= length - 1; i++) {
            int x = n % 10;
            sum = sum + x;
            product = product * x;
            n = n / 10;
        }
        System.out.println(product - sum);
    }

}
