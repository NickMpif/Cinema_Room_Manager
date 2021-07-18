import java.util.Scanner;

class Name {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            String firstName1 = scanner.next();
            String lastName1 = scanner.next();
            createFullName(firstName1, lastName1);
        }
    }

    //implement your method here
    public static String createFullName(String firstName1, String lastName1) {
        return firstName1 + " " + lastName1;
    }
}