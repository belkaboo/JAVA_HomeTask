package Task7;

import java.util.ArrayList;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        System.out.print("\033[H\033[J");
        ArrayList<Integer> checkList = FillRandomArrayList(6, 10); // 
        System.out.printf("%s %s\n", "Исходный - ", checkList);
        System.out.printf("%s %s\n", "Уникальные элементы -", trimPairElements(checkList));

    }
    
    // Рандомно заполненный массив

    public static ArrayList<Integer> FillRandomArrayList(int size, int randomBound) {
         Random random = new Random();
         ArrayList<Integer> listOfNumbIntegers = new ArrayList<Integer>();
         for (int i = 0; i < size; i++) {
             listOfNumbIntegers.add(i, random.nextInt(randomBound));
         }

         return listOfNumbIntegers;
    }

    // возвращает список уникальных элементов исходного списка

    public static ArrayList<Integer> trimPairElements(ArrayList<Integer> list) {

        int ind = 0;
        boolean flag = false;
        while (ind < list.size()) {
            flag = false;
            for (int i = ind + 1; i < list.size(); i++) {
                if (list.get(ind) == list.get(i)) {
                    list.remove(i);
                    flag = true;
                }
            }
            if (flag) {
                list.remove(ind);

            } else
                ind++;
        }
        return list;
    }
}
