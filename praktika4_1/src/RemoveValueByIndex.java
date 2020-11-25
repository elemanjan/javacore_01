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
        int clnNum = sc.nextInt();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != clnNum){
                temp[i] = nums[i];
            }
            else i++;
        }
        System.out.println(Arrays.toString(temp));
    }
}
