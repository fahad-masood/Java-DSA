import java.util.Scanner;

// Sum of all integers till the user hits 0

public class SumOfAllIntegers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int i;
        do {
            i = in.nextInt();
            sum = sum + i;

        } while (i != 0);

        System.out.println(sum);

    }

}
