package collections.list;

import java.util.*;
/*

List is ordered collection
Allows duplicates
unsorted

| Operation       | Method                      |
| --------------- | --------------------------- |
| Add element     | `add(E e)`                  |
| Insert at index | `add(int index, E e)`       |
| Update element  | `set(int index, E e)`       |
| Remove by value | `remove(Object o)`          |
| Remove by index | `remove(int index)`         |
| Search value    | `contains(Object o)`        |
| Get index       | `indexOf(Object o)`         |
| Sort            | `Collections.sort(list)`    |
| Reverse         | `Collections.reverse(list)` |
| Clear           | `clear()`                   |
| Iterate         | `for-each loop`             |

 */
public class ListOperations {
    public static void main(String[] args) {
        // 1. Create and Add Elements
        List<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("Initial list: " + fruits);
        // Output: Initial list: [Apple, Banana, Cherry]

        // 2. Insert at Index
        fruits.add(1, "Orange");
        System.out.println("After insert at index 1: " + fruits);
        // Output: After insert at index 1: [Apple, Orange, Banana, Cherry]

        // 3. Update Element
        fruits.set(2, "Grapes");
        System.out.println("After updating index 2: " + fruits);
        // Output: After updating index 2: [Apple, Orange, Grapes, Cherry]

        // 4. Remove by Value
        fruits.remove("Orange");
        System.out.println("After removing 'Orange': " + fruits);
        // Output: After removing 'Orange': [Apple, Grapes, Cherry]

        // 5. Remove by Index
        fruits.remove(1);
        System.out.println("After removing index 1: " + fruits);
        // Output: After removing index 1: [Apple, Cherry]

        // 6. Search
        boolean hasApple = fruits.contains("Apple");
        int cherryIndex = fruits.indexOf("Cherry");
        System.out.println("Contains 'Apple'? " + hasApple);       // Output: true
        System.out.println("Index of 'Cherry': " + cherryIndex);   // Output: 1

        // 7. Sort
        fruits.add("Blueberry");
        Collections.sort(fruits);
        System.out.println("Sorted list: " + fruits);
        // Output: Sorted list: [Apple, Blueberry, Cherry]

        // 8. Reverse
        Collections.reverse(fruits);
        System.out.println("Reversed list: " + fruits);
        // Output: Reversed list: [Cherry, Blueberry, Apple]

        // 9. Iterate
        System.out.println("Iterating:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }
        // Output:
        // - Cherry
        // - Blueberry
        // - Apple

        // 10. Clear All
        fruits.clear();
        System.out.println("After clearing: " + fruits);
        // Output: After clearing: []
    }
}

