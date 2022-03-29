import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        int max = Max(x, y, z);
        int min = Min(x, y, z);
        System.out.println("Maximum is " + max);
        System.out.println("Minimum is " + min);
    }

    static int Max(int x, int y, int z) {
        int max = x;
        if (max < y) {
            max = y;
        }
        if (max < z) {
            max = z;
        }
        return max;
    }

    static int Min(int x, int y, int z) {
        int min = x;
        if (min > y) {
            min = y;
        }
        if (min > z) {
            min = z;
        }
        return min;
    }

}
