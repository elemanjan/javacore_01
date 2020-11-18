import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = read.nextInt();
        if (number >= 0){
            System.out.println("it is " + number + " and is positive number");
        }
        else
            System.out.println("it is " + number + " and is negative number");
    }
}
