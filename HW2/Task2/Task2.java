// Sample Input:

// 2
// Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис на мороженое.
// Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.
// 3
// арахис - колбаса
// клубника - вишня
// сгущенка - молоко
// Sample Output:

// Рецепт 1. Колбаса 100гр, мороженое 200гр. Возьмите колбаса и измелчите его. Посыпьте измельчённый колбаса на мороженое.
// Рецепт 2. Вишня 100гр, молоко 3кг. Смешать, есть) Радоваться жизни.

package HW2.Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        System.out.print("\033[H\033[J");
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите кол-во строк в книге: ");
        int n = Integer.parseInt(scan.nextLine());

        String[] recipes = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("%s %d %s", "Введите", i + 1, "рецепт: \n");
            recipes[i] = scan.nextLine();
        }

        System.out.printf("Введите кол-во продуктов на которые аллергия: ");
        int m = Integer.parseInt(scan.nextLine());
        String[] products = new String[m];
        for (int i = 0; i < products.length; i++) {
            System.out.printf("%s %d %s", "Введите", i + 1, "пару продуктов: \n");
            products[i] = scan.nextLine().toString();
        }

        System.out.print("\033[H\033[J");
        System.out.println("Исходный вариант: ");
        for (String item : recipes) {
            System.out.println(item);
        }

        System.out.println("Замена: ");

        for (int i = 0; i < n; i++) {
            String[] RecipesResultArray = recipes[i].split(" ");

            for (int j = 0; j < m; j++) {
                String[] ProductTmpArray = products[j].split(" - ");
                for (int k = 0; k < RecipesResultArray.length; k++) {

                    if (RecipesResultArray[k].toLowerCase().equals(ProductTmpArray[0])) {

                        if (CheckCase(RecipesResultArray[k])) {
                            RecipesResultArray[k] = ProductTmpArray[1].substring(0, 1).toUpperCase()
                                    + ProductTmpArray[1].substring(1);

                        } else {
                            RecipesResultArray[k] = ProductTmpArray[1];
                        }
                    }

                }

            }
            System.out.println(String.join(" ", RecipesResultArray));
        }

        scan.close();
    }

    public static boolean CheckCase(String str) { // проверка на заглавную букву
        char[] check = str.toCharArray();
        if (Character.isUpperCase(check[0])) {
            return true;
        } else
            return false;
    }

}
