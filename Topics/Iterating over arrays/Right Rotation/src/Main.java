import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] arr = s.nextLine().split(" ");
        String[] rotatedArr = new String[arr.length];
        int indexOffset = s.nextInt();
        int targetIndex;

        for (int i = 0; i < arr.length; i++) {
            targetIndex = (i + indexOffset) % arr.length;
            rotatedArr[targetIndex] = arr[i];
        }

        System.out.println(String.join(" ", rotatedArr));
    }
}



