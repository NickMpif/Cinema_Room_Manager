import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean number = false;

        int len = scanner.nextInt();
        int array[] = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }
        int x = scanner.nextInt();
        for (int j : array) {
            if (j == x) {
                number = true;
            }
        }
        System.out.println(number);


    }
}
