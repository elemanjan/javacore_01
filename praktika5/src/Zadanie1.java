import java.util.Scanner;

// Напишите метод findColor(String word)  который принимает слово и находит цвета "blue", "red' в слове,
// и выводит, если нет этих цветов возвращает пустоту.
// Считываете слово в главном методе и вызываете метод findColor(String word)
public class Zadanie1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String color = findColor(word);
        System.out.println(color);
    }

    public static String findColor(String word) {
        String color = "";
        if (word.matches("(.*)blue(.*)")) {
            color = "blue";
        } else if (word.matches("(.*)red(.*)")) {
            color = "red";
        } else {
            color = "";
        }
        return color;
    }
}
