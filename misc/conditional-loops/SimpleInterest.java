import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal");
        long p = sc.nextLong();
        System.out.println("Enter rate in percentage");
        float r = sc.nextFloat();
        System.out.println("Enter time");
        float t = sc.nextFloat();
        System.out.println("Simple interest: " + p*(r/100)*t);
    }
}
