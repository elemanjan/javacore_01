import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name.substring(1));
        getStr(name);
    }
    public static void getStr(String name) {
        String str = "";
        int i = 0;
        if (name.length() == 1) {
            System.out.println(name.charAt(0));
        } else {
            System.out.println(name.charAt(0));
            getStr(name.substring(1));
        }
    }
}
