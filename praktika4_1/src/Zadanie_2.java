import java.util.Arrays;
import java.util.Scanner;
//Считайте с консоли лист чисел, размером 10, затем n число,
// выведите индекс n числа в листе если он есть

public class Zadanie_2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++){
            nums[i] = read.nextInt();
        }
        System.out.println("Enter the searched number: ");
        int srchNum = read.nextInt();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == srchNum){
                stringBuilder.append(i + ",");
            }
        }
        System.out.println("The searched number on " + stringBuilder + "index");
    }
}
