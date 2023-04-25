package HW2.Task1;

// Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
// Пример: s = “cba”, index = [3,2,1] result “abc”

public class Task1 {
    public static void main(String[] args) {
        String s = "1234567";
        int[] index = { 3, 2, 1,4,7,6,5 }; // работает со всеми индексами. индексы как в условии не с 0 
        System.out.println(shuffle(s, index));

    }

    // метод перемешивания строки по индексам

    public static String shuffle(final String s, final int[] index) {

        StringBuffer sb = new StringBuffer(s);

        for (int i = 0; i < index.length; i++) {
            sb.replace(i, i, s.substring(index[i] - 1, index[i]));
            sb.deleteCharAt(sb.length() - 1);

        }

        return sb.toString();
    }
}
