public class TriangleByNums {
    public static void main(String[] args) {
        int num = 1;
        String space = "    ";
        for (int i = 1; i < 6; i++){
            System.out.print(space);
            l1:
            for (int j = 0; j < num; j++){
                System.out.print(i);
                if (num == 10){
                    break l1;
                }
            }
            num += 2;
            if (space.length()>=1)
            {
                space = space.substring(1);
            }
            System.out.println("");
        }
    }
}
