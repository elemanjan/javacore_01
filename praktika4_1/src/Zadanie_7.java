import java.util.Arrays;
import java.util.Scanner;

//Считайте с консоли лист чисел, размером 10,
// затем выведите второе наибольшее число в листе

public class Zadanie_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] list = new int[5];
        int value = 0;
        for (int i = 0; i < list.length; i++) {
            list[i] = scan.nextInt();
        }
        for (int i = 0; i < list.length; i++) {
            if (i < list.length-1){
                if (list[i] > list[i+1]){
                    value = list[i];
                }
//                else value = list
            }
        }
        System.out.println(value);
    }
}
