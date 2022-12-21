import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Найти первое, второе и третье по величине число массива
 */

public class FindMaxSecondThirdInt02 {
    public static void main(String[] args) {
        Integer[] mas = {12, 5, 8, 6, -12, 12, 10, 7, 6, 11, 3, 0, 10};
        LinkedList<Integer> masResult = new LinkedList<>();
        Arrays.sort(mas, Collections.reverseOrder());
        int temp = 0;
        for (int i = 0; i < mas.length; i++ ){
            if(mas[i] != temp){
                masResult.add(mas[i]);
            }
            temp = mas[i];
        }
        System.out.println("Result max: " + masResult.get(0) + "\n" +
                "Result preMax: " + masResult.get(1) + "\n" +
                "Result prePreMax: " + masResult.get(2));
    }
}
