import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String x = sc.nextLine();
        int length = x.length();
        String output = "";
        for (int i = x.length() - 1; i >= 0; i--) {
            output = output + x.charAt(i);
        }
        System.out.println(output);
    }
}
