import java.util.Scanner;

public class CalcInt {
    static Scanner scanner = new Scanner(System.in);
    static Scanner scanner1 = new Scanner(System.in);

    static int getNumber() {
        System.out.println("Enter number: ");
        double number;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            System.out.println("Error, enter number!");
            scanner.next();
            number = getNumber();
        }
        return (int) number;

    }

    static String getOperation() {
        System.out.println("Enter operation: ");
        String operation = scanner1.nextLine();
        if (!(operation.equals("+") | operation.equals("-") |
                operation.equals("*") | operation.equals("/"))) {
            System.out.println("Error, enter operation!");
            return getOperation();
        } else {
            return operation;
        }

    }

    static void calc(int number1, String operation, int number2) {
        switch (operation) {
            case "+":
                System.out.println("Result = " + (number1 + number2));
                break;
            case "-":
                System.out.println("Result = " + (number1 - number2));
                break;
            case "*":
                System.out.println("Result = " + (number1 * number2));
                break;
            case "/":
                System.out.println("Result = " + (number1 / number2));
                break;

            default:
                break;
        }

    }
    // Проверка
    // public static void main(String[] args) {
    //     int n1 = getNumber();
    //     String o = getOperation();
    //     int n2 = getNumber();

    //     calc(n1, o, n2);

    // }
}