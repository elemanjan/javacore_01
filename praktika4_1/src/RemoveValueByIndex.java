import java.util.Arrays;
import java.util.Scanner;

public class RemoveValueByIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++){
            nums[i] = sc.nextInt();
        }
        int[] temp = new int[nums.length];
        System.out.println("Enter the clean number: ");
        int clnIndex = sc.nextInt();
        for (int i = 0; i < nums.length; i++) {
            if (i == clnIndex){
                if (i < nums.length-1){
                    temp[clnIndex] = nums[i+1];
                }
            }
            else temp[i] = nums[i];
        }
        System.out.println(Arrays.toString(temp));
    }
}