
// Напишите метод readList(int n) который считывает лист размером n и возвращает его

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of list ↓");
        int n = sc.nextInt();
        int[] list = readList(n);
        printList(list);
    }

    public static int[] readList(int n) {
        int[] list = new int[n];
        return list;
    }

    public static void printList(int[] list) {
        int i = list.length-1;
        while (list.length != 0){
            System.out.println(list[i]);
            i--;
        }
    }


}
