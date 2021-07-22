package Streams;

import java.util.Arrays;
import java.util.stream.IntStream;

class Stream {
    public static void main(String [] args) {
        int[] array = {5, 0, -3, 2, 6, -1, 1, 0, 3, 9};
        int multiplier = 5;

        System.out.print("Array: ");
        Arrays.stream(array).forEach(x -> System.out.print(x + " "));

        System.out.print("\nAverage: ");
        Arrays.stream(array).average().ifPresent(System.out::println);

        System.out.print("Min: ");
        IntStream.range(0, array.length).reduce((i, j) -> array[i] < array[j] ? i : j)
                .ifPresent(i -> System.out.println("index = " + i + " value = " + array[i]));

        System.out.print("Zero values: ");
        long count = Arrays.stream(array).filter(x -> x == 0).count();
        System.out.println(count);

        System.out.print("Positive values: ");
        count = Arrays.stream(array).filter(x -> x > 0).count();
        System.out.println(count);

        System.out.print("Multiplied by " + multiplier + ": ");
        Arrays.stream(array).map(x -> x * multiplier).forEach(x -> System.out.print(x + " "));
        System.out.println(array[0]);
    }
}
