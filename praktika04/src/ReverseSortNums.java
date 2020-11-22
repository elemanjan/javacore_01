import java.util.Scanner;

public class ReverseSortNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        String  num = sc.nextLine();
        String[] numArr = num.split("");
        for (int i = numArr.length-1; i >= 0; i--){
            System.out.print(numArr[i]);
        }
    }
}
