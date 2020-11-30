//Напишите метод который calculate(int n1), который рассчитывает по следующей логике,
// n1*n1 + n1*1000, и возвращает результат

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ↓");
        int n1 = sc.nextInt();
        System.out.println(calculate(n1));
    }

    public static int calculate(int n1){
        int sum = 0 ;
        sum  = (n1 * n1) + n1 * 1000;
        return sum;
    }
}
