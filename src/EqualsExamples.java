
public class EqualsExamples {

    public static void main(String[] args) {
        // == and .equals() example

        String s3 = "Hello";
        String s4 = "Hello";
        System.out.println("s3 == s4: " + (s3 == s4)); // true (same reference in String pool)
        System.out.println("s3.equals(s4): " + s3.equals(s4)); // true (same content)


        System.out.println("== and .equals() Example:");
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        System.out.println("s1 == s2: " + (s1 == s2)); // false (different memory locations)
        System.out.println("s1.equals(s2): " + s1.equals(s2)); // true (same content)



        // StringBuilder and StringBuffer example
        System.out.println("\nStringBuilder and StringBuffer Example:");
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");
        System.out.println("sb1 == sb2: " + (sb1 == sb2)); // false (different objects in heap)
        System.out.println("sb1.toString().equals(sb2.toString()): " + sb1.toString().equals(sb2.toString())); // true (same content)

        StringBuffer sbf1 = new StringBuffer("Hello");
        StringBuffer sbf2 = new StringBuffer("Hello");
        System.out.println("sbf1 == sbf2: " + (sbf1 == sbf2)); // false (different objects in heap)
        System.out.println("sbf1.toString().equals(sbf2.toString()): " + sbf1.toString().equals(sbf2.toString())); // true (same content)
    }
}