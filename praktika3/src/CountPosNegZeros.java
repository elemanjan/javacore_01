import java.util.Scanner;

public class CountPosNegZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers will you enter? ");
        int qNums = sc.nextInt();
        System.out.println("Enter numbers: ");
        int pos = 0;
        int neg = 0;
        int zero = 0;
        int i = 0;
        int[] num = new int[qNums];
        do{
            num[i] = sc.nextInt();
            i++;
        }
        while (i < qNums);
        for (int j = 0; j < num.length; j++){
            if (num[j] > 0){
                pos++;
            }
            else if (num[j] == 0){
                zero++;
            }
            else if(num[j] < 0){
                neg++;
            }
        }
        System.out.println("You entered " + pos + " times positive, " + zero + " times zero, " + neg + " times negative.");
    }
}
