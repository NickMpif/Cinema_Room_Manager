import java.util.Scanner;

class FixingArithmeticException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        if (a == 0 || b + c == 0 || d == 0) {
            System.out.println("Division by zero!");
        } else {
            result = a / ((b + c) / d);
            System.out.println(result);
        }
    }
}