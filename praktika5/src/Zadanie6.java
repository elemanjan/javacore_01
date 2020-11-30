/*напишите метод processor(), который с помощью  readList(int n) считывает 2 листа, затем
 с помощью mergeList(int []list1, int[] list2) соединяет этот лист, с помощью calculate(int n1)
 для получившего листа считывает новое значение для листа и выводит лист с помощью printList(int[] list) */

import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        processor();
    }

    public static void processor(){
        int[] list1 = readList(5);
        int[] list2 = readList(5);
        int[] mergedList = mergeList(list1, list2);
        printList(mergedList);
    }

    public static int[] mergeList(int[] list1, int[] list2){
        int len = list1.length + list2.length;
        int[] mergedList = new int[len];
        int counter = 0;
        for (int i = 0; i < list1.length; i++) {
            mergedList[counter] = list1[i];
            counter++;
        }
        for (int i = 0; i < list2.length; i++) {
            mergedList[counter] = list2[i];
            counter++;
        }
        return mergedList;
    }

    public static int[] readList(int len) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for list:\nLength of List should be " + len);
        int[] list = new int[len];
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
        }
        return list;
    }

    public static void printList(int[] list) {
        int i = 0;
        while (true){
            System.out.println(list[i]);
            if (i >= list.length-1){
                break;
            }
            i++;
        }
    }
}
