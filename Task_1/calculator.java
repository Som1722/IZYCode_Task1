import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter the first number: ");
                int num1 = scanner.nextInt();
                System.out.print("Enter the second number: ");
                int num2 = scanner.nextInt();
                System.out.print("Enter the operation (+, -, *, /): ");
                char operation = scanner.next().charAt(0);

                switch (operation) {
                    case '+':
                        System.out.println("Result: " + add(num1, num2));
                        break;
                    case '-':
                        System.out.println("Result: " + subtract(num1, num2));
                        break;
                    case '*':
                        System.out.println("Result: " + multiply(num1, num2));
                        break;
                    case '/':
                        System.out.println("Result: " + divide(num1, num2));
                        break;
                    default:
                        System.out.println("Invalid operation! Please try again.");
                }

            } catch (Exception e) {
                System.out.println("Invalid input! Please enter numeric values.");
                scanner.nextLine();
            }
        }
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static double divide(double x, double y) {
        if (y == 0) {
            System.out.println("Error! Cannot divide by zero.");
            return Double.NaN;
        } else {
            return x / y;
        }
    }
}
