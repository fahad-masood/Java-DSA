import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int x = in.nextInt();
        String ans = Eligibility(x);
        System.out.println(ans);
    }

    static String Eligibility(int x) {
        if (x >= 18) {
            return ("You are eligibile to vote.");
        } else {
            return ("You are not eligibile to vote.");
        }
    }

}
