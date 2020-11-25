import java.util.Arrays;
import java.util.Scanner;
//Считайте с консоли лист чисел, размером 10, затем n число,
// удалите число находящий в индексе n

public class Zadanie_3 {
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
                System.out.print(nums[i] + " ");
            }
        }
    }
}
