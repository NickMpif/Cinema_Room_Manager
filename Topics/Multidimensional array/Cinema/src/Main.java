import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int seats = scanner.nextInt();
        int[][] array = new int[rows][seats];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int k = scanner.nextInt();
        int number = 0;
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                if (array[i][j] == 1) {
                    number = 0;
                } else {
                    number++;
                }
                if (number == k) {
                    System.out.println(i + 1);
                    return;
                }
            }
            number = 0;
        }
        System.out.println(0);


    }
}