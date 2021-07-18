import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int thesi = 0;
        int max = 0;
        int array[] = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
            if (array[i] > max) {
                max = array[i];
                thesi = i;
            }
        }
        System.out.println(thesi);

    }
}