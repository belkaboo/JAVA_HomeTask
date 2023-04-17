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

    static int getNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите число N: ");
        int number = Integer.parseInt(scan.nextLine());
        return number;

    }

    static void menu() {
        System.out.println("Cписок задач:");
        System.out.println();
        System.out.printf(
                "1 - Вычислить n-ое треугольного число (сумма чисел от 1 до n)\n2 - Вычислить n! (произведение чисел от 1 до n)\n");
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
            default:
                break;
        }

    }

}