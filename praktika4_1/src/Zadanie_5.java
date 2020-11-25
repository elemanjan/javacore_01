import java.util.Arrays;
import java.util.Scanner;
//Считайте с консоли лист чисел, размером 10, затем n число,
// выведите новый лист собратной стороны

public class Zadanie_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length ; i++) {
            temp[i] = nums[nums.length-i-1];
        }
        System.out.println(Arrays.toString(temp));
    }
}
