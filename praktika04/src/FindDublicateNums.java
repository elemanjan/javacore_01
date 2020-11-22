import java.util.Arrays;
import java.util.Scanner;

public class FindDublicateNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[5];
        int[] uniqList = new int[list.length];
        for (int i = 0; i < list.length; i++){
            list[i] = sc.nextInt();
        }

        for (int i = 0; i < list.length; i++){
            for (int j = i + 1; j < list.length; j++){
                if (list[i] == list[j]){

                }
                else{
                    uniqList[i] = list[i];
                }
            }
        }
        System.out.println(Arrays.toString(uniqList));
    }
}
