import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a non-negative integer: ");
        long n = in.nextLong();
        long fact = Factorial(n);
        System.out.println(fact);
    }

    static long Factorial(long n){
        if(n == 0 || n == 1){
            return 1;
        }
        else if (n > 1){
            long product = 1;
            for(long i = n; i > 1; i --){
                product = product * i;
            }
            return product;
        }
        return 0;
    }
    
}
