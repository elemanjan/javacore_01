import java.util.Scanner;

public class SumOfEveryNum {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        String nums = sc.nextLine();
        int sum = 0;
        String[] numArr = nums.split("");
        for (int i = 0; i < numArr.length; i++){
            sum += Integer.parseInt(numArr[i]);
        }
        System.out.println("The digit sum is: " + sum);
    }
}
