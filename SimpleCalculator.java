import java.util.Scanner;

public class  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = input.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char op = input.next().charAt(0);
        System.out.print("Enter second number: ");
        double b = input.nextDouble();

        switch (op) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;
            case '-':
                System.out.println("Result: " + (a - b));
                break;
            case '*':
                System.out.println("Result: " + (a * b));
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Error: cannot divide by zero.");
                } else {
                    System.out.println("Result: " + (a / b));
                }
                break;
            default:
                System.out.println("Error: invalid operator.");
        }
        input.close();
    }
}
