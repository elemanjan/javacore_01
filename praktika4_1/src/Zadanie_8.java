import java.util.Arrays;
import java.util.Scanner;

//Считайте с консоли лист слов, размером 10,
// затем выведите самое короткое слово
public class Zadanie_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] list = new String[5];
        for (int i = 0; i < list.length; i++) {
            list[i] = scan.next();
        }
        Arrays.sort(list);
        System.out.println();
        System.out.println(list[0]);
    }
}
