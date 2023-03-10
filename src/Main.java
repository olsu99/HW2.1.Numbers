import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        filteredList(intList);
    }

    public static void filteredList(List<Integer> intList) {
        List<Integer> filteredNumbers = new ArrayList<>();
        for (int number : intList) {
            if (number > 0) {
                if (number % 2 == 0) {
                    filteredNumbers.add(number);
                }
            }
        }
        Collections.sort(filteredNumbers);
        for (int counter : filteredNumbers) {
            System.out.println(counter);
        }
    }
}
