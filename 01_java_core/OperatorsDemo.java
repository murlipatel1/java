public class OperatorsDemo {
    public static void main(String[] args) {

        int a = 10, b = 3;

        // ✅ Arithmetic Operators
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // ✅ Logical Operators
        boolean x = true;
        boolean y = false;

        System.out.println("x && y = " + (x && y));  // false
        System.out.println("x || y = " + (x || y));  // true
        System.out.println("!x = " + (!x));          // false

        // ✅ Bitwise Operators
        int m = 5;   // 0101
        int n = 3;   // 0011

        System.out.println("m & n = " + (m & n));    // 0001 = 1
        System.out.println("m | n = " + (m | n));    // 0111 = 7
        System.out.println("m ^ n = " + (m ^ n));    // 0110 = 6
        System.out.println("~m = " + (~m));          // bitwise NOT
        System.out.println("m << 1 = " + (m << 1));  // left shift: 10
        System.out.println("m >> 1 = " + (m >> 1));  // right shift: 2
    }
}
