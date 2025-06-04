package collections.list;

import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 1, 3, 2, 4));

        // 1. Sort
        Collections.sort(numbers);
        System.out.println("Sorted: " + numbers);
        // Output: Sorted: [1, 2, 3, 4, 5]

        // 2. Reverse
        Collections.reverse(numbers);
        System.out.println("Reversed: " + numbers);
        // Output: Reversed: [5, 4, 3, 2, 1]

        // 3. Shuffle
        Collections.shuffle(numbers);
        System.out.println("Shuffled: " + numbers);
        // Output: Shuffled: [random order]

        // 4. Min and Max
        int min = Collections.min(numbers);
        int max = Collections.max(numbers);
        System.out.println("Min: " + min + ", Max: " + max);
        // Output: Min: X, Max: Y (based on shuffled list)

        // 5. Binary Search (must be sorted)
        Collections.sort(numbers);
        int index = Collections.binarySearch(numbers, 3);
        System.out.println("Index of 3: " + index);
        // Output: Index of 3: 2 (depends on sorting)

        // 6. Frequency
        numbers.add(3);
        int freq = Collections.frequency(numbers, 3);
        System.out.println("Frequency of 3: " + freq);
        // Output: Frequency of 3: 2

        // 7. Synchronize a list
        List<Integer> syncList = Collections.synchronizedList(numbers);
        System.out.println("Synchronized list: " + syncList);
        // Output: Synchronized list: [...]
    }
}

