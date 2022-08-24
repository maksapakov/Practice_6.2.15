import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

// 1 2 3 4 5 6 7 8 9 10
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> integerDeque = new ArrayDeque<>();
        while (scanner.hasNextInt()) {
            scanner.next();
            if (scanner.hasNextInt()) {
                integerDeque.addFirst(scanner.nextInt());
            }
        }
        for (int i :
                integerDeque) {
            System.out.printf("%d ", i);
        }
    }
}
