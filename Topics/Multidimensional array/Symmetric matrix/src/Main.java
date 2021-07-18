import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean answer = true;
        int len = scanner.nextInt();
        int array[][] = new int[len][len];

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (array[i][j] != array[j][i]) {
                    answer = false;
                    break;
                }
            }
        }
        if (answer) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}