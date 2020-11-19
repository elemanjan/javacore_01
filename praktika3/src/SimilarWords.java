import java.util.Scanner;

public class SimilarWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the text");
        String text = scan.nextLine();
        int count = 0;
        System.out.println("Enter the word");
        String word = scan.nextLine();
        String[] strArr = text.split(" ");
        for (int i = 0; i < strArr.length; i++){
            if (strArr[i].equals(word)){
                count++;
            }
        }
        System.out.println("The word \"am\" meets " + count + " times");

    }
}
