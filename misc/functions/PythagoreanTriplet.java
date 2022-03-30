import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers in increasing order: ");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        boolean ans = PT(x, y, z);
        if (ans)
            System.out.println("Pythagorean triplet");
        else
            System.out.println("Not a pythagorean triplet");
    }

    static boolean PT(int x, int y, int z) {
        if (x * x + y * y == z * z)
            return true;
        return false;
    }

}
