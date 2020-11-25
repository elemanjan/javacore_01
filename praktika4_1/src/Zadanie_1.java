import java.util.Scanner;
//Пользователь должен вводит положительное число n и слово w,
// выведите слово w с заглвным первую букву n раз

public class Zadanie_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Enter the word: ");
        String w = sc.next();
        String[] str = w.split("");
        w = "";
        StringBuilder stringBuilder = new StringBuilder();
        String str1 = "";
        str[0] = str[0].toUpperCase();
        for (int i = 0; i < str.length; i++){
            w += str[i];
        }
        for (int i = 0; i < n; i++){
            str1+=w;
        }
        System.out.println(str1);
    }
}
