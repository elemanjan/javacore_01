import java.util.Scanner;

public class OutputWeek {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the day number: ");
        int day = read.nextInt();
        switch (day) {
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Error!");
        }
    }
}
