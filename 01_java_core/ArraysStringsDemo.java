public class ArraysStringsDemo {
    public static void main(String[] args) {

        // ✅ Arrays
        int[] numbers = {10, 20, 30, 40};

        System.out.println("Array Elements:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // ✅ String operations
        String str1 = "Hello";
        String str2 = "World";

        String combined = str1 + " " + str2;
        System.out.println("Combined: " + combined);

        System.out.println("Length: " + combined.length());
        System.out.println("Upper: " + combined.toUpperCase());
        System.out.println("Contains 'lo': " + combined.contains("lo"));
        System.out.println("Index of 'o': " + combined.indexOf('o'));

        // ✅ StringBuilder (mutable, not thread-safe)
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        System.out.println("StringBuilder: " + sb.toString());

        // ✅ StringBuffer (mutable, thread-safe)
        StringBuffer sf = new StringBuffer("Data");
        sf.append(" Structures");
        System.out.println("StringBuffer: " + sf.toString());
    }
}
