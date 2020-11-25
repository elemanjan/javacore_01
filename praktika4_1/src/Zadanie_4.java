import java.util.Arrays;
import java.util.Scanner;
//Считайте с консоли лист чисел, размером 10, затем n число,
// выведите новый лист с удаленным n числом

public class Zadanie_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++){
            nums[i] = sc.nextInt();
        }
        int[] temp = new int[nums.length-1];
        System.out.println("Enter the clean number: ");
        int clnIndex = sc.nextInt();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != clnIndex){
                    temp[count] = nums[i];
                    count++;
                }
            }
        System.out.println(Arrays.toString(temp));
        }
    }
