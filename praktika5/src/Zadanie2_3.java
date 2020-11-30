
//2)Напишите метод readList(int n) который считывает лист размером n и возвращает его
//3)Напишите метод printList(int[] list) который выводит в консол содержимое листа с помощью while

import java.util.Scanner;

public class Zadanie2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of list ↓");
        int n = sc.nextInt();
        int[] list = readList(n);
        recordValue(list);
        printList(list);
    }

    public static int[] readList(int n) {
        int[] list = new int[n];
        return list;
    }

    public static void printList(int[] list) {
        int i = list.length-1;
        while (true){
            System.out.println(list[i]);
            if (i == 0) break;
            i--;
        }
    }

    public static int[] recordValue(int[] list){
        for (int i = 0; i < list.length ; i++) {
            list[i] = i;
        }
        return list;
    }
}
