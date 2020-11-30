//Напишите метод  mergeList(int [] list1, int[] list2) который выводит соединяет 2 листа в 1 лист

public class Zadanie4 {
    public static void main(String[] args) {
        int[] list1 = new int[]{1, 2, 3, 4, 5};
        int[] list2 = new int[]{1, 2, 3, 4, 5};

        mergeList(list1, list2);
    }

    public static void mergeList(int[] list1, int[] list2){
        int len = list1.length + list2.length;
        for (int i = 0; i < list1.length; i++) {
            System.out.print(list1[i] + " ");
        }
        for (int i = 0; i < list1.length; i++) {
            System.out.print(list2[i] + " ");
        }
    }
}
