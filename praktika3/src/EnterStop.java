import java.util.Scanner;

public class EnterStop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: \nEnter \"stop\" to stop");
        String read = "";
        int toNum = 0;
        int count = 0;
        do {
            read = sc.nextLine();
            if(!read.equals("stop")){
            toNum += Integer.parseInt(read);
            count++;
            }
        }
        while (!read.equals("stop"));
        System.out.println("Sum: " + toNum + ", Average: " + toNum / count);

    }
}
