import java.util.Scanner;
// Считайте с консоли лист слов, размером 10, затем выведите самое повторяющееся слово

public class Zadanie_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] list = new String[10];
        String word = "";
        int maxWord = 0;
        int counter = 0;
        for (int i = 0; i < list.length; i++) {
            System.out.println("Enter the word:");
            list[i] = scan.next();
        }
        for (int i = 0; i < list.length; i++) {
            counter = 0;
            for (int j = i+1; j < list.length; j++) {
                if (list[0].equals(list[j])){
                    word = list[i];
                    counter++;
                }
            }
            if (counter > maxWord) {
                maxWord = counter;
                word = list[i];
            }
        }
        System.out.println(word);
    }
}
