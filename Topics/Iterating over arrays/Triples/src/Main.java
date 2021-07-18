import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        for(int i = 0; i < size-2; i++) {
            if(array[i] == array[i+1] - 1 && array[i] == array[i+2] - 2) { //checking if three consecutive ints in increasing order differing by 1
                counter++;
            }
        }

        System.out.println(counter);
    }
}
