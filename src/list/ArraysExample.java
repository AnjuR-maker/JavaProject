package collections.list;

import java.util.*;

public class ArraysExample {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 2, 4};

        // 1. Sort
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        // Output: Sorted array: [1, 2, 3, 4, 5]

        // 2. Binary Search (sorted array)
        int index = Arrays.binarySearch(arr, 3);
        System.out.println("Index of 3: " + index);
        // Output: Index of 3: 2

        // 3. Fill
        int[] filled = new int[5];
        Arrays.fill(filled, 9);
        System.out.println("Filled array: " + Arrays.toString(filled));
        // Output: Filled array: [9, 9, 9, 9, 9]

        // 4. Copy
        int[] copied = Arrays.copyOf(arr, 3);
        System.out.println("Copied (first 3): " + Arrays.toString(copied));
        // Output: Copied (first 3): [1, 2, 3]

        // 5. Compare arrays
        boolean isEqual = Arrays.equals(arr, new int[]{1, 2, 3, 4, 5});
        System.out.println("Arrays equal? " + isEqual);
        // Output: Arrays equal? true

        // 6. Convert array to List
        String[] words = {"apple", "banana", "cherry"};
        List<String> wordList = Arrays.asList(words);
        System.out.println("Array as list: " + wordList);
        // Output: Array as list: [apple, banana, cherry]
    }
}

