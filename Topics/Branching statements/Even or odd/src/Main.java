import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int x = scan.nextInt();
            if (x == 0) {
                break;
            }
            if (x % 2 == 0) {
                System.out.println("even");
            }
            if (x % 2 != 0) {
                System.out.println("odd");
            }
        }
    }
}
