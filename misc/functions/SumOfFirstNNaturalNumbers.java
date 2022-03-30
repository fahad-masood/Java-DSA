import java.util.Scanner;

public class SumOfFirstNNaturalNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number upto which you want the sum for: ");
        int n = in.nextInt();
        int sum = Sum(n);
        System.out.println("Sum of first " + n + " natural numbers is " + sum);
    }

    static int Sum(int n) {
        int sum = (n / 2) * (1 + n);
        return sum;
    }

}
