// На первой строке записывается натуральное число n - количество строчек в книге. 
//Затем вводится n строк - строки книги. потом вводится натуральное число m - количество продуктов, на которые у человека аллергия. 
//Потом вводится m строк - вида "продукт1 - продукт2", где продукт1 - продукт, на который у человека аллергия и продукт2 - продукт, 
//на который следует заменить продукт1. Гарантируется что любой продукт состоит из 1 слова. название продуктов написаны строчными буквами. 
//Гарантируется, что продукты, на которые нужно выполнить замену, не встречаются изначально в тексте.

// Выходные данные
// Замените все продукты в поваренной книге Васи и выведите их построчно на экран. На окончания не обращайте внимание. 
//ВАЖНО!!! Если продукт, который следует заменить написан с большой буквы, то и замена тоже должна начинаться с большой буквы!

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
            System.out.printf("%s,%d,%s", "Введите", i + 1, "пару продуктов: \n");
            products[i] = scan.nextLine().toString();
        }



        for (int i = 0; i < n; i++) {
            String[] RecipesResultArray = recipes[i].split(" ");
            for (int j = 0; j < m; j++) {
                String[] ProductTmpArray = products[j].split(" - ");
                for (int k = 0; k < RecipesResultArray.length; k++) {

                    if (RecipesResultArray[k].toLowerCase().equals(ProductTmpArray[0].toLowerCase())) { // победить заглавную букву!!!!!
                        RecipesResultArray[k] = ProductTmpArray[1];
                        
                        continue;
                    }
                }

            }
            System.out.println();
            System.out.println(String.join(" ", RecipesResultArray));
            
        }
        scan.close();
    }

}
