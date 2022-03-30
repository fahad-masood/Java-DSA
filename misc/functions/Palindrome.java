import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer:");
        String p = in.next();
        boolean palindrome = isPalindrome(p);
        if (palindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palidrome");
        }
    }

    static boolean isPalindrome(String p) {
        int length = p.length();
        for (int i = 0; i < length / 2; i++) {
            if (p.charAt(i) != p.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

}
