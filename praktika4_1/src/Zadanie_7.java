import java.util.Arrays;
import java.util.Scanner;

//Считайте с консоли лист чисел, размером 10,
// затем выведите второе наибольшее число в листе

public class Zadanie_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] list = new int[5];
        for (int i = 0; i < list.length; i++) {
            System.out.println("Enter the number:");
            list[i] = scan.nextInt();
        }
        int max = 0;
        int secondMax = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] > max){
                max = list[i];
            }
        }
        for (int i = 0; i < list.length; i++){
            if (list[i] > secondMax && list[i] < max){
                secondMax = list[i];
                }
            }
        System.out.println(secondMax);
    }
}
