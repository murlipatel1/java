public class UncheckedExceptionDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
        } finally {
            System.out.println("Always executes (finally block).");
        }
    }
}


class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            String[] arr = {"Java", "Python"};
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException

            int a = 5 / 0; // ArithmeticException (won't reach here)
            System.out.println("Result: " + a);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index issue: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Math issue: " + e);
        } finally {
            System.out.println("Final cleanup if needed.");
        }
    }
}
