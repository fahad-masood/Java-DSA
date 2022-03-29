import java.util.Scanner;

public class IsEven {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println(IsEven(x));
    }

    static boolean IsEven(int x) {
        if (x % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
