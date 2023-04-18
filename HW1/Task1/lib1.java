package HW1.Task1;

import java.util.Scanner;

public class lib1 {

    static int triangleNumber(int number) {
        int triangleResult = 0;
        if (number == 0) {
            return triangleResult;
        } else {
            for (int i = 1; i <= number; i++) {
                triangleResult += i;
            }
        }
        return triangleResult;
    }

    static int factorial(int number) {
        int factorialResult = 1;
        if (number == 0 || number == 1) {
            return factorialResult;
        } else {
            for (int i = 2; i <= number; i++) {
                factorialResult *= i;
            }
        }
        return factorialResult;

    }

    static String simpleNumbers() {
        String numbers = "2, 3, 5, 7, ";
        for (int i = 8; i < 1000; i++) {
            if (checkDivider(i)) {
                numbers += i + ", ";
            }
        }
        return numbers.substring(0, numbers.length() - 2);
    }

    static boolean checkDivider(int number) {
        if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0 || number % 7 == 0) {
            return false;
        } else
            return true;
    }

    public static int getNumber(String sep1, String end) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("%s %s %s %s", "Введите", sep1, "число", end);
        int number = Integer.parseInt(scan.nextLine());
        //scan.close();
        return number;

    }

    public static void calc() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\033[H\033[J");
        System.out.println("Калькулятор");

        int number1 = getNumber("1", ": ");
        System.out.println("Выберите операцию: ");
        System.out.printf(
                "1 - сложение\n" +
                        "2 - вычитание\n" +
                        "3 - умножение\n" +
                        "4 - деление\n");
        String oper = sc.nextLine();
        int number2 = getNumber("2", ": ");
        double result = 0;
        switch (oper) {
            case "1":
                result = number1 + number2;
                oper = "+";
                break;
            case "2":
                result = number1 - number2;
                oper = "-";
                break;
            case "3":
                result = number1 * number2;
                oper = "*";
                break;
            case "4":
                if (number2 == 0) {
                    oper = "/";
                    number1 = 0;
                    number2 = 0;
                    System.out.println("На 0 делить нельзя!");
                } else {
                    result = number1 / number2;
                    oper = "/";
                }
                break;
            default:
                System.out.printf("Не корректный выбор");
                break;

        }
        System.out.printf("%d %s %d %s %.2f\n", number1, oper, number2, "=", result);
        System.out.println("Продолжить c калькулятором? 1 - да / 2 - нет");
        String cont = sc.nextLine();
        switch (cont) {
            case "1":
                calc();
                break;
            case "2":
                menu();
            default:
                System.out.printf("Не корректный выбор, 1 - да / 2 - нет");
                sc.nextLine();
                break;
        }
        sc.close();
    }

    public static void menu() {
        System.out.print("\033[H\033[J");
        System.out.println("Cписок задач:");
        System.out.printf(
                "1 - Вычислить n-ое треугольного число (сумма чисел от 1 до n)\n" +
                        "2 - Вычислить n! (произведение чисел от 1 до n)\n" +
                        "3 - Вывести все простые числа от 1 до 1000\n" +
                        "4 - Калькулятор");
        System.out.println();
        Scanner s = new Scanner(System.in);
        System.out.printf("Введите номер задачи: ");
        String str = s.nextLine();

        switch (str) {
            case "1":
                System.out.printf("%s %d\n", "Результат - ", triangleNumber(getNumber("", "N: ")));
                break;
            case "2":
                System.out.printf("%s %d\n", "Результат - ", factorial(getNumber("", "N: ")));
                break;
            case "3":
                System.out.printf("%s %s\n", "Результат - ", simpleNumbers());
                break;
            case "4":
                calc();
                break;
            default:
                System.out.printf("Не корректный выбор");

                break;
        }
        s.close();
    }

}