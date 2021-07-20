package Collections;

import java.util.*;

public class ElementCounter {
    public static void main(String[] args) {
        Integer[] arr = {4, 5, -6, 4, 5, 3, 4, 2, 4, 5, 7};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        Map<Integer, Integer> result = new HashMap<>();

        for (Integer i : list) {
            if (result.containsKey(i)) {
                result.replace(i, result.get(i) + 1);
            } else {
                result.put(i, 1);
            }
        }

        System.out.println(result);
    }
}
