/**
 * Найти первое, второе и третье по величине число массива
 */

public class FindMaxSecondThirdInt01 {
    public static void main(String[] args) {
        int[] mas = {12, 5, 11, 8, 10, 6, -12, 12, 10, 7, 6, 11, 3, 0, 10};
        int max = 0, preMax = 0, prePreMax = 0;

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
            }
            if (mas[i] > preMax && mas[i] < max) {
                preMax = mas[i];
            }
            if (mas[i] > prePreMax && mas[i] < preMax) {
                prePreMax = mas[i];
            }
        }
        System.out.println("Result max: " + max + "\n" +
                "Result preMax: " + preMax + "\n" +
                "Result prePreMax: " + prePreMax);
    }
}
