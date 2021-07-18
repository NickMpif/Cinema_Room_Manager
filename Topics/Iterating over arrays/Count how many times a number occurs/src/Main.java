import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        int[] arr = new int[len];
        int counter = 0;
        for (int i = 0; i < len; i++) {
            arr[i] = scanner.nextInt();
        }
        int ar = scanner.nextInt();
        for (int i = 0; i < len; i++) {
            if (arr[i] == ar) {
                counter++;
            }
        }
        System.out.println(counter);


    }
}
