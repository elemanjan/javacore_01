import java.util.Arrays;
import java.util.Scanner;

public class SquareOfNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++){
            nums[i] = sc.nextInt();
            nums[i] = nums[i] * nums[i];
        }
        System.out.println(Arrays.toString(nums));
    }
}
