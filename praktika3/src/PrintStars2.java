public class PrintStars2 {
    public static void main(String[] args) {
        String[] star = {"*", "*", "*", "*", "*"};
        int len = star.length;
        for (int i = 0; i < star.length; i++){
            for (int j = 0; j < len; j++){
                System.out.print(star[j]);

            }
            len -= 1;
            System.out.println();
        }
    }
}