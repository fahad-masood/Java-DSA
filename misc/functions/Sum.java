import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers");
        float x = in.nextFloat();
        float y = in.nextFloat();
        float sum = Sum(x, y);
        System.out.println("Sum is " + sum);
    }

    static float Sum(float x, float y) {
        return x + y;
    }
}
