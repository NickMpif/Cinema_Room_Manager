import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum = 0;
        int target = scanner.nextInt();
        for (int i: arr) {
            if (i > target) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
