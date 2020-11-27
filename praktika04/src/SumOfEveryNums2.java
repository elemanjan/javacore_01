import java.util.Scanner;

public class SumOfEveryNums2 {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        int sum = 0;
        int i = 0;
        /*String[] numArr = nums.split("");
        for (int i = 0; i < numArr.length; i++){
            sum += Integer.parseInt(numArr[i]);
        }*/
        for (i = nums; i > 0; i /= 10){
            sum += i % 10;
        }
        System.out.println("The digit sum is: " + sum);
    }
}
