package collections.list;

import java.util.*;

/*
Operation	Method
Add Element	add(E e)
Remove Element	remove(Object o)
Check Existence	contains(Object o)
Get Size	size()
Clear Set	clear()
Iterate Over Set	for-each loop
Union	addAll(Collection)
Intersection	retainAll(Collection)
Difference	removeAll(Collection)

 */
public class SetOperations {
    public static void main(String[] args) {
        // 1. Create and Add Elements
        Set<String> set = new HashSet<String>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        System.out.println("Initial set: " + set);
        // Output (order may vary): Initial set: [Apple, Banana, Cherry]

        // 2. Duplicate Elements (Ignored)
        set.add("Apple"); // Won't be added again
        System.out.println("After adding duplicate 'Apple': " + set);
        // Output: [Apple, Banana, Cherry]

        // 3. Remove Element
        set.remove("Banana");
        System.out.println("After removing 'Banana': " + set);
        // Output: [Apple, Cherry]

        // 4. Check if Element Exists
        boolean hasCherry = set.contains("Cherry");
        System.out.println("Contains 'Cherry'? " + hasCherry);
        // Output: Contains 'Cherry'? true

        // 5. Size of Set
        System.out.println("Set size: " + set.size());
        // Output: Set size: 2

        // 6. Iterate Over Set
        System.out.println("Iterating over set:");
        for (String item : set) {
            System.out.println("- " + item);
        }
        // Output:
        // - Apple
        // - Cherry

        // 7. Clear Set
        set.clear();
        System.out.println("After clearing: " + set);
        // Output: After clearing: []

        // 8. Set Operations (Union, Intersection, Difference)
        Set<String> setA = new HashSet<String>(Arrays.asList("A", "B", "C"));
        Set<String> setB = new HashSet<String>(Arrays.asList("B", "C", "D"));

        // Union
        Set<String> union = new HashSet<String>(setA);
        union.addAll(setB);
        System.out.println("Union: " + union);
        // Output: Union: [A, B, C, D]

        // Intersection
        Set<String> intersection = new HashSet<String>(setA);
        intersection.retainAll(setB);
        System.out.println("Intersection: " + intersection);
        // Output: Intersection: [B, C]

        // Difference (A - B)
        Set<String> difference = new HashSet<String>(setA);
        difference.removeAll(setB);
        System.out.println("Difference (A - B): " + difference);
        // Output: Difference (A - B): [A]
    }
}

