import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ascending = true;
        boolean descending = true;
        int i1 = scanner.nextInt();
        int i2;
        while ((i2 = scanner.nextInt()) != 0) {
            if (i2 < i1) {
                ascending = false;
            }
            if (i2 > i1) {
                descending = false;
            }
            i1 = i2;
        }
        final boolean ans = ascending || descending;
        System.out.println(ans);

    }
}
