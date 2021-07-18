import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean ans = true;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] < arr[i]) {
                ans = false;
            }
        }
        if (ans) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

