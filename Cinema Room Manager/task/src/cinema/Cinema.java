package cinema;
import java.util.Scanner;

public class Cinema {

    private static Scanner scanner = new Scanner(System.in);

    private static String[][] cinema;
    private static int p = 0;
    private static int total = 0;
    private static int price = 0;
    private static double percentage = 0;


    public static void main(String[] args) {

        getCinema();
        menu();

    }

    //ektyupwsi menou
    private static void printMenu() {
        System.out.println("1. Show the seats\n" +
                "2. Buy a ticket\n" +
                "3. Statistics\n" +
                "0. Exit");
    }

    // diadikasia menou
    private static void menu() {
        printMenu();
        int action = scanner.nextInt();
        System.out.println();
        if (action == 1) {
            printCinema();
        } else if (action == 2) {
            bookSeat();
        } else if (action == 3) {
            statistics();
        } else {
            return;
        }
        menu();
    }

    private static void statistics() {
        int rows = cinema.length;
        int seats = cinema[0].length;
        int half = 0;

        int otherHalf = 0;
        int sum = rows * seats;
        if (sum <= 60) {
            total = sum * 10;
        }
        if (sum > 60) {
            int x = rows % 2;
            if (x == 0) {
                half = 10 * (rows / 2);
                otherHalf = 8 * (rows - (rows / 2));

            } else {
                half = 10 * (rows / 2);
                otherHalf = 8 * (rows - (rows / 2));
            }
            total = seats * (half + otherHalf);
        }

        System.out.println("Number of purchased tickets: " + p);
        percentage = (((double) p) / (rows*seats)) * 100;
        System.out.printf("Percentage: %.2f", percentage);
        System.out.println("%");
        System.out.println("Current income: " + "$" + price);
        System.out.println("Total income: " + "$" + total);
        System.out.println();
        menu();
    }


    // epilogi cinema
    private static String[][] getCinema() {
        System.out.println("Enter the number of rows");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row");
        int seats = scanner.nextInt();
        System.out.println();
        cinema = new String[rows][seats];
        return fillCinema();

    }

    //cinema me s
    private static String[][] fillCinema() {
        int rows = cinema.length;
        int seats = cinema[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                cinema[i][j] = "S ";
            }
        }
        return cinema;
    }

    //ektypwsi cinema
    private static void printCinema() {
        StringBuilder builder = new StringBuilder();

        builder.append("Cinema:\n");
        builder.append(" ");
        for (int i = 0; i < cinema[0].length; i++) {
            builder.append(" ").append(++i);
            --i;
        }
        builder.append("\n");
        for (int i = 0; i < cinema.length; i++) {
            builder.append(++i + " ");
            --i;
            for (int j = 0; j < cinema[0].length; j++) {
                builder.append(cinema[i][j]);
            }
            builder.append("\n");
        }
        System.out.println(builder);

    }

    //epilogh thesis

    private static void bookSeat() {
        int rows = cinema.length;
        int seats = cinema[0].length;
        System.out.println("Enter a row number:");
        int x = scanner.nextInt();
        System.out.println("Enter a seat number in that row:");
        int z = scanner.nextInt();
        System.out.println();

        if (x > rows || z > seats) {
            System.out.println("Wrong input!");
            bookSeat();
            return;
        }
        if (cinema[x - 1][z - 1] == "B ") {
            System.out.println("That ticket has already been purchased!");
            bookSeat();
        } else {
            int sum = rows * seats;
            if (sum <= 60) {
                System.out.println("Ticket price: " + "$" + 10);
                price = price + 10;
            } else if (sum > 60 && x % 2 == 0) {
                if (x <= (rows / 2)) {
                    System.out.println("Ticket price: " + "$" + 10);
                    price = price + 10;
                } else {
                    System.out.println("Ticket price: " + "$" + 8);
                    price = price + 8;

                }
            } else {
                int c = rows / 2;
                int v = rows - c;
                if (x <= c) {
                    System.out.println("Ticket price: " + "$" + 10);
                    price = price + 10;

                } else {
                    System.out.println("Ticket price: " + "$" + 8);
                    price = price + 8;
                }
            }
            p++;
            cinema[x - 1][z - 1] = "B ";
        }


        System.out.println();


    }


}