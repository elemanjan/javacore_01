import java.util.Scanner;

public class FindCub {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double num = read.nextInt();
        System.out.println(num * num * num);
        System.out.println(Math.pow(num, 3));
    }
}
