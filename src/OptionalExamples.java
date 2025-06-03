import java.util.Optional;

/*
In Java, Optional is a container object introduced in Java 8 that can hold either a value or null. It is used to represent optional values and helps avoid NullPointerException by providing methods to handle the presence or absence of a value explicitly.
Key Features of Optional:
Presence or Absence: It can either contain a non-null value (present) or be empty (absent).
Avoid Null Checks: It eliminates the need for explicit null checks.
Functional Style: Provides methods like map, filter, and flatMap for functional programming.
Common Methods:
Optional.of(value): Creates an Optional with a non-null value.
Optional.ofNullable(value): Creates an Optional that can hold a null value.
Optional.empty(): Creates an empty Optional.
isPresent(): Checks if a value is present.
ifPresent(Consumer): Executes a block of code if a value is present.
orElse(defaultValue): Returns the value if present, otherwise returns a default value.
orElseGet(Supplier): Returns the value if present, otherwise computes a default value using a Supplier.
orElseThrow(Supplier): Throws an exception if no value is present.
 */
public class OptionalExamples {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Create an Optional with a value
        Optional<String> optionalValue = Optional.of("Hello, Optional!");

        // Check if a value is present
        if (optionalValue.isPresent()) {
            System.out.println("Value is present: " + optionalValue.get());
        }

        // Handle absence of value
        Optional<String> emptyOptional = Optional.empty();
        System.out.println("Value or default: " + emptyOptional.orElse("Default Value"));

        // Use ifPresent to execute code if value exists
        optionalValue.ifPresent(value -> System.out.println("Value using ifPresent: " + value));


        // Example of orElseGet
        Optional<String> optionalValue2 = Optional.empty();
        String valueOrDefault = optionalValue2.orElseGet(() -> "Default Value");
        System.out.println("Value or Default (orElseGet): " + valueOrDefault);

        // Example of orElseThrow
        Optional<String> optionalName = Optional.ofNullable(null);
        try {
            String name = optionalName.orElseThrow(() -> new IllegalArgumentException("Value is missing"));
            System.out.println("Name: " + name);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        // Use map to transform the value
        Optional<Integer> lengthOptional = optionalValue2.map(String::length);
        System.out.println("Length of value: " + lengthOptional.orElse(0));

        // Example of filter()
        Optional<String> optionalValue1 = Optional.of("Hello, Optional!");
        Optional<String> filteredValue = optionalValue1.filter(value -> value.startsWith("Hello"));
        System.out.println("Filtered Value: " + filteredValue.orElse("No match"));

        Optional<String> noMatchValue = optionalValue1.filter(value -> value.startsWith("Hi"));
        System.out.println("Filtered Value (no match): " + noMatchValue.orElse("No match"));

        // Example of flatMap()
        Optional<String> optionalName1 = Optional.of("John");
        Optional<Integer> nameLength = optionalName1.flatMap(name -> Optional.of(name.length()));
        System.out.println("Name Length: " + nameLength.orElse(0));

        Optional<String> emptyOptional1 = Optional.empty();
        Optional<Integer> emptyResult = emptyOptional1.flatMap(name -> Optional.of(name.length()));
        System.out.println("Empty Result: " + emptyResult.orElse(0));


    }
}
