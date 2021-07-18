import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        while (scan.hasNext()) {
            int num = scan.nextInt();
            sum += num;
            if (num == 0) {
                break;
            } else if (sum >= 1000) {
                sum -= 1000;
                break;
            }
        }
        System.out.println(sum);
    }
}
