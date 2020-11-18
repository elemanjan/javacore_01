import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = 0;
        int b = 0;
        String str = "";
        System.out.print("Enter numbers from 0 to 100: ");
        a = read.nextInt();
        if ( a > 0 && a < 100 ) {
            System.out.print("Enter numbers from 0 to 100: ");
            b = read.nextInt();
            if ( b > 0 && b < 100 ) {
                System.out.print("Enter operations: ");
                str = read.next();
            }
            else {
                System.out.println("Incorrect number!!!");
            }
        }
        else {
            System.out.println("Incorrect number!!!");
        }
        if (str.equals("+"))
        {
            System.out.print("Result: " + (a + b));
        }
        else if(str.equals("-"))
        {
            System.out.print("Result: " + (a - b));
        }
        else if(str.equals("*"))
        {
            System.out.print("Result: " + (a * b));
        }
        else if(str.equals("/"))
        {
            if(b == 0)
            {
                System.out.print("Division by zero is not possible");
            }
            else
            System.out.print("Result: " + (a / b));
        }
    }
}
