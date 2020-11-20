import java.util.Scanner;

public class SumofArraysValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers will you enter? ");
        int qNums = sc.nextInt();
        System.out.println("Enter numbers: ");
        int[] numArr = new int[qNums];
        int sum = 0;
        for (int i = 0; i <numArr.length; i++){
            numArr[i] = sc.nextInt();
            sum += numArr[i];
        }
        System.out.println("Sum: " + sum + ", Average: " + sum / qNums);
    }
}
