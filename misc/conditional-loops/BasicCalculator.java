import java.util.Scanner;

public class BasicCalculator {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program takes in + - * / as operators");
        while(true){

            System.out.println("Enter first number");
            float a = sc.nextFloat();
            System.out.println("Enter second number");
            float b = sc.nextFloat();
            System.out.println("Enter operator");
            char op = sc.next().trim().charAt(0);
            
            if(op == '+'){
                System.out.println(a+b);
            }if(op == '-')
            {
                System.out.println(a-b);
            }if(op == '*')
            {
                System.out.println(a*b);
            }if(op == '/')
            {
                if(b!=0){
                    System.out.println(a/b);
                }
            }
            if (op == 'x' || op == 'X')
            {
                break;
            }else{
                System.out.println("Enter X or x to close the program");
            }    
        }
    }
}
