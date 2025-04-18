class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {

    static void checkBalance(int balance) throws CustomException {
        if (balance < 1000) {
            throw new CustomException("Balance too low!");
        } else {
            System.out.println("Balance is sufficient.");
        }
    }

    public static void main(String[] args) {
        try {
            checkBalance(500);
        } catch (CustomException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        }
    }
}


class ExceptionPropagation {

    static void level1() {
        int result = 10 / 0; // ArithmeticException
        System.out.println("Result: " + result); // This line will not execute
    }

    static void level2() {
        level1(); // exception propagates to here
    }

    static void level3() {
        level2(); // and to here
    }

    public static void main(String[] args) {
        try {
            level3(); // finally caught here
        } catch (ArithmeticException e) {
            System.out.println("Caught exception after propagation: " + e);
        }
    }
}
