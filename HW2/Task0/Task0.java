package HW2.Task0;

// Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”

public class Task0 {
    public static void main(String[] args) {

        String jewels = "aB", stones = "aaaAbbbB";
        System.out.println(findJewelsInStones(jewels, stones));
    }

    public static String findJewelsInStones(String jewels, String stones) {

        StringBuilder resStonesBuilder = new StringBuilder();
        int countJewels = 0;

        for (int i = 0; i < jewels.length(); i++) {
            countJewels = 0;
            resStonesBuilder.append(jewels.charAt((i)));
            for (int j = 0; j < stones.length(); j++) {
                if (jewels.charAt(i) == stones.charAt(j)) {
                    countJewels++;
                }
            }
            resStonesBuilder.append(countJewels);
        }
        return resStonesBuilder.toString();
    }

}