import java.util.Scanner;

public class Main {

    public static int getNumberOfMaxParam(int a, int b, int c) {
        int x = 0;
        if (a >= b && a >= c) {
            x = 1;
        } else if (b >= a && b >= c) {
            x = 2;
        } else if (c >= a && c >= b) {
            x = 3;
        }
        return x;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}