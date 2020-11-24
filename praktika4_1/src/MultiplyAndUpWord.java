import java.util.Scanner;

public class MultiplyAndUpWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Enter the word: ");
        String w = sc.next();
        String[] str = w.split("");
        w = "";
        StringBuilder stringBuilder = new StringBuilder();
        str[0] = str[0].toUpperCase();
        for (int i = 0; i < str.length; i++){
            w += str[i];
        }
        for (int i = 0; i < n; i++){
            stringBuilder.append(w);
        }
        System.out.println(stringBuilder);
    }
}
