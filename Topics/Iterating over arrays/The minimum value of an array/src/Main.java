import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int len = scanner.nextInt();
        int array[] = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
            min = Math.min(array[i], min);
        }
        System.out.println(min);
    }
}
