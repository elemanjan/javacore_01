import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Input the 1st number");
        int a = read.nextInt();
        System.out.println("Input the 2nd number");
        int b = read.nextInt();
        System.out.println("Input the 3rd number");
        int c = read.nextInt();
        if (a > b){
            if (a > c){
                System.out.println("The greatest: " + a);
            }
            else{
                System.out.println("The greatest: " + c);
            }
        }
        else{
            System.out.println("The greatest: " + b);
        }
    }
}
