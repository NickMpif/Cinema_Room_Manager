import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int arr[] = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = scanner.nextInt();
        }
        int last = arr[arr.length - 1];


        for (int j = arr.length - 1; j > 0; j--) {
            //Shift element of array by one
            arr[j] = arr[j - 1];
        }

        arr[0] = last;

        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
