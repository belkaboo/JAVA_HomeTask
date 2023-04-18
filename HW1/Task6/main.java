/*
Вводится массив (сначала количество элементов, потом сами элементы). 
Найдите сумму его элементов с чётными индексами и выведите её. А потом выведите числа, которые суммировались.
 */

package HW1.Task6;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите кол-во элементов массива: ");
        int size = scan.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%s %d %s", "Введите", i + 1, "элемент массива: ");
            arr[i] = scan.nextInt();
        }
        scan.close();

        ArrayList<Integer> elements = new ArrayList<>();

        int summOfelements = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                summOfelements += arr[i];
                elements.add(arr[i]);
            }
        }
        System.out.println();
        System.out.printf("%s %d\n", "Сумма чётных элементов = ", summOfelements);


        System.out.printf("Чётные элементы = [ ");
        for (int i = 0; i < elements.size() - 1; i++) {
            System.out.printf("%d%s", elements.get(i), ", ");
        }
        System.out.printf("%d%s", elements.get(elements.size()-1), " ]\n");

    }

}