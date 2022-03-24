import java.util.Scanner;

// Print largest integer when the user hits 0

public class LargestInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = 0;
        int i;
        do {
            i = in.nextInt();
            if (i > max) {
                max = i;
            }
        } while (i != 0);
        System.out.println(max);
    }
}
