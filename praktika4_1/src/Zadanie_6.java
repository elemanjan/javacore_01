import java.util.Arrays;
import java.util.Scanner;
//Считайте с консоли 2 листа чисел, размером 10,
// затем выведите общие значения листов

public class Zadanie_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] list1 = new int[5];
        int[] list2 = new int[5];
        int[] mergedList = new int[list1.length+list2.length];
        int counter = 0;
        System.out.println("Enter the values 1st list");
        for (int i = 0; i < list1.length ; i++) {
            list1[i] = scan.nextInt();
        }
        System.out.println("Enter the values 2st list");
        for (int i = 0; i < list2.length; i++){
            list2[i] = scan.nextInt();
        }

        for (int i = 0; i < list1.length ; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i] == list2[j]){
                    mergedList[counter] = list1[i];
                    counter++;
                }
                else {
                    mergedList[counter] = list1[i];
                    counter++;
                    mergedList[counter] = list2[j];
                }
            }
        }
        System.out.println(Arrays.toString(mergedList));
    }
}
