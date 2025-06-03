import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples {

    public static void main(String[] args) {

        // Example 1: Filtering a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers); // Output: [2, 4, 6, 8, 10]

        // Example 2: Mapping a list of strings to uppercase
        List<String> words = Arrays.asList("hello", "world", "java", "stream");

        List<String> uppercaseWords = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Uppercase words: " + uppercaseWords); // Output: [HELLO, WORLD, JAVA, STREAM]

        // Example 3: Reducing a list of integers to their sum
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum of numbers: " + sum); // Output: 55

        // Example 4: Finding the maximum value in a list
        int max = numbers.stream()
                .max(Integer::compareTo)
                .orElse(0);
        System.out.println("Maximum value: " + max); // Output: 10

        // Example 5: Sorting a list of strings
        List<String> sortedWords = words.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted words: " + sortedWords); // Output: [java, stream, hello, world]

        // Example 6: Chaining operations
        List<Integer> result = numbers.stream()
                .filter(n -> n > 5)
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println("Chained operations result: " + result); // Output: [12, 14, 16, 18, 20]
    }
}