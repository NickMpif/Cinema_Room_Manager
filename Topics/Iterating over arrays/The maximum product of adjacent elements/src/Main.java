import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] n = new int[size];
        for (int i = 0; i < n.length; i++) {
            n[i] = scanner.nextInt();
        }
        int max = 0;
        if (n.length == 2) {
            max = n[0] * n[1];
        } else {
            for (int j = 0; j < n.length - 1; j++) {
                int check = n[j] * n[j + 1];
                if (max < check) {
                    max = check;
                }
            }
        }
        System.out.println(max);
    }
}