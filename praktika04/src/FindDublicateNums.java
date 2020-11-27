import java.util.Arrays;
import java.util.Scanner;
// Praktika4.Zadanie 1
// Считайте с консоли лист чисел, размером 10, и выведите уникальные числа, то есть дубликаты удалить

public class FindDublicateNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[5];
        int[] uniqList = new int[list.length];
        for (int i = 0; i < list.length; i++){
            System.out.println("Enter the number ↓");
            list[i] = sc.nextInt();
        }
        int c = 0;
        for (int i = 0; i < list.length; i++){
            int counter = 0;
            for (int j = i + 1; j < list.length; j++){
                if (list[i] == list[j]){
                    counter++;
                }
            }
            if (counter == 0){
                uniqList[c] = list[i];
                c++;
            }
        }
        System.out.println(Arrays.toString(uniqList));
    }
}
