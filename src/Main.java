import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
// 1 2 3 4 5 6 7 8 9 10
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> integerDeque = new ArrayDeque<>();
        int i = 0;
        while (scanner.hasNext()) {
            if (i%2 == 0){
                integerDeque.addFirst(scanner.nextInt());
            }
            i++;
        }
        int lastNum = integerDeque.pollLast();
        System.out.println(integerDeque);
        System.out.println(lastNum);
    }
}
