import java.util.Scanner;

public class AverageSum {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Input the 5 numbers:");
        int bir = read.nextInt();
        int eki = read.nextInt();
        int uch = read.nextInt();
        int tort = read.nextInt();
        int besh = read.nextInt();
        int summ = bir + eki + uch + tort + besh;
        double avg = summ / 5;
        System.out.println("The sum of 5 numbers is: " + summ);
        System.out.println("The Average is : " + avg);
    }
}
