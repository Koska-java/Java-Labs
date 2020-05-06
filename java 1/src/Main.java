import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        Сalculation сalcfunc = new Сalculation();
        do {
            try {
                System.out.println(ANSI_WHITE +
                        "-------------------------------" + "\n" +
                        "| 0 - Выход                   |" + "\n" +
                        "-------------------------------" + "\n" +
                        "| 1 - Дата                    |" + "\n" +
                        "| 2 - Результат расчета       |" + "\n" +
                        "| 3 - Вывод переменных        |" + "\n" +
                        "| и расчёт                    |" + "\n" +
                        "| 4 - Вывод парам по умолчанию|" + "\n" +
                        "-------------------------------");
                choice = scanner.nextInt();
                switch (choice) {
                    case 0: {
                        System.out.println(ANSI_BLUE + "Выход");
                        System.exit(0);
                        break;
                    }
                    case 1: {
                        Date dateNow = new Date();
                        SimpleDateFormat formatForDateNow = new SimpleDateFormat("E dd.MM.yyyy");
                        System.out.println(ANSI_BLACK + "Текущая дата " + formatForDateNow.format(dateNow));
                        break;
                    }
                    case 2: {
                        сalcfunc.results();
                        break;
                    }
                    case 3: {
                        System.out.println(ANSI_WHITE + "Введите значения переменных");
                        double a = scanner.nextDouble();
                        double t = scanner.nextDouble();
                        double b = scanner.nextDouble();
                        сalcfunc.printall_res(a, t, b);
                        break;
                    }
                    case 4: {
                        сalcfunc.print_default_param();
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println(ANSI_PURPLE + "Мисс клик ");
                scanner.nextLine();
            }
        } while (choice != 0);
    }
}