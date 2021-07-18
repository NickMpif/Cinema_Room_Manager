import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pl = 0;
        int bus = scanner.nextInt();
        int numberBridges = scanner.nextInt();
        for (int i = 1; i <= numberBridges; i++) {
            int cmBridges = scanner.nextInt();
            if (cmBridges <= bus && pl == 0) {
                pl = i;
            }
        }
        if (pl == 0) {
            System.out.println("Will not crash");
        } else {
            System.out.println("Will crash on bridge " + pl);
        }

    }
}
