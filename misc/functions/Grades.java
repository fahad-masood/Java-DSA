import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your marks out of 100: ");
        float m = in.nextFloat();
        String grade = Grade(m);
        System.out.println(grade);
    }

    static String Grade(float m) {
        if (m <= 100 && m > 90)
            return ("AA");
        else if (m <= 90 && m > 80)
            return ("AB");
        else if (m <= 80 && m > 70)
            return ("BB");
        else if (m <= 70 && m > 60)
            return ("BC");
        else if (m <= 60 && m > 50)
            return ("CD");
        else if (m <= 50 && m > 40)
            return ("DD");
        else if (m <= 40 && m >= 0)
            return ("Fail");
        else
            return ("Enter marks between 0 and 100 (both inclusive)");
    }

}
