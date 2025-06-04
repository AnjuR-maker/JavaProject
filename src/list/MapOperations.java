package collections.list;

import java.util.*;
/*
Operation	Method
Add or Update Entry	put(K, V)
Get Value	get(K)
Remove Entry	remove(K)
Check for Key	containsKey(K)
Check for Value	containsValue(V)
Map Size	size()
Get Keys	keySet()
Get Values	values()
Get Entries	entrySet()
Replace Value	replace(K, newValue)
Clear Map	clear()
 */
public class MapOperations {
    public static void main(String[] args) {
        // 1. Create and Add Elements
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Alice", 30);
        map.put("Bob", 25);
        map.put("Charlie", 35);

        System.out.println("Initial map: " + map);
        // Output (order may vary): Initial map: {Alice=30, Bob=25, Charlie=35}

        // 2. Overwrite Existing Key
        map.put("Bob", 28);  // Updates Bob's value
        System.out.println("After updating Bob: " + map);
        // Output: After updating Bob: {Alice=30, Bob=28, Charlie=35}

        // 3. Get Value by Key
        int age = map.get("Alice");
        System.out.println("Alice's age: " + age);
        // Output: Alice's age: 30

        // 4. Remove by Key
        map.remove("Charlie");
        System.out.println("After removing Charlie: " + map);
        // Output: After removing Charlie: {Alice=30, Bob=28}

        // 5. Check if Key Exists
        boolean hasBob = map.containsKey("Bob");
        System.out.println("Map has key 'Bob'? " + hasBob);
        // Output: Map has key 'Bob'? true

        // 6. Check if Value Exists
        boolean hasValue25 = map.containsValue(25);
        System.out.println("Map has value 25? " + hasValue25);
        // Output: Map has value 25? false

        // 7. Size of Map
        System.out.println("Map size: " + map.size());
        // Output: Map size: 2

        // 8. Iterate over Keys
        System.out.println("Keys:");
        for (String key : map.keySet()) {
            System.out.println("- " + key);
        }
        // Output:
        // - Alice
        // - Bob

        // 9. Iterate over Values
        System.out.println("Values:");
        for (Integer value : map.values()) {
            System.out.println("- " + value);
        }
        // Output:
        // - 30
        // - 28

        // 10. Iterate over Key-Value Pairs
        System.out.println("Entries:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("- " + entry.getKey() + " = " + entry.getValue());
        }
        // Output:
        // - Alice = 30
        // - Bob = 28

        // 11. Replace Value
        map.replace("Alice", 32);
        System.out.println("After replacing Alice's age: " + map);
        // Output: After replacing Alice's age: {Alice=32, Bob=28}

        // 12. Clear All
        map.clear();
        System.out.println("After clearing: " + map);
        // Output: After clearing: {}
    }
}

