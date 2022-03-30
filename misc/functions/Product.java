import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        float x = in.nextFloat();
        float y = in.nextFloat();
        float product = Product(x, y);
        System.out.println("The product of " + x + " and " + y + " is " + product);
    }

    static float Product(float x, float y) {
        return x * y;
    }

}
