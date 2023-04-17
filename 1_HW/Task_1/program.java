import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        menu();
        
    }

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

    static int getNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите число N: ");
        int number = Integer.parseInt(scan.nextLine());
        scan.close();
        return number;

    }

    static void menu() {
        System.out.println();
        System.out.println("Cписок задач:");
        System.out.printf(
                "1 - Вычислить n-ое треугольного число (сумма чисел от 1 до n)\n" +
                        "2 - Вычислить n! (произведение чисел от 1 до n)\n" +
                        "3 - Вывести все простые числа от 1 до 1000\n");
        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите номер задачи: ");
        String str = scan.nextLine();

        switch (str) {
            case "1":
                System.out.printf("%s %d\n", "Результат - ", triangleNumber(getNumber()));
                break;
            case "2":
                System.out.printf("%s %d\n", "Результат - ", factorial(getNumber()));
                break;
            case "3":
                System.out.printf("%s %s\n", "Результат - ", simpleNumbers());
                break;
            default:
                break;
        }

    }

}