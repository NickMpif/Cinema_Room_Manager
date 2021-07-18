import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int height = scanner.nextInt();
        int[][] array = new int[len][height];

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < height; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        int x = array[0][0];
        int y = 0;
        int z = 0;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < height; j++) {
                if (x < array[i][j]) {
                    x = array[i][j];
                    y = i;
                    z = j;

                }

            }

        }
        System.out.println(y + " " + z);


    }
}