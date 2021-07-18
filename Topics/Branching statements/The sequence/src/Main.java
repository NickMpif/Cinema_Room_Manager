import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int x = scanner.nextInt();
        for (int i = 1; i < x; i++) {
            for (int j = 0; j < i; j++) {
                if (counter < x) {
                    System.out.print(i + " ");
                    counter++;
                }

            }
        }
    }
}