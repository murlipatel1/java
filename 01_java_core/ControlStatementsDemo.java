public class ControlStatementsDemo {
    public static void main(String[] args) {

        int number = 15;

        // ✅ if-else
        if (number > 0) {
            System.out.println("Positive number");
        } else if (number < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Zero");
        }

        // ✅ switch-case
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Another day");
        }

        // ✅ for loop
        System.out.println("For loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // ✅ while loop
        int j = 1;
        System.out.println("While loop:");
        while (j <= 3) {
            System.out.println("j = " + j);
            j++;
        }

        // ✅ do-while loop
        int k = 1;
        System.out.println("Do-While loop:");
        do {
            System.out.println("k = " + k);
            k++;
        } while (k <= 2);
    }
}
