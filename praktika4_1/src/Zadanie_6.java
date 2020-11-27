import java.util.Arrays;
import java.util.Scanner;
//Считайте с консоли 2 листа чисел, размером 10,
// затем выведите общие значения листов

public class Zadanie_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] list1 = new int[10];
        int[] list2 = new int[10];
        int flag = 0;
        int counter = 0;
        System.out.println("Enter the values 1st list");
        for (int i = 0; i < list1.length ; i++) {
            list1[i] = scan.nextInt();
        }
        System.out.println("Enter the values 2st list");
        for (int i = 0; i < list2.length; i++){
            list2[i] = scan.nextInt();
        }
        for (int i = 0; i < list1.length; i++) {
            System.out.print(list1[i] + " ");
        }
        for (int i = 0; i < list2.length ; i++) {
            counter = 0;
            for (int j = 0; j < list1.length; j++) {
                if (list2[i] == list1[j]){
                    counter++;
                }
                else{
                    flag = i;
                }
            }
            if (counter == 0){
                System.out.print(list2[flag] + " ");
            }
        }
    }
}
