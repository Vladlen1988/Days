import java.util.Scanner;

class Main {

    public static int findTheYear(int year) {

        int x;
        if (year % 4 == 0 && year % 100 != 0) {
            x = 366;
            return x;
        } else if (year % 400 == 0) {
            x = 366;
            return x;
        } else {
            x = 365;
            return x;
        }

    }

    public static void main(String[] args) {

        int counter = 0;

        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите год: ");
            int year = scanner.nextInt();

            System.out.print("Введите колличество дней: ");
            int days = scanner.nextInt();

            System.out.println();

            int result = findTheYear(year);

            if (result != days) {
                System.out.println("Неправильно! В этом году " + result + " дней!");
                System.out.println("Набрано очков: " + counter);
                break;
            }
            counter++;

        }
    }
}