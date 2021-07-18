import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean flag = false;
        for (int j = 0; j < numbers.length - 1; j++) {
            if (numbers[j] == a && numbers[j + 1] == b) {
                flag = true;
                break;
            } else if (numbers[j] == b && numbers[j + 1] == a) {
                flag = true;
                break;
            }
        }
        System.out.println(flag);
    }
}
