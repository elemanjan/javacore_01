import java.util.Arrays;
import java.util.Scanner;

//Считайте с консоли лист слов, размером 10,
// затем выведите самое короткое слово
public class Zadanie_8 {
    public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);
        String[] list = new String[5];
        for (int i = 0; i < list.length; i++) {
            list[i] = scan.next();
        }
        Arrays.sort(list);
        System.out.println();
        System.out.println(list[0]);*/

        Scanner scanner = new Scanner(System.in);

        String [] list = new String[5];

        for (int i=0; i<list.length; i++){
            System.out.println("Enter the word:");
            String num = scanner.next();
            list[i] = num;
        }

        String min="" ;

        for (int i=0; i<list.length; i++){
            if(list[i].length()<min.length() || min.length()==0){
                min = list[i];
            }
        }
        System.out.println(min);
    }
}
