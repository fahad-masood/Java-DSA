import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        String n = sc.nextLine();
        int length = n.length();
        for (int i = 0; i < n.length() / 2; i++) {
            if (n.charAt(i) != n.charAt(length - 1)) {
                System.out.println("Not Palindrome");
                return;
            }
            length--;
        }
        System.out.println("Palindrome");
    }

}
