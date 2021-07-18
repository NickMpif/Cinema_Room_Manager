import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }
        int number1 = scanner.nextInt();
        int nubmer2 = scanner.nextInt();
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == number1 && array[i + 1] == nubmer2 || array[i] == nubmer2 && array[i + 1] == number1) {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}