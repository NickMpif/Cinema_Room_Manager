import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = 0;
        int len = scanner.nextInt();
        int len1 = scanner.nextInt();
        int array[][] = new int[len][len1];

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len1; j++) {
                array[i][j] = scanner.nextInt();
            }
        }


        int x = scanner.nextInt();
        int y = scanner.nextInt();
        for (int i = 0; i < len; i++) {
            temp = array[i][(x)];
            array[i][x] = array[i][(y)];
            array[i][y] = temp;
        }

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len1; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }


    }
}